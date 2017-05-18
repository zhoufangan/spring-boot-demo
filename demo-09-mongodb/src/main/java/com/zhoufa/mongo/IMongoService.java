package com.zhoufa.mongo;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.List;

/**
 * @author zhoufangan Created by zhoufangan on 17/3/9.
 */
public interface IMongoService {

    /**
     * 获取mongodb collection
     *
     * @param dbName
     * @param collectionName
     * @return
     */
    MongoCollection getCollection(String dbName, String collectionName);


    /**
     * 从重库读取数据
     *
     * @param dbName
     * @param collectionName
     * @return
     */
    MongoCollection getCollection4Read(String dbName, String collectionName);

    /**
     * 从一个集合里删除一条记录,并返回被删的记录
     *
     * @param dbName         数据库名
     * @param collectionName 集合名
     * @return 被删除的记录
     */
    void remove(String dbName, String collectionName);

    /**
     * 从一个集合里删除一个记录，并返回被删除的记录
     *
     * @param dbName         数据库名
     * @param collectionName 集合名
     * @param query          删除条件,若集合里有多个记录符合条件,则只会删除并返回第一个记录
     * @return 取回的记录
     */
    void remove(String dbName, String collectionName, Document query);

    /**
     * 从一个集合里删除一个记录，并返回被删除的记录
     *
     * @param dbName         数据库名
     * @param collectionName 集合名
     * @param query          删除条件,若集合里有多个记录符合条件,则只会删除并返回第一个记录
     * @param fields         要取回的字段
     * @return 取回的记录
     */
    void remove(String dbName, String collectionName, Document query, Document fields);


    /**
     * 插入数据
     *
     * @param dbName
     * @param collectionName
     * @param obj
     * @return
     */
    void insert(String dbName, String collectionName, Document obj);

    /**
     * 批量插入数据
     *
     * @param dbName
     * @param collectionName
     * @param list
     */
    void insertBatch(String dbName, String collectionName, List<Document> list);

}
