import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {/**user database access object*/
    /**
     * userLogin method is responsible to return isCanLog --look at User class variables--
     * that in case isCanLog was true it will redirect the user to profile page
     */
    public static boolean userLogin(String name, String password, User user) {

        Connection con = ConnectionManger.getConnection();
        String employerSqlLogin = "select USERNAME,USERPASS,USERTYPE from USER where USERNAME='" + name + "'" + " and USERPASS='" + password + "'";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery(employerSqlLogin);

            if (rs1.next()) {
                /**valid user*/
                user.setCanLog(true);
                String type = rs1.getString("usertype");

                return user.isCanLog();

            } else {
                /**Invalid user name or password */
                user.setCanLog(false);
                return user.isCanLog();


            }
        } catch (Exception e) {

        }
        return user.isCanLog();
    }


}
