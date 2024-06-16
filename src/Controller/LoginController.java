
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import View.Login;
import View.Home;

public class LoginController {
public static void Login(String EmailAddress, String PasswordLog) {
 try {
        String Email = "maleesha@gmail.com"; 
        String Password= "1234"; 
            ResultSet rs = new DBSearch().searchLogin(Email);
 

 while (rs.next()) {
Email = rs.getString("Email"); 
Password = rs.getString("Password"); 

 }
    if (Email != null && Password != null) {
        if (Password.equals(PasswordLog)) {
    System.out.println("Login Successfull");
    Login.getFrames()[0].dispose();
    new Home().setVisible(true);
 } else {
JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 } else {
JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 DBConnection.closeCon();
 } catch (SQLException ex) { 
Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
}
