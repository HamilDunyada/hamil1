package bookdbpacs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BOOKInsertcls {
    public static void main(String[] args) throws SQLException {


        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "GROUP86", "1234");

        String sqlcommand = "INSERT INTO BOOKS VALUES (gr_86seq.NEXTVAL,'CHERPLENG UCHURAN','KHALID HUSEYN',500,28,TO_DATE('17.08.2006','DD.MM.YYYY'),'AY')";

        PreparedStatement pst=con.prepareStatement(sqlcommand);
        pst.execute();
    }
}

