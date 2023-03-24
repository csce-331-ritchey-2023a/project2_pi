package GUI_Files;

import Dao.Inventory;
import Dao.MenuItemDao;
import Models.Cutlery;
import Models.MenuItem;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * Create the Manage Inventory JFrame
*/
public class ManageInventoryFrame extends javax.swing.JFrame {

    
    //gets items from DB to be used in Inventory Frame
    MenuItemDao menuItemDao = new MenuItemDao();
    List<MenuItem> currentMenu = menuItemDao.getAll();
    
    /**
     * Creates new form ManageInventoryFrame
     */
    public ManageInventoryFrame() {
        initComponents();
    }
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManagerMenuLabel = new javax.swing.JLabel();
        InventoryPanel = new javax.swing.JPanel();
        TableScrollPanel = new javax.swing.JScrollPane();
        InventoryTable = new javax.swing.JTable();
        AddEditPanel = new javax.swing.JPanel();
        AddItemsLabel = new javax.swing.JLabel();
        CategorySelection = new javax.swing.JComboBox<>();
        ItemNameField = new javax.swing.JTextField();
        ItemQuantityField = new javax.swing.JTextField();
        ItemPriceField = new javax.swing.JTextField();
        AddSubmitBtn = new javax.swing.JButton();
        CategoryLabel = new javax.swing.JLabel();
        ItemInformationLabel = new javax.swing.JLabel();
        EditItemLabel = new javax.swing.JLabel();
        EditValueField = new javax.swing.JTextField();
        ItemSelection = new javax.swing.JComboBox<>();
        ValueSubmitBtn = new javax.swing.JButton();
        EditItemSubLabel = new javax.swing.JLabel();
        ItemSelection1 = new javax.swing.JComboBox<>();
        EditTypeLabel = new javax.swing.JLabel();
        RemoveItemLabel = new javax.swing.JLabel();
        RemoveItemSelection = new javax.swing.JComboBox<>();
        RemoveSubmitBtn = new javax.swing.JButton();
        ManagerBackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManagerMenuLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        ManagerMenuLabel.setText("Manage Inventory");

        InventoryPanel.setBackground(new java.awt.Color(46, 56, 116));
        InventoryPanel.setPreferredSize(new java.awt.Dimension(549, 609));

        InventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Price", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        InventoryTable.setShowGrid(true);
        InventoryTable.getTableHeader().setReorderingAllowed(false);
        Inventory getInventory = new Inventory();
        ResultSet InventoryRS = getInventory.get();
        try{
            InventoryTable = new javax.swing.JTable(buildTableModel(InventoryRS));
        }
        catch(SQLException SQLException){
            System.out.println("SQL Exception");
        }
        TableScrollPanel.setViewportView(InventoryTable);
        if (InventoryTable.getColumnModel().getColumnCount() > 0) {
            InventoryTable.getColumnModel().getColumn(0).setMinWidth(200);
        }

        javax.swing.GroupLayout InventoryPanelLayout = new javax.swing.GroupLayout(InventoryPanel);
        InventoryPanel.setLayout(InventoryPanelLayout);
        InventoryPanelLayout.setHorizontalGroup(
            InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        InventoryPanelLayout.setVerticalGroup(
            InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        AddEditPanel.setBackground(new java.awt.Color(46, 56, 116));

        AddItemsLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        AddItemsLabel.setForeground(java.awt.Color.white);
        AddItemsLabel.setText("Add Items:");

        CategorySelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "base", "protein", "topping", "dressing", "side", "drink", "extra", "cutlery" }));

        ItemNameField.setText("Name");

        ItemQuantityField.setText("Quantity");

        ItemPriceField.setText("Price");

        AddSubmitBtn.setText("Add Item");
        AddSubmitBtn.setFocusable(false);
        AddSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubmitBtnActionPerformed(evt);
            }
        });

        CategoryLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        CategoryLabel.setForeground(java.awt.Color.white);
        CategoryLabel.setText("Category");

        ItemInformationLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        ItemInformationLabel.setForeground(java.awt.Color.white);
        ItemInformationLabel.setText("Item Information");

        EditItemLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        EditItemLabel.setForeground(java.awt.Color.white);
        EditItemLabel.setText("Edit Item:");

        EditValueField.setText("New Value");

        String[] editArray = new String[currentMenu.size()];
        for (int i = 0; i < currentMenu.size(); i++){
            editArray[i] = currentMenu.get(i).name;
        }

        ItemSelection.setModel(new javax.swing.DefaultComboBoxModel<>(editArray));

        ValueSubmitBtn.setText("Update Value");
        ValueSubmitBtn.setFocusable(false);
        ValueSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValueSubmitBtnActionPerformed(evt);
            }
        });

        EditItemSubLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        EditItemSubLabel.setForeground(java.awt.Color.white);
        EditItemSubLabel.setText("Item:");

        ItemSelection1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Quantity", "Price", "Category" }));

        EditTypeLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        EditTypeLabel.setForeground(java.awt.Color.white);
        EditTypeLabel.setText("Type:");

        RemoveItemLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        RemoveItemLabel.setForeground(java.awt.Color.white);
        RemoveItemLabel.setText("Remove Item:");

        String[] removeArray = new String[currentMenu.size()];
        for (int i = 0; i < currentMenu.size(); i++){
            removeArray[i] = currentMenu.get(i).name;
        }

        RemoveItemSelection.setModel(new javax.swing.DefaultComboBoxModel<>(removeArray));

        RemoveSubmitBtn.setText("Remove Item");
        RemoveSubmitBtn.setFocusable(false);
        RemoveSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveSubmitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddEditPanelLayout = new javax.swing.GroupLayout(AddEditPanel);
        AddEditPanel.setLayout(AddEditPanelLayout);
        AddEditPanelLayout.setHorizontalGroup(
            AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEditPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CategorySelection, 0, 139, Short.MAX_VALUE)
                    .addComponent(ItemSelection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddEditPanelLayout.createSequentialGroup()
                        .addComponent(AddItemsLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AddEditPanelLayout.createSequentialGroup()
                        .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddEditPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(EditItemLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEditPanelLayout.createSequentialGroup()
                                .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ItemPriceField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ItemQuantityField)
                                    .addComponent(ItemNameField))
                                .addGap(39, 39, 39)))
                        .addComponent(AddSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEditPanelLayout.createSequentialGroup()
                        .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddEditPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(RemoveSubmitBtn))
                            .addGroup(AddEditPanelLayout.createSequentialGroup()
                                .addComponent(ItemSelection1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditValueField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ValueSubmitBtn)
                        .addGap(24, 24, 24))))
            .addGroup(AddEditPanelLayout.createSequentialGroup()
                .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddEditPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(CategoryLabel)
                        .addGap(67, 67, 67)
                        .addComponent(ItemInformationLabel))
                    .addGroup(AddEditPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(EditItemSubLabel)
                        .addGap(96, 96, 96)
                        .addComponent(EditTypeLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AddEditPanelLayout.createSequentialGroup()
                .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddEditPanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(RemoveItemLabel))
                    .addGroup(AddEditPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(RemoveItemSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AddEditPanelLayout.setVerticalGroup(
            AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEditPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(AddItemsLabel)
                .addGap(21, 21, 21)
                .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryLabel)
                    .addComponent(ItemInformationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategorySelection, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ItemQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ItemPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(EditItemLabel)
                .addGap(16, 16, 16)
                .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditItemSubLabel)
                    .addComponent(EditTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditValueField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValueSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemSelection1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(RemoveItemLabel)
                .addGap(18, 18, 18)
                .addGroup(AddEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveItemSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ManagerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ManagerMenuLabel)
                        .addGap(778, 778, 778))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InventoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(AddEditPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(176, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ManagerMenuLabel)
                    .addComponent(ManagerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddEditPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InventoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void AddSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubmitBtnActionPerformed
        // TODO add your handling code here:
        String currentCategory = CategorySelection.getSelectedItem().toString();
        
        String itemName = ItemNameField.getText();
        String itemQuantity = ItemQuantityField.getText();
        String itemPrice = ItemPriceField.getText();
        
        if("cutlery".equals(currentCategory)){
            Cutlery newCutlery = new Cutlery();
            newCutlery.name = itemName;
            newCutlery.quantity = Integer.parseInt(itemQuantity);
            
            JOptionPane.showMessageDialog(this, "Item Added");
            
            Inventory newInventory = new Inventory();
            newInventory.add(newCutlery);
 
        }
        else{
            MenuItem newItem = new MenuItem();
            newItem.name = itemName; 
            newItem.quantity = Integer.parseInt(itemQuantity); 
            newItem.price = Float.parseFloat(itemPrice);
            newItem.category = currentCategory;

            JOptionPane.showMessageDialog(this, "Item Added");

            Inventory newInventory = new Inventory();
            newInventory.add(newItem);
        }
        
        ManageInventoryFrame newFrame = new ManageInventoryFrame();
        this.setVisible(false);
        newFrame.setVisible(true);
    }//GEN-LAST:event_AddSubmitBtnActionPerformed

    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void ValueSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValueSubmitBtnActionPerformed
        // TODO add your handling code here:
                String currentItem = ItemSelection.getSelectedItem().toString();
        String currentType = ItemSelection1.getSelectedItem().toString();
        String changeValue = EditValueField.getText();
        
        JOptionPane.showMessageDialog(this, "Value Updated");
        
        Inventory newInventory = new Inventory();
        
        for (int i = 0; i <= currentMenu.size() - 1; i++){
            if (currentMenu.get(i).name.equals(currentItem)){
                switch (currentType) {
                    case "Quantity":
                        currentMenu.get(i).quantity = Integer.parseInt(changeValue);
                        break;
                    case "Price":
                        currentMenu.get(i).price = Float.parseFloat(changeValue);
                        break;
                    case "ID":
                        currentMenu.get(i).id = changeValue;
                        break;
                    case "Name":
                        currentMenu.get(i).name = changeValue;
                        break;
                    case "Category":
                        currentMenu.get(i).category = changeValue;
                        break;
                    default:
                        break;
                }
                
                newInventory.update(currentMenu.get(i));
            }
        }
        
        ManageInventoryFrame newFrame = new ManageInventoryFrame();
        this.setVisible(false);
        newFrame.setVisible(true);
    }//GEN-LAST:event_ValueSubmitBtnActionPerformed

    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void ManagerBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerBackBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Back")) {
            this.setVisible(false);
            ManagerMenu managerMenuFrame = new ManagerMenu();
            managerMenuFrame.setVisible(true);
        }
    }//GEN-LAST:event_ManagerBackBtnActionPerformed

    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void RemoveSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveSubmitBtnActionPerformed
        // TODO add your handling code here:
        String itemName = RemoveItemSelection.getSelectedItem().toString();
        
        JOptionPane.showMessageDialog(this, "Item Removed");
       
        Inventory newInventory = new Inventory();
        
        for (int i = 0; i <= currentMenu.size() - 1; i++){
            if (currentMenu.get(i).name.equals(itemName)){
                newInventory.delete(currentMenu.get(i));
            }
            
        }
        
        ManageInventoryFrame newFrame = new ManageInventoryFrame();
        this.setVisible(false);
        newFrame.setVisible(true);
    }//GEN-LAST:event_RemoveSubmitBtnActionPerformed

    /**
     * 
     * @param rs DefaultTableModel used to set table model in JFrame
     * @return DefaultTableModel used to populated table in JFrame
     * @throws SQLException if ResultSet is not properly formatted
     */
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
            java.util.logging.Logger.getLogger(ManageInventoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageInventoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageInventoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageInventoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageInventoryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddEditPanel;
    private javax.swing.JLabel AddItemsLabel;
    private javax.swing.JButton AddSubmitBtn;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JComboBox<String> CategorySelection;
    private javax.swing.JLabel EditItemLabel;
    private javax.swing.JLabel EditItemSubLabel;
    private javax.swing.JLabel EditTypeLabel;
    private javax.swing.JTextField EditValueField;
    private javax.swing.JPanel InventoryPanel;
    private javax.swing.JTable InventoryTable;
    private javax.swing.JLabel ItemInformationLabel;
    private javax.swing.JTextField ItemNameField;
    private javax.swing.JTextField ItemPriceField;
    private javax.swing.JTextField ItemQuantityField;
    private javax.swing.JComboBox<String> ItemSelection;
    private javax.swing.JComboBox<String> ItemSelection1;
    private javax.swing.JButton ManagerBackBtn;
    private javax.swing.JLabel ManagerMenuLabel;
    private javax.swing.JLabel RemoveItemLabel;
    private javax.swing.JComboBox<String> RemoveItemSelection;
    private javax.swing.JButton RemoveSubmitBtn;
    private javax.swing.JScrollPane TableScrollPanel;
    private javax.swing.JButton ValueSubmitBtn;
    // End of variables declaration//GEN-END:variables
}
