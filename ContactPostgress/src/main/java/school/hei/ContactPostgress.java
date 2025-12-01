package school.hei;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactPostgress {
    public static void main(String[] args) {
        String jbcUrl = "jdbc:postgresql://localhost:5432/shopme";
        String username = "postgres";
        String password = "0Hilarilaray!";

        try{
        Connection connection = DriverManager.getConnection(jbcUrl, username, password);
            System.out.println("Connected to database");

            String sql = "INSERT INTO contact (nom, prenom, email)" + "VALUES ('Rakoto','Bema', 'BemaRAK@gmail.com')";
            Statement statement = connection.createStatement();
          int rows =  statement.executeUpdate(sql);
          if (rows > 0) {
              System.out.println("Contact added successfully");
          }

            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed to PostgreSQL server");
            e.printStackTrace();
        }
    }
}
