import GUI_Files.MainMenu;
import java.sql.*;
import javax.swing.*;

/**
 * Used to open the Main Menu Frame of the GUI
 * @author Team_Pi
*/
public class GUI {

    /**
     * Opens the Main Menu of the GUI
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates Menu JFrame and sets visible
        MainMenu menuFrame = new MainMenu();
        menuFrame.setVisible(true);
    }
    
}
