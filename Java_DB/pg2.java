import java.sql.*;

public class DATAc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "password";

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL server (without specifying a database yet)
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL Server!");

            Statement stmt = con.createStatement();

            // Create a database if it doesn't exist
            String dbName = "EmployeeDB";
            String createDB = "CREATE DATABASE IF NOT EXISTS " + dbName;
            stmt.executeUpdate(createDB);
            System.out.println("Database created: " + dbName);

            // Reconnect to the specific database
            con = DriverManager.getConnection(url + dbName, user, password);
            stmt = con.createStatement();

            // Create 'employee' table if it doesn't exist
            String createTable = "CREATE TABLE IF NOT EXISTS employee (" +
                                 "emp_id INT PRIMARY KEY AUTO_INCREMENT, " +
                                 "emp_name VARCHAR(100) NOT NULL, " +
                                 "designation VARCHAR(50), " +
                                 "salary DECIMAL(10,2))";
            stmt.executeUpdate(createTable);
            System.out.println("Table 'employee' created successfully!");

            // Close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
