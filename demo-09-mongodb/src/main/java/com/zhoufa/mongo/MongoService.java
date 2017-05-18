package com.zhoufa.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/9.
 */
@Component
public class MongoService implements IMongoService {

    @Autowired
    private MongoClient mongoClient;

    @Override
    public MongoCollection getCollection(String dbName, String collectionName) {
        MongoDatabase db = mongoClient.getDatabase(dbName);
        MongoCollection collection = db.getCollection(collectionName);
        return collection;
    }

    @Override
    public MongoCollection getCollection4Read(String dbName, String collectionName) {
        MongoCollection dbCollection = getCollection(dbName, collectionName);
        // 目前从库只有单台机器,这样如果从库挂掉,不能实现高可用,考虑以后多台从库再打开
        // dbCollection.setReadPreference(ReadPreference.secondaryPreferred());
        return dbCollection;
    }

    @Override
    public void remove(String dbName, String collectionName) {
        remove(dbName, collectionName, null, null);
    }

    @Override
    public void remove(String dbName, String collectionName, Document query) {
        remove(dbName, collectionName, query, null);
    }

    @Override
    public void remove(String dbName, String collectionName, Document query, Document fields) {
        MongoCollection dbc = getCollection(dbName, collectionName);
//        DBObject dbObj = dbc.findAndModify(query, fields, null, true, null, true, false);
    }

    @Override
    public void insert(String dbName, String collectionName, Document obj) {
        MongoCollection dbc = getCollection(dbName, collectionName);
        dbc.insertOne(obj);
    }

    @Override
    public void insertBatch(String dbName, String collectionName, List<Document> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        MongoCollection dbc = getCollection(dbName, collectionName);
        dbc.insertMany(list);
    }

}
