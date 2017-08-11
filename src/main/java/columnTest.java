import java.sql.*;

/**
 * Created by 15600 on 2017/6/2.
 */
public class columnTest {
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
            ResultSet resultSet=databaseMetaData.getColumns(null,"test","t1",null);
            int count=0;
            while(resultSet.next()){
                count++;
                System.out.println(resultSet.getString("COLUMN_NAME"));
                System.out.println(resultSet.getString("TYPE_NAME"));
                System.out.println(resultSet.getString("REMARKS"));

            }
            System.out.println("count is "+count);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
