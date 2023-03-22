package GUI_Files;

import Dao.Inventory;
import Dao.MenuItemDao;
import Models.MenuItem;
import java.util.List;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class SalesRestockFrame extends javax.swing.JFrame {

    
    public MenuItemDao menuItemDao;
    public List<MenuItem> currentMenu;
    
    /**
     * Creates new form SalesRestockFrame
     */
    public SalesRestockFrame() {
        menuItemDao = new MenuItemDao();
        currentMenu = menuItemDao.getAll();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SalesRestockLabel = new javax.swing.JLabel();
        ManagerBackBtn = new javax.swing.JButton();
        SalesReportPanel = new javax.swing.JPanel();
        TableScrollPanel = new javax.swing.JScrollPane();
        InventoryTable = new javax.swing.JTable();
        SalesReportSelection = new javax.swing.JComboBox<>();
        String[] salesArray = new String[currentMenu.size()];
        for (int i = 0; i < currentMenu.size(); i++){
            salesArray[i] = currentMenu.get(i).name;
        }

        SalesReportSelection.setModel(new javax.swing.DefaultComboBoxModel<>(salesArray));
        StartTimeField = new javax.swing.JTextField();
        EndTimeField = new javax.swing.JTextField();
        SalesReportLabel1 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        RestockReportPanel = new javax.swing.JPanel();
        LowItemLabel = new javax.swing.JLabel();
        RestockReportLabel1 = new javax.swing.JLabel();
        LowItemScrollPane = new javax.swing.JScrollPane();
        LowItemTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SalesRestockLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        SalesRestockLabel.setText("Sales and Restock");

        ManagerBackBtn.setBackground(new java.awt.Color(46, 56, 116));
        ManagerBackBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ManagerBackBtn.setForeground(java.awt.Color.white);
        ManagerBackBtn.setText("Back");
        ManagerBackBtn.setFocusable(false);
        ManagerBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerBackBtnActionPerformed(evt);
            }
        });

        SalesReportPanel.setBackground(new java.awt.Color(46, 56, 116));
        SalesReportPanel.setPreferredSize(new java.awt.Dimension(549, 609));

        InventoryTable.setShowGrid(true);
        InventoryTable.getTableHeader().setReorderingAllowed(false);
        TableScrollPanel.setViewportView(InventoryTable);

        StartTimeField.setText("Start Time");

        EndTimeField.setText("End Time");

        SalesReportLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N
        SalesReportLabel1.setForeground(java.awt.Color.white);
        SalesReportLabel1.setText("Sales Report");

        SubmitBtn.setText("Submit");
        SubmitBtn.setFocusable(false);
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SalesReportPanelLayout = new javax.swing.GroupLayout(SalesReportPanel);
        SalesReportPanel.setLayout(SalesReportPanelLayout);
        SalesReportPanelLayout.setHorizontalGroup(
            SalesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesReportPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(SalesReportSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EndTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalesReportPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(SalesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalesReportPanelLayout.createSequentialGroup()
                    .addContainerGap(390, Short.MAX_VALUE)
                    .addComponent(SalesReportLabel1)
                    .addGap(330, 330, 330)))
        );
        SalesReportPanelLayout.setVerticalGroup(
            SalesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesReportPanelLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(SalesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalesReportSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(SalesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SalesReportPanelLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(SalesReportLabel1)
                    .addContainerGap(743, Short.MAX_VALUE)))
        );

        RestockReportPanel.setBackground(new java.awt.Color(46, 56, 116));

        LowItemLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        LowItemLabel.setForeground(java.awt.Color.white);
        LowItemLabel.setText("The Following Items Should Be Restocked");

        RestockReportLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N
        RestockReportLabel1.setForeground(java.awt.Color.white);
        RestockReportLabel1.setText("Restock Report");

        LowItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Item Name"
            }
        ));
        Inventory restockInventory = new Inventory();
        ResultSet RestockRS = restockInventory.getRestockReport();
        try{
            LowItemTable = new javax.swing.JTable(buildTableModel(RestockRS));
        }
        catch(SQLException SQLException){
            System.out.println("SQL Exception");
        }
        LowItemScrollPane.setViewportView(LowItemTable);

        javax.swing.GroupLayout RestockReportPanelLayout = new javax.swing.GroupLayout(RestockReportPanel);
        RestockReportPanel.setLayout(RestockReportPanelLayout);
        RestockReportPanelLayout.setHorizontalGroup(
            RestockReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RestockReportPanelLayout.createSequentialGroup()
                .addGroup(RestockReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RestockReportPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(LowItemScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RestockReportPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(LowItemLabel))
                    .addGroup(RestockReportPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(RestockReportLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        RestockReportPanelLayout.setVerticalGroup(
            RestockReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RestockReportPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RestockReportLabel1)
                .addGap(18, 18, 18)
                .addComponent(LowItemLabel)
                .addGap(18, 18, 18)
                .addComponent(LowItemScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(ManagerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(426, 426, 426)
                        .addComponent(SalesRestockLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(SalesReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(RestockReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ManagerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalesRestockLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RestockReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SalesReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManagerBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerBackBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Back")) {
            this.setVisible(false);
            ManagerMenu managerMenuFrame = new ManagerMenu();
            managerMenuFrame.setVisible(true);
        }
    }//GEN-LAST:event_ManagerBackBtnActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Submit")) {
            
            String startTime = StartTimeField.getText();
            String endTime = EndTimeField.getText();
            String itemSelection = SalesReportSelection.getSelectedItem().toString();
            
            String id = "";
            for(int i = 0; i < currentMenu.size(); i++){
                if(itemSelection.equals(currentMenu.get(i).name)){
                    id = currentMenu.get(i).id;
                }
            }

            MenuItemDao salesTableDao = new MenuItemDao();
            ResultSet salesRS = salesTableDao.getHistory(id, startTime, endTime);
            try{
                
                // Clear any existing data from the table model
                DefaultTableModel model = (DefaultTableModel) InventoryTable.getModel();
                model.setRowCount(0);
                
                InventoryTable.setModel(buildTableModel(salesRS));
                InventoryTable.repaint();
            }
            catch( SQLException e){
                System.out.println("SQL Exception");
            }
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed
 
    public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesRestockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesRestockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesRestockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesRestockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesRestockFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EndTimeField;
    private javax.swing.JTable InventoryTable;
    private javax.swing.JLabel LowItemLabel;
    private javax.swing.JScrollPane LowItemScrollPane;
    private javax.swing.JTable LowItemTable;
    private javax.swing.JButton ManagerBackBtn;
    private javax.swing.JLabel RestockReportLabel1;
    private javax.swing.JPanel RestockReportPanel;
    private javax.swing.JLabel SalesReportLabel1;
    private javax.swing.JPanel SalesReportPanel;
    private javax.swing.JComboBox<String> SalesReportSelection;
    private javax.swing.JLabel SalesRestockLabel;
    private javax.swing.JTextField StartTimeField;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JScrollPane TableScrollPanel;
    // End of variables declaration//GEN-END:variables
}
