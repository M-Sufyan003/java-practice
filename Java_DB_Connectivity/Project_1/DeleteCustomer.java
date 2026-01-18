import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteCustomer {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "DELETE FROM customers WHERE cust_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, 101);

            int rows = pst.executeUpdate();
            System.out.println("Rows deleted: " + rows);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
