import java.sql.*;
import java.util.UUID;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import src.Models.Order;
import src.Models.*;
import src.Dao.*;
import src.IDbClient.*;

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

  //used to hold JComboBox selections
  static JComboBox baseList;
  static JComboBox proteinList;
  static JComboBox dressingList;
  static JComboBox toppingsList;
  static JComboBox sidesList;
  static JComboBox drinksList;
  static JComboBox extrasList;
  
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
      JOptionPane.showMessageDialog(null,"Test Connection Closed.");
    } catch(Exception e) {
      JOptionPane.showMessageDialog(null,"Test Connection NOT Closed.");
    }
  }

  //Main Menu GUI design
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

  /* ADD CODE HERE FOR MANAGE AND SERVER CLIENT */
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

    //Set Up a new Panel for the Inventory Table on the Manager Side: ASAHU
    JPanel inventoryPanel = new JPanel();
    inventoryPanel.setBorder(BorderFactory.createEmptyBorder(50,50,75,200));
    inventoryPanel.setBackground(Color.white);

    //Add a label for the Ingredient Table: ASAHU
    JLabel inventoryLabel = new JLabel("INVENTORY");
    inventoryLabel.setFont(new Font("serif",Font.PLAIN,40));
    inventoryLabel.setForeground(Color.black);

    //Create the Inventory Table: ASAHU
    //Individual Data Rows: ASAHU
    String itemData[][] = {
      {"Item","Amount","Pricing","Add","Remove"},
      {"brown rice","2000","0.0","+","-"},
      {"rice pilaf","2000","0.0","+","-"},
      {"pita","2000","0.0","+","-"},
      {"falafel","2000","5.89","+","-"},
      {"meatball","2000","6.89","+","-"},
      {"feta cheese","2000","0.0","+","-"},
      {"cucumber","2000","0.0","+","-"},
      {"tzatziki","2000","0.0","+","-"},
      {"hot sauce","2000","0.0","+","-"},
      {"peppers","2000","0.0","+","-"},
      {"hummus","2000","0.0","+","-"},
      {"olives","2000","0.0","+","-"},
      {"onion","2000","0.0","+","-"},
      {"tomato","2000","0.0","+","-"},
      {"greek yogurt","2000","0.0","+","-"},
      {"aioli","2000","0.0","+","-"},
      {"harissa","2000","0.0","+","-"},
      {"tahini","2000","0.0","+","-"},
      {"oregano","2000","0.0","+","-"},
      {"salad","2000","0.0","+","-"},
      {"hummus and pita","2000","0.0","+","-"},
      {"drink","2000","0.0","+","-"},
      {"extra meat","2000","2.49","+","-"},
      {"extra dressing","2000","0.39","+","-"},
      {"bowl","2000","0.0","+","-"},
      {"plate","2000","0.0","+","-"},
      {"silverware","5000","0.0","+","-"},
      {"napkins","10000","0.0","+","-"},
      {"cup","4000","0.0","+","-"}
    };

    //Individual Column Names: ASAHU
    String columnNames[] = {"Item","Amount","Pricing","Add","Remove"};
    //Instantiating the Tables: ASAHU    
    JTable inventoryTable = new JTable(itemData, columnNames);
    inventoryTable.setBounds(30, 40, 200, 300);

    //Add Inventory Components onto the Manager Panel: ASAHU
    managerPanel.add(inventoryPanel);
    inventoryPanel.add(inventoryLabel);
    inventoryPanel.add(inventoryTable);


    //shows Manager JFrame
    managerFrame.add(managerPanel);
    managerFrame.setVisible(true);
  }

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
    String[] baseItems = {"brown rice","rice pillaf","pita"};
    baseList = new JComboBox(baseItems);
    JLabel baseLabel = new JLabel("BASE");
    baseLabel.setFont(new Font("serif", Font.PLAIN, 20));
    baseLabel.setForeground(Color.black);

    //Create a new Panel for the Protein Items: ASAHU
    JPanel proteinPanel = new JPanel();
    proteinPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 75, 50));
    proteinPanel.setBackground(Color.white);
    
    // Add a combobox dropdown for protein: ASAHU 
    String[] protein = {"falafel","meatball"};
    proteinList = new JComboBox(protein);
    JLabel proteinLabel = new JLabel("PROTEIN");
    proteinLabel.setFont(new Font("serif",Font.PLAIN,20));
    proteinLabel.setForeground(Color.black);

    // Create a new Panel for the Dressing Items: ASAHU
    JPanel dressingPanel = new JPanel();
    dressingPanel.setBorder(BorderFactory.createEmptyBorder(25,25,75,50));
    dressingPanel.setBackground(Color.white);

    // Add a combobox dropdown for the dressing: ASAHU
    String[] dressing = {"greek yogurt", "aioli","harissa","tahini","oregano"};
    dressingList = new JComboBox(dressing);
    JLabel dressingLabel = new JLabel("DRESSING");
    dressingLabel.setFont(new Font("serif",Font.PLAIN,20));
    dressingLabel.setForeground(Color.black);

    // Create a new Panel for the Toppings: ASAHU
    JPanel toppingsPanel = new JPanel();
    toppingsPanel.setBorder(BorderFactory.createEmptyBorder(25,25,75,50));
    toppingsPanel.setBackground(Color.white);

    // Add a combobox dropdown for the Toppings: ASAHU
    String[] toppings = {
      "feta cheese",
      "cucumber",
      "tzatziki",
      "hot sauce",
      "peppers",
      "hummus",
      "olives",
      "onion",
      "tomato",
    };
    toppingsList = new JComboBox(toppings);
    JLabel toppingLabel = new JLabel("TOPPINGS");
    toppingLabel.setFont(new Font("serif",Font.PLAIN,20));
    toppingLabel.setForeground(Color.black);


    // Create a new Panel for the Side Items: ASAHU
    JPanel sidePanel = new JPanel();
    sidePanel.setBorder(BorderFactory.createEmptyBorder(25,25,75,50));
    sidePanel.setBackground(Color.white);

    // Add a combobox dropdown for the Sides: ASAHU
    String[] sides = {"salad","hummus and pita"};
    sidesList = new JComboBox(sides);
    JLabel sideLabel = new JLabel("SIDES");
    sideLabel.setFont(new Font("serif",Font.PLAIN,20));
    sideLabel.setForeground(Color.black);
    

    // Create a new Panel for the Drinks: ASAHU
    JPanel drinksPanel = new JPanel();
    drinksPanel.setBorder(BorderFactory.createEmptyBorder(25,25,75,50));
    drinksPanel.setBackground(Color.white);

    // Add a combobox dropdown for the Drinks: ASAHU
    String[] drinks = {"drink", "no drink"};
    drinksList = new JComboBox(drinks);
    JLabel drinksLabel = new JLabel("DRINKS");
    drinksLabel.setFont(new Font("serif",Font.PLAIN,20));
    drinksLabel.setForeground(Color.black);

    // Create a new Panel for the Extras: ASAHU
    JPanel extrasPanel = new JPanel();
    extrasPanel.setBorder(BorderFactory.createEmptyBorder(25,25,75,50));
    extrasPanel.setBackground(Color.white);

    // Add a combobox dropdown for the Drinks: ASAHU
    String[] extras = {"extra meat","extra dressing"};
    extrasList = new JComboBox(extras);
    JLabel extrasLabel = new JLabel("EXTRAS");
    extrasLabel.setFont(new Font("serif",Font.PLAIN,20));
    extrasLabel.setForeground(Color.black);


    // Create a new Panel for the Submit Button: ASAHU
    JPanel submitPanel = new JPanel();
    submitPanel.setBorder(BorderFactory.createEmptyBorder(25,25,75,50));
    submitPanel.setBackground(Color.white);
    JLabel submitLabel = new JLabel("SUBMIT ORDER");
    submitLabel.setFont(new Font("serif",Font.PLAIN,20));
    submitLabel.setForeground(Color.black);

    //Create a new Button for the Submit Button Panel: ASAHU
    JButton submitButton = new JButton("Submit");
    submitButton.setBounds(20,20,95,30);
    submitButton.addActionListener(MainGUI);

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

    serverPanel.add(toppingsPanel);
    toppingsPanel.add(toppingLabel);
    toppingsPanel.add(toppingsList);

    serverPanel.add(sidePanel);
    sidePanel.add(sideLabel);
    sidePanel.add(sidesList);

    serverPanel.add(drinksPanel);
    drinksPanel.add(drinksLabel);
    drinksPanel.add(drinksList);

    serverPanel.add(extrasPanel);
    extrasPanel.add(extrasLabel);
    extrasPanel.add(extrasList);
    //serverPanel.add(cmbMessageList);

    serverPanel.add(submitPanel);
    submitPanel.add(submitLabel);
    submitPanel.add(submitButton);

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
      else if (s.equals("Submit")){
        JOptionPane.showMessageDialog(serverFrame,"Order Submitted");
        //String base = baseList.getSelectedItem().toString();
        // String protein = proteinList.getSelectedItem().toString();
        // String dressing = dressingList.getSelectedItem().toString();
        // String topping = toppingsList.getSelectedItem().toString();
        // String sides = sidesList.getSelectedItem().toString();
        // String drink = drinksList.getSelectedItem().toString();
        // String extras = extrasList.getSelectedItem().toString();

        //creates new order based on chosen value
        Order curOrder = new Order();
        curOrder.date = "2023-03-08";
        curOrder.id = UUID.randomUUID().toString(); 
        curOrder.total_price = (float)12.38;

        OrdersDao newOrder = new OrdersDao();
        newOrder.add(curOrder);

      }
      /* ADD HERE IF YOU WANT ACTION TO OCCUR WHEN BUTTON IS CLICKED */
  }
}
