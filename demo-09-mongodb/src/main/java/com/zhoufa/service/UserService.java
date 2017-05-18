package com.zhoufa.service;

import com.alibaba.fastjson.JSON;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.zhoufa.model.User;
import com.zhoufa.mongo.IMongoService;
import org.bson.BsonInt32;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/9.
 */
@Component
public class UserService {

    private static final String dbName = "myApp";
    private static final String collectionName = "users";

    @Autowired
    private IMongoService mongoService;

    public void saveUser(User user) {
        Document model = new Document();
        model.put("name", user.getName());
        model.put("age", new BsonInt32(user.getAge()));
        model.put("gender", user.isGender());
        mongoService.insert(dbName, collectionName, model);
    }

    public List<User> findAll() {
        // 查询全部，不用写条件
        // DBObject query = new BasicDBObject();

        Bson query = new Document();

        MongoCollection collection = mongoService.getCollection(dbName, collectionName);
        FindIterable iterable = collection.find(query);
        if (null == iterable) {
            return new ArrayList<>();
        }

        List<Object> users = new ArrayList<>();
        MongoCursor cursor = iterable.iterator();
        while (cursor.hasNext()) {
            Object user = cursor.next();
            users.add(user);
        }
        String json = JSON.toJSONString(users);
        List<User> ret = JSON.parseArray(json, User.class);
        return ret;
    }

}
