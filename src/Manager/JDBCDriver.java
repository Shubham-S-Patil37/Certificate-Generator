package Manager;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDriver {
    static Connection con;
    public static Connection connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/certificategenerator";
            con = DriverManager.getConnection(url, "root", "root");
            System.out.println("conn built");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String args[]) {
        connection();
    }
}
