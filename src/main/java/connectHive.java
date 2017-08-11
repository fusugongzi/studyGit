import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.sql.*;

/**
 * Created by 15600 on 2017/4/26.
 */
public class connectHive {
    public static void main(String[] args) {
        try {
            Class.forName("org.apache.hive.jdbc.HiveDriver");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("驱动未找到！");
        }
        System.out.println("wzz");
        Connection connection=null;
        String url="jdbc:hive2://172.17.1.118:10000/";
        JSONObject jsonObject=new JSONObject();
        JSONArray jsonArray=new JSONArray();
        try{
            connection=DriverManager.getConnection(url,"","");
            Statement statement = ((Connection)connection).createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            try {
                String query="drop table if EXISTS metaData_test.person";
//                Integer result=statement.executeUpdate(query);
                boolean result=statement.execute(query);
                System.out.println(result);
            }catch (SQLException e){
                System.out.println("发生错误");
                e.printStackTrace();
            }
            //            statement.execute("show tables from  wzz");
//            ResultSet rs=statement.getResultSet();
//           // HiveQueryResultSet
//            int count=0;
//            while(rs.next()){
//                count++;
//            }
//            System.out.println("count is "+count);
//            rs.beforeFirst();
////           rs.absolute(2); //hive不支持
//           // rs.afterLast()
//            System.out.println("aaaa");
//            System.out.println(rs.getRow());
//            count=rs.getRow();
//            System.out.println("count is "+count);
//            boolean b=false;
//            while (rs.next()){
//                if(rs.getString(1).startsWith("# Detailed Table Information")){
//                    b=false;
//                }
//               if(b){
//                   if(rs.getString(2)!=null) {
//                      JSONObject json=new JSONObject();
//                      json.put("col",rs.getString(1));
//                      json.put("type",rs.getString(2));
//                      json.put("comment",rs.getString(3));
//                       System.out.println(json.toString());
//                   }
//                }
//                if(rs.getString(1).startsWith("# col_name")){
//                    b=true;
//                }
//
//            }

        }
          catch (Exception e){
            e.printStackTrace();
        }

    }
}
