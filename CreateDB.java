import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB   {
    public static void main(String[] args) {
        // JDBC driver name and database URL
        String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/demo";

        // Database credentials
        String USER = "root";
        String PASS = "vikas27";

        Connection conn = null;
        
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);
            
            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // Perform database operations
            
            // Close the connection
            conn.close();
            System.out.println("Connection closed.");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Finally block to close resources
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
