import java.sql.*;
import java.util.*;

public class ConnectionManger {
    static Connection con;
    static String url;
    static String dpassword;
    static String driver;
    static String user;

    /**
     * thisclass is responsible to setup the Mysql database
     */
    public static Connection getConnection() {

        try {
            url = "jdbc:mysql://localhost:3306/website";
            driver = "com.mysql.jdbc.Driver";
            dpassword = "website";
            user = "root";


            try {
                Class.forName(driver);

                con = DriverManager.getConnection(url, user, dpassword);
            } catch (SQLException ex) {

                ex.printStackTrace();
            }
        } catch (ClassNotFoundException e) {

        }

        return con;
    }


}
