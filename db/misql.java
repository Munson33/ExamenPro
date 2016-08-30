package db;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class misql {
private static String db="agenda";
private static String user="root";
private static String pass="";
private static String url="jdbc:misql//localhost/"+db;
private static Connection Conn;

public static Connection getConnect(){
try {
Class.forName("com.misql.jdbc.Driver");
Conn =DriverManager.getConnection(url, user, pass);
} catch(Exception e){
    JOptionPane.showMessageDialog(null,"Error:"+e.getMessage());
}
    return Conn;
}

}