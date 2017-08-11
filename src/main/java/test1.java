import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by 15600 on 2017/5/25.
 */
public class test1 {
    public static void main(String[] args) {
        String result = "{\"code\":200,\"datasource\":[{\"info\":[{\"dsId\":\"6d9e4d405e1844e5a0a5b810289ca252\",\"modifyAble\":0},{\"name\":\"测试mysql\",\"modifyAble\":1},{\"desc\":\"测试muysql数据库\",\"modifyAble\":1},{\"host\":\"172.17.1.109\",\"modifyAble\":0},{\"port\":\"27017\",\"modifyAble\":0},{\"user\":\"\",\"modifyAble\":0},{\"pwd\":\"\",\"modifyAble\":0},{\"type\":3,\"modifyAble\":0}]}]}";
        JSONObject jsonObject=JSONObject.parseObject(result);
        JSONArray datasource=(JSONArray) jsonObject.get("datasource");
        for(int i=0;i<datasource.size();i++){
            JSONObject jsonObject1=(JSONObject) datasource.get(i);
            JSONArray res1=(JSONArray) jsonObject1.get("info");
            for(int j=0;j<res1.size();j++){
                JSONObject jsonObject2=(JSONObject) res1.get(j);
                System.out.println(jsonObject2);
            }
        }

    }
}
