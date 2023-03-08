import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ***IMPORTS NOW WORK BUT GETTING ISSUES WITH CONFIGREADER
//import src.IDbClient.dBConfigReader;


public class GUI extends JFrame implements ActionListener {

  //Main GUI object
  static GUI MainGUI;

  //JFrames for the 3 parts of GUI
  static JFrame mainMenu;
  static JFrame managerFrame;
  static JFrame serverFrame;

  //holds the current frame
  static String currentFrame;
  
  //private static dBConfigReader configReader;

  public static void main(String[] args)
  {
    //Checks for connection at start
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

    currentFrame = "main";
    open_main_menu();

    //closing the connection
    try {
      conn.close();
      JOptionPane.showMessageDialog(null,"Connection Closed.");
    } catch(Exception e) {
      JOptionPane.showMessageDialog(null,"Connection NOT Closed.");
    }
  }
  /** * No Returns
   * Opens Main Menu GUI for Pom & Honey POS System
   * Allows User to select Server and Manager Side
   * Switches to Server or Manager based on button pressed
   * Calls switch_to_manager_client() and switch_to_server_client() 
   * 
   * @param none
   * @return none - opens GUI using Java Swing
   * @throws SQLException
   */
  public static void open_main_menu(){
    // create a new frame
    mainMenu = new JFrame("DB GUI");

      //TODO Step 4javac *.java
    // create a object
    MainGUI = new GUI();

    // create a panel
    JPanel mainPanel = new JPanel();
    mainPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 150, 50));
    mainPanel.setBackground(Color.darkGray);
    mainPanel.setLayout(new GridLayout(4,1));

    //creates array for buttons
    JButton mainButtons[] = {new JButton("Server"), new JButton("Manager")};

    // add actionlistener to button
    mainButtons[0].addActionListener(MainGUI);
    mainButtons[1].addActionListener(MainGUI);

    //change design of servers and manager button
    for (int i = 0; i < mainButtons.length; i++) {
      mainButtons[i].setFont(new Font("serif", Font.PLAIN, 30));
      mainButtons[i].setBackground(new Color(46,56,116));
      mainButtons[i].setForeground(Color.white);
      mainButtons[i].setFocusable(false);
    }

    //Create and set up JLabel
    JLabel label = new JLabel("<html>Choose Manager or Server Side:<br></html>");
    label.setFont(new Font("serif", Font.PLAIN, 40));
    label.setForeground(Color.white);

    label.setHorizontalAlignment(JLabel.CENTER);
    mainPanel.add(label, BorderLayout.NORTH);

    // add buttons to panel
    mainPanel.add(mainButtons[0]);
    mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
    mainPanel.add(mainButtons[1]);

    // add panel to frame
    mainMenu.add(mainPanel);

    // set the size of Main Menu Frame
    mainMenu.setSize(1920, 1080);
    mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //shows Main Menu JFrame
    mainMenu.setVisible(true);
  }

  /** * No Returns
   * Opens Manager Client for Pom & Honey POS System
   * Allows Manager to track remaining inventory
   * Manager can also add and remove items from inventory
   * Switches to Main Menu based on button pressed
   * Calls open_main_menu()
   * 
   * @param none
   * @return none - opens GUI using Java Swing
   * @throws SQLException
   */
  public static void switch_to_manager_client(){
    //closes Main Menu JFrame
    mainMenu.setVisible(false);

    //creates Manager JFrame
    managerFrame = new JFrame("Manager Client");
    managerFrame.setSize(1920, 1080);
    managerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // create a JPanel
    JPanel managerPanel = new JPanel();
    managerPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 150, 50));
    managerPanel.setBackground(Color.darkGray);

    //creates button to return to main menu
    JButton mainMenuButton = new JButton("Main Menu");

    //add actionlistener to button and adds to main
    mainMenuButton.addActionListener(MainGUI);

    //Create and sets up JLabel
    JLabel label = new JLabel("MANAGER SIDE!");
    label.setFont(new Font("serif", Font.PLAIN, 40));
    label.setForeground(Color.white);

    //adds components to JPanel
    managerPanel.add(label);
    managerPanel.add(mainMenuButton);

    //shows Manager JFrame
    managerFrame.add(managerPanel);
    managerFrame.setVisible(true);
  }

  /** * No Returns
   * Opens Server Client for Pom & Honey POS System
   * Allows User to place orders for customers
   * Switches to Main Menu based on button pressed
   * Calls open_main_menu()
   * 
   * @param none
   * @return none - opens GUI using Java Swing
   * @throws SQLException
   */
  public static void switch_to_server_client(){
    //closes Main Menu JFrame
    mainMenu.setVisible(false);

    //creates Server JFrame
    serverFrame = new JFrame("Server Client");
    serverFrame.setSize(1920, 1080);
    serverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // create a Jpanel
    JPanel serverPanel = new JPanel();
    serverPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 150, 50));
    serverPanel.setBackground(Color.darkGray);

    //creates button to return to main menu
    JButton mainMenuButton = new JButton("Main Menu");

    //add actionlistener to button and adds to main
    mainMenuButton.addActionListener(MainGUI);

    //Create and set up JLabel
    JLabel label = new JLabel("SERVER SIDE!");
    label.setFont(new Font("serif", Font.PLAIN, 40));
    label.setForeground(Color.white);

    //Create a new Panel for the Base Items: ASAHU
    JPanel basePanel= new JPanel();
    basePanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 75, 50));
    basePanel.setBackground(Color.white);

    // Add a combobox dropdown for Base items: ASAHU 
    String[] baseItems = {"Brown Rice","Rice Pillaf","Pita"};
    JComboBox baseList = new JComboBox(baseItems);
    JLabel baseLabel = new JLabel("BASE");
    baseLabel.setFont(new Font("serif", Font.PLAIN, 20));
    baseLabel.setForeground(Color.black);

    //Create a new Panel for the Protein Items: ASAHU
    JPanel proteinPanel = new JPanel();
    proteinPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 75, 50));
    proteinPanel.setBackground(Color.white);
    
    // Add a combobox dropdown for protein: ASAHU 
    String[] protein = {"Falafel","Meatball"};
    JComboBox proteinList = new JComboBox(protein);
    JLabel proteinLabel = new JLabel("PROTEIN");
    proteinLabel.setFont(new Font("serif",Font.PLAIN,20));
    proteinLabel.setForeground(Color.black);

    // Create a new Panel for the Dressing Items: ASAHU
    JPanel dressingPanel = new JPanel();
    dressingPanel.setBorder(BorderFactory.createEmptyBorder(25,25,75,50));
    dressingPanel.setBackground(Color.white);

    // Add a combobox dropdown for the dressing: ASAHU
    String[] dressing = {"Greek Yogurt", "Aioli","Harissa","Tahini","Oregano"};
    JComboBox dressingList = new JComboBox(dressing);
    JLabel dressingLabel = new JLabel("DRESSING");
    dressingLabel.setFont(new Font("serif",Font.PLAIN,20));
    dressingLabel.setForeground(Color.black);

    //adds components to Jpanel
    serverPanel.add(label);
    serverPanel.add(mainMenuButton);

    // Add CombobBox Components: ASAHU
    serverPanel.add(basePanel);
    basePanel.add(baseLabel);
    basePanel.add(baseList);

    serverPanel.add(proteinPanel);
    proteinPanel.add(proteinLabel);
    proteinPanel.add(proteinList);

    serverPanel.add(dressingPanel);
    dressingPanel.add(dressingLabel);
    dressingPanel.add(dressingList);
    //serverPanel.add(cmbMessageList);


    //shows Server JFrame
    serverFrame.add(serverPanel);
    serverFrame.setVisible(true);
  }

  //When button is pressed
  public void actionPerformed(ActionEvent e)
  {
      String s = e.getActionCommand();
      if (s.equals("Server")) {
        
        //runs switch to server code
        switch_to_server_client();

        //tracks switch
        currentFrame = "server";
      }
      else if (s.equals("Manager")){

        //runs switch to manager code
        switch_to_manager_client();

        //tracks switch
        currentFrame = "manager";
      }
      else if (s.equals("Main Menu")){

        //checks what frame it is currently in
        if (currentFrame == "server") {

          //turns off visiblilty
          serverFrame.setVisible(false);
        }
        else if (currentFrame == "manager"){

          //turns off visiblilty
          managerFrame.setVisible(false);
        }

        //opens the main menu
        open_main_menu();

        //tracks switch
        currentFrame = "main";
      }
      /* ADD HERE IF YOU WANT ACTION TO OCCUR WHEN BUTTON IS CLICKED */
  }
}
