import java.sql.*;

//import javax.sql.*;
public class printfullDB 
{
    public static void main(String arg[]) throws SQLException, ClassNotFoundException 
   {

      System.out.println("ya allah ya mohammad sallal lahu ali wasalam");

      String connector = "com.mysql.cj.jdbc.Driver";
      String url = "jdbc:mysql://localhost:3306/bca";
      String user = "root";
      String pwd = "rayees";
      Class.forName(connector);
      Connection con;
         try
       {

         con = DriverManager.getConnection(url, user, pwd);
         System.out.println("connection successful");
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("select* from student");

             while (rs.next())
           {
             // int sno = rs.getInt(columnLable: "SNO");
            int roll = rs.getInt("RollNo");
            String name = rs.getString("Name");

             System.out.println(roll + "  " + name );
             //System.out.println(name);

             

            }
             stmt.close();
             con.close();

        }     catch (Exception e)
             {
               System.out.println(e.toString());
             }
    }

}
