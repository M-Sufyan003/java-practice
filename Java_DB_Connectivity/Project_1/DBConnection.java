import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = ""; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
