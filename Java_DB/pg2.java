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

            // Create database if it doesn't exist
            String dbName = "EmployeeDB";
            String createDB = "CREATE DATABASE IF NOT EXISTS " + dbName;
            stmt.executeUpdate(createDB);
            System.out.println("Database created: " + dbName);

            // Connect to the specific database
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

            // Insert dummy employee data
            String insertData = "INSERT INTO employee (emp_name, designation, salary) VALUES " +
                                "('Alice Johnson', 'Software Engineer', 75000.00)," +
                                "('Bob Smith', 'Project Manager', 85000.00)," +
                                "('Carol Davis', 'Data Analyst', 65000.00)," +
                                "('David Lee', 'UX Designer', 70000.00)," +
                                "('Eva Brown', 'HR Manager', 60000.00)";
            int rowsInserted = stmt.executeUpdate(insertData);
            System.out.println(rowsInserted + " rows inserted into 'employee' table.");

            // Close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
