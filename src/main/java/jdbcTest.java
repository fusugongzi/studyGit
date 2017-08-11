import com.alibaba.fastjson.JSON;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15600 on 2017/8/4.
 */
public class jdbcTest {
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
        Connection connection=null;
        try {
            String url="jdbc:mysql://172.17.1.103:3306";
            connection= DriverManager.getConnection(url,user,pwd);
            connection.setAutoCommit(false);//设置不自动提交
            Statement statement=connection.createStatement();
            //下面这条sql可以执行成功
            String sql="insert into test.user (id,name,age,password) values (5,'wzz',1,'wzz');";
            int result=statement.executeUpdate(sql);
            System.out.println("res is "+result);
            //下面这条sql执行失败，导致所有sql语句未生效
            String sql1="insert into test.user (id,name,age,password) values (5,'wzz',1,'wzz');";
            int result1=statement.executeUpdate(sql1);
            connection.commit();//提交sql语句
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
