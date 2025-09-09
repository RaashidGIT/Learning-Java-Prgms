import java.sql.*;

public class DATAB {
    public static void main(String[] args) {
        
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/DB";  // Replace 'DB' with your actual database name
        String user = "root";                           // MySQL username
        String password = "password";                   // MySQL password

        try {
            // Load and register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            // Create a statement to execute SQL queries
            Statement stmt = con.createStatement();

            // Execute a SQL SELECT query to retrieve data from 'students' table
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Loop through the result set and print each row
            while (rs.next()) {
                int id = rs.getInt("id");        // Get student ID
                String name = rs.getString("name");  // Get student name
                int age = rs.getInt("age");      // Get student age

                // Print student details
                System.out.println(id + " | " + name + " | " + age);
            }

            // Optional: Close connection and resources (not shown here)

        } catch (Exception e) {
            // Print error message if something goes wrong
            System.out.println("Error!");
            e.printStackTrace(); // Optional: Print full error stack for debugging
        }
    }
}
