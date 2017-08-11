import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.avro.data.Json;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Created by 15600 on 2017/6/1.
 */
public class hiveTest {
    public static void main(String[] args) {
        try {
            Class.forName("org.apache.hive.jdbc.HiveDriver");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("驱动未找到！");
        }
        Connection connection = null;
        String url = "jdbc:hive2://172.17.1.118:10000/";
        try {
            connection = DriverManager.getConnection(url, "", "");
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            String[] types = {"TABLE"};
            ResultSet resultSet = databaseMetaData.getTables(null, "wzz", null, types);
            int count = 0;
            JSONArray jsonArray = new JSONArray();
            jsonArray.clear();
            while (resultSet.next()) {
//                String tt = resultSet.getString("TABLE_NAME");
//                table.put("table",tt);
//                table.put("comment",resultSet.getString("REMARKS"));
//                jsonArray.add(table);
//                System.out.println(resultSet.getString("TABLE_NAME"));
                JSONObject table = new JSONObject();
                table.put("table", resultSet.getString("TABLE_NAME"));
                table.put("comment", resultSet.getString("REMARKS"));
                jsonArray.add(table);
                count++;
            }
            System.out.println("count is " + count);
            System.out.println(jsonArray);
//            System.out.println("112233"+jsonArray);
            JSONArray jsonArray1=JSONArray.parseArray ((jsonArray.subList(1,3).toString()));
            System.out.println(jsonArray1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
