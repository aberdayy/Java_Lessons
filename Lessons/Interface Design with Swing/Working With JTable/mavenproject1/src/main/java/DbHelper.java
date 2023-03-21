
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private final String username = "root";
    private final String pass = "admin";
    private final String dbUrl = "jdbc:mysql://localhost:3306/world?zeroDateTimeBehavior=CONVERT_TO_NULL";
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,username,pass);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("error => " + exception.getMessage());
        System.out.println("Error code => " + exception.getErrorCode());
    }
}
