/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wathsala
 */
import java.sql.*;
import javax.swing.*;

public class JavaConnect {
    
    Connection conn = null;
    
    public static Connection ConnecrDb()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Wathsala\\Documents\\NetBeansProjects\\BinarySearchTree\\BinarySearch.sqlite");
            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
            
    }
    
}
