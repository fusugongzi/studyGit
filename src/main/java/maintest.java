//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.mongodb.BasicDBObject;
//import org.apache.commons.collections.map.HashedMap;
//import org.codehaus.jackson.map.util.ObjectBuffer;
//
//import java.lang.reflect.Array;
//import java.net.URLDecoder;
//import java.nio.Buffer;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
///**
// * Created by 15600 on 2017/4/24.
// */
//public class maintest {
//    public static void main(String[] args) {
//        MongoUtil mongoUtil=new MongoUtil("172.17.1.109",27017);
//        ArrayList<String> dbs=mongoUtil.getDbs();
////        for(String s:dbs){
////            System.out.println(s);
////        }
////          boolean b=mongoUtil.createDB("0626test");
////        System.out.println(b);
////        boolean c=mongoUtil.createCollection("0626test","wzz");
//        boolean c=mongoUtil.createDB("0626test");
//        System.out.println(c);
////          System.out.println(b);
////        HashMap<String,Object> hashMap=new HashMap<>();
////        hashMap.put("dsId","12345");
////        hashMap.put("name","wzz");
////        boolean b=mongoUtil.insertToTable("metaData","dataSource",hashMap);
////        System.out.println(b);
////        ArrayList<BasicDBObject> list= mongoUtil.readDataFromCollection("metaData","dataSource");
////        for(BasicDBObject basicDBObject:list){
////            System.out.println(basicDBObject.get("dsId"));
////        }
////          boolean b=mongoUtil.deleteFromCollection("metaData","dataSource","dsId","12345");
////          System.out.println(b);
//
////        ArrayList<String> collections=mongoUtil.retriveDB("metaData");
////        for(String s:collections){
////            System.out.println(s);
////        }
//
////        boolean b=mongoUtil.deleteColFromDB("metaData","people");
////        System.out.println(b);
//
////        boolean b=mongoUtil.createCollection("metaData","people");
////        System.out.println(b);
//    }
//}
