package test.dbTest;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Leith on 2017/2/6.
 */
public class DbConnectTest {
    public static void main(String[] args) throws Exception,SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=lzh&password=123456");
        java.sql.Statement sql=conn.createStatement();
        java.sql.ResultSet rs=sql.executeQuery("select * from person");
        while(rs.next())
        {
            System.out.println(rs.getString(2));
        }
    }
}
