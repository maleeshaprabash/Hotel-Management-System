/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class AddCustomer {
         Statement stmt;
    public void Form(String FirstName, String SecondName, String address, String TelephoneNumber,String NICNumber) {
 try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO customer VALUES('"+FirstName+"', '"+SecondName+"', '"+address+"', '"+TelephoneNumber+"','"+NICNumber+"')");
 } catch (Exception e) {
 e.printStackTrace();
 }
}

}
  
    

