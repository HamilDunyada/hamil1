package bookdbpacs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class bookDleete {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "GROUP86", "1234");
        String sqlcommand = "DELETE FROM BOOKS WHERE ID=1005";
        PreparedStatement pst=con.prepareStatement(sqlcommand);
        pst.execute();


    }

}
