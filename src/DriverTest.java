import java.sql.*;

public class DriverTest {
    public static void main(String[] args) {
        //test apakah database (localhost) sudah tersambung dengan VScode
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            Statement myStatement = myConn.createStatement();
            ResultSet myResultSet = myStatement.executeQuery("select * from employees");

            while (myResultSet.next()) {
                System.out.println(myResultSet.getString("Username")+ ","+myResultSet.getString("Password"));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
