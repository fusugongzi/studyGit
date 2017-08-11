import com.mongodb.*;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ImportResource({"applicationContext.xml"})
/**
 * Created by 15600 on 2017/5/8.
 */
public class mongoTest {
    public static void main(String[] args) {
        try {
            MongoClient mongoClient=new MongoClient("172.17.1.109", 27017);
            DB db = mongoClient.getDB("admin");
//            boolean auth = db.authenticate(""," ".toCharArray());
//            MongoCredential credential = MongoCredential.createCredential("wzz", "wzztest", "123".toCharArray());
//            ServerAddress addr = new ServerAddress("172.17.1.109", 27017);
//            MongoClient mongoClient = new MongoClient(addr, Arrays.asList(credential));
            for (String db1 : mongoClient.getDatabaseNames()) {
                System.out.println(db1);
            }

//            for (String name : db.getCollectionNames()) {
//            DB db = mongoClient.getDB("wzztest");
//            //.out.println(name);
//            }
//            String dbName = "wzztest";
//            DB db = mongoClient.getDB(dbName);
//            DBCollection dbCollection = db.getCollection("people");
//            Object age = 55;
//            Object status = "A";
//            //  String query = "function (){return this.age==" + age + "&& this.status==" + status + " };";
//            //  System.out.println("query is " + query);
//            StringBuffer sb = new StringBuffer("function (){return ");
//            sb.append(" this.age==").append(age).append("&&this.status==").append(status).append("};");
//            //  String query=sb.toString();
//            String query = " function (){return this.age=='22' && this.status=='A'};";
//            System.out.println("query is " + query);
//            //String query=" function (){return this.age==55&& this.status=='A' };";
//            BasicDBObject cond = new BasicDBObject();//单个条件
//            cond.put("$where", query);
//            DBCursor dbCursor = dbCollection.find(cond);
//            List<DBObject> list = dbCursor.toArray();
//            System.out.println(list.size());
//            for (DBObject dbObject : list) {
//                System.out.println(dbObject.toString());
//            }
//            dbCollection.find();
//            for (String name : db.getCollectionNames()) {
//                System.out.println(name);
//         }
//            DBObject options = BasicDBObjectBuilder.start().add("capped", true).add("size", 100).get();
//            db.createCollection("test",options );//创建集合

//            BasicDBList condList = new BasicDBList();//条件集合
//            BasicDBObject cond = new BasicDBObject();//单个条件
//            cond.put("status","A");
//            String age="age";
//            Object value=55;
//            System.out.println(value.getClass());
//            cond.put(age,value);
//            DBCursor dbCursor=dbCollection.find(cond);
////            System.out.println(dbCursor.toString());
////            while(dbCursor.hasNext()){
////                DBObject dbObject1=dbCursor.next();
////                System.out.println(dbObject1.get("_id"));
////            }
//            List<DBObject> list=dbCursor.toArray();
//            System.out.println(list.size());
//            for(DBObject dbObject:list){
//                System.out.println(dbObject.toString());
//            }
//            DBCollection dbCollection=db.getCollection("people");
//            dbCollection.rename("people123");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
