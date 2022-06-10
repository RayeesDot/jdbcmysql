import java.sql.*;

class connection {
    public static void main(String arg[]) throws ClassNotFoundException {
        System.out.println("YA ALLAH YA MOHAMMAD s.a.w");

        String connector = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pwd = "rayees";
        Class.forName(connector);
        Connection con;
        try {
            con = DriverManager.getConnection(url, user, pwd);

            System.out.println("connection successful");
           Statement stmt = con.createStatement();
            int rollno = 4815;
            String query = "Select Name from student where RollNo =" + rollno;
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            String name = rs.getString("Name");
            System.out.println(name);
            
            
          // Statement stmt=con.createStatement();  
  
            //step4 execute query  
            /*ResultSet rs=stmt.executeQuery("Select * from bca.student");
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));*/

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
