/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBconnect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.lang.Exception.*;

/**
 *
 * @author win 8
 */
public class DBconnect {
        
    public static Connection connect()
    {
        Connection conn = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","pavan");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        return conn;
    }
 
    
    
}
