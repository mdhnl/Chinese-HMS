package Database;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {
    private static DBConnection dbconnection;
    
    private Connection connection;
    
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db", "root", "STIRosario10");
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        return dbconnection==null? (dbconnection = new DBConnection()):dbconnection;
    }
    
    public Connection getDBConnection() {
        return connection;
    }
    
}
