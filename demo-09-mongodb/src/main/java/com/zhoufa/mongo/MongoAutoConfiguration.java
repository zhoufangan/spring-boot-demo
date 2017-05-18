package com.zhoufa.mongo;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/9.
 */
@SuppressWarnings("ALL")
@Configuration
@AutoConfigureAfter(IMongoProperties.class)
public class MongoAutoConfiguration {

    @Autowired
    private IMongoProperties mongoProperties;

    @Bean
    @Primary
    public MongoClient mongoClient() {
        // 创建options
        MongoClientOptions options = MongoClientOptions.builder().build();
        MongoClientOptions.Builder builder = options.builder();
        builder.maxWaitTime(mongoProperties.getMaxWaitTime());
        builder.connectionsPerHost(mongoProperties.getConnectionPerHost());
        builder.connectTimeout(mongoProperties.getConnectionTimeout());
        builder.socketKeepAlive(true);
        options = builder.build();

        // 创建连接地址列表
        List<ServerAddress> addresses = new ArrayList<>();
        String hosts = mongoProperties.getHosts();
        String[] hostInfos = hosts.split("\\s*,\\s*");
        for (String hostInfo : hostInfos) {
            try {
                String[] hp = hostInfo.split(":");
                ServerAddress addr = new ServerAddress(hp[0], Integer.valueOf(hp[1]));
                addresses.add(addr);
            } catch (Exception e) {
                System.out.println("init-mongo-error,hosts=" + hosts + ",target host is " + hostInfo);
                throw e;
            }
        }

        // 用户认证信息
        // List<MongoCredential> mongoCredentials = new ArrayList<>();

        MongoClient client = new MongoClient(addresses, options);
        return client;
    }

    // @Bean
    public Mongo mongo() {
        String hosts = mongoProperties.getHosts();
        if (hosts == null || "".equals(hosts.trim()) || "NULL".equals(hosts.trim())) {
            System.out.println("no mongo hosts was configed,this mongo service will be unavaliable");
            return null;
        }

        // 集群配置，IP:port,IP:port
        String[] hostInfos = hosts.split("\\s*,\\s*");
        List<ServerAddress> addrs = new ArrayList<>(hostInfos.length);
        for (String hostInfo : hostInfos) {
            try {
                String[] hp = hostInfo.split(":");
                ServerAddress addr = new ServerAddress(hp[0], Integer.valueOf(hp[1]));
                addrs.add(addr);
            } catch (Exception e) {
                System.out.println("init-mongo-error,hosts=" + hosts + ",target host is " + hostInfo);
                throw e;
            }
        }
        MongoOptions opt = new MongoOptions();
        // opt.autoConnectRetry = true;
        opt.socketKeepAlive = true;
        opt.readPreference = ReadPreference.primaryPreferred();
        opt.connectionsPerHost = mongoProperties.getConnectionPerHost();
        opt.connectTimeout = mongoProperties.getConnectionTimeout();
        opt.maxWaitTime = mongoProperties.getMaxWaitTime();
        opt.writeConcern = WriteConcern.SAFE;
        Mongo mongo = new Mongo(addrs, opt);
        System.out.println("mongo " + hosts + " replStatus:" + mongo.getReplicaSetStatus());
        return mongo;
    }

}
