import java.sql.*;  
class conn{  
public static void main(String args[]){  
try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:ORCL","system","oracle");  


System.out.println("connection successful");
            Statement stmt = con.createStatement();
            int rollno = 4808;
            String query = "Select Name from bca where RollNo =" + rollno;
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            String name = rs.getString("Name");
            System.out.println(name);
            stmt.close();
            con.close(); 
  
//step5 close the connection object 
stmt.close(); 
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  