

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15600 on 2017/6/2.
 */
public class mysqlTest {
    public static void main(String[] args) {
        String host="172.17.1.103";
        int port=3306;
        String user="root";
        String pwd="123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            String url="jdbc:mysql://172.17.1.103:3306";
            Connection connection= DriverManager.getConnection(url,user,pwd);
            Statement statement=connection.createStatement();
            String sql="show databases";
            ResultSet resultSet=statement.executeQuery(sql);
            resultSet.last();
//            System.out.println(resultSet.getRow());
            List<String> dbList=new ArrayList<>() ;
            resultSet.beforeFirst();
            while (resultSet.next()){
//                System.out.println(resultSet.getString(1));
                dbList.add(resultSet.getString(1));
            }
//            System.out.println(dbList.size());
            int start=2;
            int size=5;
            dbList= dbList.subList(start,start+size);
            String jsonObject= JSON.toJSONString(dbList);
            System.out.println(dbList);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
