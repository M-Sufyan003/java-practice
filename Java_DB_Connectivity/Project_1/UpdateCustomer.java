import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateCustomer {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/testdb";
        String username="root";
        String password="";

        try {
            Connection con=DriverManager.getConnection(url,username,password);

            String sql="UPDATE customers SET price= ? WHERE cust_id =?";
            PreparedStatement pst=con.prepareStatement(sql);

            pst.setFloat(1,70000);
            pst.setInt(2,101);

            int rows=pst.executeUpdate();
            System.out.println("Rows Updated: "+rows);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
