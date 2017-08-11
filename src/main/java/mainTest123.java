import com.alibaba.fastjson.JSONObject;

/**
 * Created by 15600 on 2017/7/12.
 */
public class mainTest123 {
    public static void main(String[] args) {
        animal animal1=new animal();
        animal1.setAge(1);
        animal1.setType(1);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("type",animal1.getType());
        System.out.println(jsonObject.toJSONString());
    }
}
