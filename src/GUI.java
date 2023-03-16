/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import GUI_Files.MainMenu;
import java.sql.*;
import javax.swing.*;
import src.Models.*;


public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection conn = null;
        try {

          Class.forName("org.postgresql.Driver");
          conn = DriverManager.getConnection("jdbc:postgresql://csce-315-db.engr.tamu.edu/csce315331_pi",
          "csce315331_pi_master", "3.1415");
        } catch (Exception e) {
          e.printStackTrace();
          System.err.println(e.getClass().getName()+": "+e.getMessage());
          System.exit(0);
        }
        JOptionPane.showMessageDialog(null,"Opened database successfully");

        //closing the connection
        try {
          conn.close();
          JOptionPane.showMessageDialog(null,"Test Connection Closed.");
        } catch(Exception e) {
          JOptionPane.showMessageDialog(null,"Test Connection NOT Closed.");
        }
        
        MainMenu menuFrame = new MainMenu();
        menuFrame.setVisible(true);
    }
    
}
