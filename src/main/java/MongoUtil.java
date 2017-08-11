//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.mongodb.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoCursor;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.result.UpdateResult;
//import org.bson.Document;
//import org.bson.conversions.Bson;
//
///**
// * Created by 15600 on 2017/6/16.
// */
//public class MongoUtil {
//
//    private static MongoClient mongoClient;
//
//    public MongoUtil(String host,int port){
//        try {
//            this.mongoClient = new MongoClient(host, port);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //得到mongo的数据库集合
//    public ArrayList<String> getDbs(){
//        ArrayList<String> dbs=new ArrayList<String>();
//        dbs.clear();
//        for (String db1 : this.mongoClient.getDatabaseNames()) {
//           dbs.add(db1);
//        }
//        return dbs;
//    }
//
//    //新建一个mongo数据库,若数据库已经存在返回false
//    public boolean createDB(String dbName){
//        ArrayList<String> dbs=getDbs();
//        if (dbs.contains(dbName)){
//            return  false;
//        }else {
//            mongoClient.dropDatabase(dbName);
//            return true;
//        }
//    }
//
////    往集合插入一条数据
//    public boolean insertToTable(String dbName, String tableName,HashMap<String,Object> hashMap){
//       DB db=mongoClient.getDB(dbName);
//       DBCollection dbCollection=db.getCollection(tableName);
//       BasicDBObject document=new BasicDBObject();
////       document.put("score","100");
//        for(String key:hashMap.keySet()){
//            document.put(key,hashMap.get(key));
//        }
//       dbCollection.insert(document);
//        return true;
//    }
//
//    //读取一个集合中的所有数据
//    public ArrayList<BasicDBObject> readDataFromCollection(String dbName,String tableName){
//        DB db=mongoClient.getDB(dbName);
//        DBCollection dbCollection=db.getCollection(tableName);
//        BasicDBObject document=new BasicDBObject();
//        DBCursor dbCursor = dbCollection.find();
//        ArrayList<BasicDBObject> list=new ArrayList<>();
//        while(dbCursor.hasNext()){
//            BasicDBObject basicDBObject = (BasicDBObject) dbCursor.next();
//            list.add(basicDBObject);
//        }
//        return list;
//    }
//
//    //根据key 和 value 从集合删除数据
//    public boolean deleteFromCollection (String dbName,String tableName,String key, Object value){
//        DB db=mongoClient.getDB(dbName);
//        DBCollection dbCollection=db.getCollection(tableName);
//        BasicDBObject doc = new BasicDBObject();
//        doc.put(key, value);
//        dbCollection.remove(doc);
//        return true;
//    }
//
//    /**
//     * 替换一条数据
//     * @param dbName
//     * @param collectionName
//     * @param filters
//     * @param bson
//     * @return
//     */
//    public   Document replace(String dbName, String collectionName, Bson filters, Document bson){
//        MongoDatabase db = mongoClient.getDatabase(dbName);
//        MongoCollection<Document> collection = db.getCollection(collectionName);
//        return collection.findOneAndReplace(filters,bson);
//    }
//
//    //查询一个数据库的所有集合
//    public ArrayList<String> retriveDB(String dbName){
//        DB db=mongoClient.getDB(dbName);
//        ArrayList<String> collections=new ArrayList<>();
//        for(String name:db.getCollectionNames()){
//            collections.add(name);
//        }
//        return collections;
//    }
//
//    //删除数据库中的一个集合
//    public boolean deleteColFromDB(String dbName,String collectionName){
//        DB db=mongoClient.getDB(dbName);
//        DBCollection dbCollection=db.getCollection(collectionName);
//        dbCollection.drop();
//        return true;
//    }
//
//    //新建一个集合
//    public boolean createCollection(String dbName,String collectionName){
//        DB db=mongoClient.getDB(dbName);
//        DBObject options = BasicDBObjectBuilder.start().add("capped", true).add("size", 100).get();
//        db.createCollection(collectionName,options);
//        return true;
//    }
//
//    public UpdateResult update(String dbName, String collectionName, BasicDBObject searchQuery, Document bson){
//        MongoDatabase db = mongoClient.getDatabase(dbName);
//        MongoCollection<Document> collection = db.getCollection(collectionName);
//        return collection.replaceOne(searchQuery,bson);
//    }
//
//    public static List<Document> find(String dbName,String collectionName,Bson filters){
//        MongoDatabase db = mongoClient.getDatabase(dbName);
//        MongoCollection collection = db.getCollection(collectionName);
//        List<Document> list = new LinkedList<>();
//        MongoCursor<Document> cursor=collection.find(filters).iterator();
//        while (cursor.hasNext()){
//            list.add(cursor.next());
//        }
//        return list;
//    }
//
//    //根据dsId取得记录，更改name和desc字段后返回document
//    public static Document changeNameOrDescByDsId(String dsId,String name,String desc){
//
//    }
//}
