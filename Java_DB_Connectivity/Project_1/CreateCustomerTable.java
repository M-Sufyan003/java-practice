import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateCustomerTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password= "";

        String createTableSQL= "CREATE TABLE IF NOT EXISTS customers ("
        + "cust_id INT PRIMARY KEY, "
        + "cust_name VARCHAR(50) NOT NULL, "
        + "age INT, "
        + "gender CHAR(1), "
        + "dop DATE, "
        + "address VARCHAR(100), "
        + "item VARCHAR(50), "
        + "price DECIMAL(10,2)"
        + ")";

        try {
            Connection con= DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();

            stmt.executeUpdate(createTableSQL);

            System.out.println("Customers Table Created Successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
