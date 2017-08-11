import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 15600 on 2017/5/25.
 */
public class jsonTest {
    public static void main(String[] args) {
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("name","1") ;
//        jsonObject.put("age","1");
//        JSONArray jsonArray=new JSONArray();
//        jsonArray.add(jsonObject);
//        System.out.println("1111"+jsonArray.toString());
//        JSONObject jsonObject1=new JSONObject();
//        jsonObject.put("age","2");
//        jsonObject.put("name",2);
//        jsonArray.add(jsonObject);
//        System.out.println("2222"+jsonArray.toString());
//        for(int i=0;i<jsonArray.size();i++){
//            System.out.println(jsonArray.get(i).toString());
//        }
////        JSONUtils jsonUtils=new JSONUtils();
//        ArrayList<JSONArray> list=new ArrayList<>();
//        list.add(jsonArray);
//        System.out.println(list.toString());/
//        JSONObject jsonObject1=new JSONObject();
//        jsonObject1.put("code",200);
//        jsonObject1.put("info",list.toString());
//        System.out.println(jsonObject1.toString());
//        String res=jsonObject1.toString();
//        JSONObject jsonObject2=JSONObject.parseObject(res);
//        String info=jsonObject2.getString("info");
//        ArrayList<JSONArray>list1
//        JSONObject jsonObject = JSON.parseObject("{\"code\":200,\"dbs\":[\"app\",\"data_analysis\",\"default\",\"dwa\",\"dwd\",\"dwm\",\"dwr\",\"ods\",\"sgk\",\"test\"],\"count\":12}");
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("code",200);
//        ArrayList<String> t=new ArrayList<>();
//        t.add("1");
//        t.add("2");
//        jsonObject.put("dbs",t);
//        System.out.println(jsonObject);
        JSONObject jsonObject1=JSON.parseObject("{\"code\":200,\"dbs\":[\"1\",\"2\"]}");
        JSONArray jsonArray=(JSONArray) jsonObject1.get("dbs");
        System.out.println(jsonArray);
        for(int i=0;i<jsonArray.size();i++){
            System.out.println(jsonArray.get(i));
        }
    }
}
