package bookdbpacs;


import java.sql.*;

public class bookdbcls {
    public static void main(String[] args) {

        try{

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","GROUP86","1234");
            String sqlcmd= "SELECT * FROM BOOKS";

            PreparedStatement pst =con.prepareStatement(sqlcmd);

            ResultSet resultSet = pst.executeQuery();

            while (resultSet.next()){
                int id=resultSet.getInt("ID");
                String bookname= resultSet.getString(2);
                String bookauthor= resultSet.getString("BOOK_AUTHOR");
                int bookpage=resultSet.getInt(4);
                double bookprice=resultSet.getDouble("BOOK_PRICE");
                String bookdate= resultSet.getString(6);
                String publishhourse=resultSet.getString(7);
                System.out.println(id + " "+ bookname+" "+bookauthor+" "+bookpage+" "+bookprice+" "+ bookdate+""+publishhourse);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
