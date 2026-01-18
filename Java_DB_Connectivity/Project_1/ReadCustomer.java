import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadCustomer {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/testdb";
        String username="root";
        String password="";

        try {
            Connection con=DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();

            ResultSet rs= stmt.executeQuery("SELECT * FROM customers");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("cust_id") + " | " +
                    rs.getString("cust_name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("gender") + " | " +
                    rs.getDate("dop") + " | " +
                    rs.getString("address") + " | " +
                    rs.getString("item") + " | " +
                    rs.getFloat("price")
                );
            }
            System.out.println("Customer Table Data Retrived!!!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
