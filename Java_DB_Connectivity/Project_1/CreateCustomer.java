import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateCustomer {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/testdb";
        String username="root";
        String password="";

        try{
            Connection con= DriverManager.getConnection(url,username,password);

            String sql = "INSERT INTO customers(cust_id, cust_name, Age, Gender, Dop, Address, item, price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst=con.prepareStatement(sql);

            pst.setInt(1,101);
            pst.setString(2,"Ali khan");
            pst.setInt(3, 25);
            pst.setString(4, "M");
            pst.setDate(5, java.sql.Date.valueOf("2026-01-16"));
            pst.setString(6, "Lahore");
            pst.setString(7, "Laptop");
            pst.setFloat(8, 75000);

            int rows = pst.executeUpdate();
            System.out.println("Rows Inserted: "+ rows);

            con.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
