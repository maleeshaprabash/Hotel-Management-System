/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CustomerController {
    Statement stmt;
 

   public static void Form(String FirstName, String SecondName, String AddressCus, String  TelephoneNumber, String NicNumber)
    {
 new Model.AddCustomer().Form(FirstName, SecondName, AddressCus,TelephoneNumber,NicNumber);
 JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", 
JOptionPane.INFORMATION_MESSAGE);
} 
}



 

