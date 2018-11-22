import java.sql.*;
import java.util.*;
public class ConnectionManger {
    static Connection con;
    static String url;
    static String dpassword;
    static String driver;
   static String user;

    public static Connection getConnection()
    {

        try
        {
             url = "jdbc:mysql://localhost:3306/website";
             driver="com.mysql.jdbc.Driver";
             dpassword="website";
             user="root";


            try
            {
                Class.forName(driver);

                con = DriverManager.getConnection(url,user,dpassword);
                System.out.println("done");
            }

            catch (SQLException ex)
            {
                System.out.println("no");

                ex.printStackTrace();
            }
        }

        catch(ClassNotFoundException e)
        {
            System.out.println("no2");

            System.out.println(e);
        }

        return con;
    }

    /*public static void main(String[] args) {
        Connection c=ConnectionManger.getConnection();
    }*/

}
