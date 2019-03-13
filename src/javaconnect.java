import java.sql.*; 
import javax.swing.JOptionPane;
// class connection avec le base de donner 

public class javaconnect {
    
    Connection conn; 
    
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
              System.out.println("Driver ok"); 
              String url="jdbc:mysql://localhost/Library"; 
              String user="root"; 
              String password=""; 
              Connection conn=DriverManager.getConnection(url,user,password); 
              System.out.println("Connexion bien établie"); 
                return conn; 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }      
    }
}
