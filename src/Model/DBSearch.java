
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBSearch {
 Statement stmt;
 ResultSet rs;
public ResultSet searchLogin(String EmailAddress) {
         try {
               stmt = DBConnection.getStatementConnection();
                String email = EmailAddress;
 
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login where Email='"+email+ "'");

 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }


public ResultSet searchCustomer() {
         try {
               stmt = DBConnection.getStatementConnection();
                rs = stmt.executeQuery("SELECT * FROM customer");

 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }

}