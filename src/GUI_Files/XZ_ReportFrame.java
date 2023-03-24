package GUI_Files;

import Dao.Inventory;
import Dao.MenuItemDao;
import static GUI_Files.SalesRestockFrame.buildTableModel;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable.PrintMode;
import javax.swing.table.DefaultTableModel;

/**
 * Creates the JFrame for X and Z Report
 * @author Team_Pi
 */
public class XZ_ReportFrame extends javax.swing.JFrame {

    /**
     * Creates new form XZ_ReportFrame
     */
    public XZ_ReportFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XY_Label = new javax.swing.JLabel();
        ManagerBackBtn = new javax.swing.JButton();
        XReportPanel = new javax.swing.JPanel();
        XReportLabel = new javax.swing.JLabel();
        GenerateXReportBtn = new javax.swing.JToggleButton();
        TotalSalesPanel = new javax.swing.JPanel();
        TotalSalesLabel = new javax.swing.JLabel();
        TotalSalesLabel1 = new javax.swing.JLabel();
        ZReportPanel = new javax.swing.JPanel();
        ZReportLabel = new javax.swing.JLabel();
        GenerateZReportBtn = new javax.swing.JToggleButton();
        ZReportScroll = new javax.swing.JScrollPane();
        ZReportTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        XY_Label.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        XY_Label.setText("X and Z Report");

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

        XReportPanel.setBackground(new java.awt.Color(46, 56, 116));

        XReportLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        XReportLabel.setForeground(java.awt.Color.white);
        XReportLabel.setText("X Report");

        GenerateXReportBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GenerateXReportBtn.setText("Generate");
        GenerateXReportBtn.setToolTipText("");
        GenerateXReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateXReportBtnActionPerformed(evt);
            }
        });

        TotalSalesLabel.setBackground(java.awt.Color.white);
        TotalSalesLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TotalSalesLabel.setText("$0.00");

        javax.swing.GroupLayout TotalSalesPanelLayout = new javax.swing.GroupLayout(TotalSalesPanel);
        TotalSalesPanel.setLayout(TotalSalesPanelLayout);
        TotalSalesPanelLayout.setHorizontalGroup(
            TotalSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalSalesPanelLayout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(TotalSalesLabel)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        TotalSalesPanelLayout.setVerticalGroup(
            TotalSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalSalesPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(TotalSalesLabel)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        TotalSalesLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TotalSalesLabel1.setForeground(java.awt.Color.white);
        TotalSalesLabel1.setText("The Total Sales:");

        javax.swing.GroupLayout XReportPanelLayout = new javax.swing.GroupLayout(XReportPanel);
        XReportPanel.setLayout(XReportPanelLayout);
        XReportPanelLayout.setHorizontalGroup(
            XReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XReportPanelLayout.createSequentialGroup()
                .addGroup(XReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(XReportPanelLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(GenerateXReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(XReportPanelLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(XReportLabel))
                    .addGroup(XReportPanelLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(TotalSalesLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XReportPanelLayout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(TotalSalesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        XReportPanelLayout.setVerticalGroup(
            XReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XReportPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(XReportLabel)
                .addGap(87, 87, 87)
                .addComponent(TotalSalesLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalSalesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(GenerateXReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ZReportPanel.setBackground(new java.awt.Color(46, 56, 116));

        ZReportLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        ZReportLabel.setForeground(java.awt.Color.white);
        ZReportLabel.setText("Z Report");

        GenerateZReportBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GenerateZReportBtn.setText("Generate");
        GenerateZReportBtn.setToolTipText("");
        GenerateZReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateZReportBtnActionPerformed(evt);
            }
        });

        ZReportScroll.setViewportView(ZReportTable);

        javax.swing.GroupLayout ZReportPanelLayout = new javax.swing.GroupLayout(ZReportPanel);
        ZReportPanel.setLayout(ZReportPanelLayout);
        ZReportPanelLayout.setHorizontalGroup(
            ZReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZReportPanelLayout.createSequentialGroup()
                .addGroup(ZReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ZReportPanelLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(GenerateZReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ZReportPanelLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(ZReportLabel))
                    .addGroup(ZReportPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(ZReportScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        ZReportPanelLayout.setVerticalGroup(
            ZReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ZReportPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(ZReportLabel)
                .addGap(27, 27, 27)
                .addComponent(ZReportScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GenerateZReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
                        .addGap(504, 504, 504)
                        .addComponent(XY_Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(XReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(ZReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XY_Label)
                    .addComponent(ManagerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(XReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ZReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param ActionEventListener used to determine when the button is pressed.
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
     * @param ActionEventListener used to determine when the button is pressed.
    */
    private void GenerateXReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateXReportBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Generate")) {

            Inventory XInventory = new Inventory();
            Float total = XInventory.getXReport();
            
            String newLabel = "$" + String. format("%.2f", total);
            TotalSalesLabel.setText(newLabel);
        }
    }//GEN-LAST:event_GenerateXReportBtnActionPerformed

    /**
     * @param ActionEventListener used to determine when the button is pressed.
    */
    private void GenerateZReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateZReportBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Generate")) {

            Inventory ZInventory = new Inventory();
            ResultSet salesRS = ZInventory.getZReport();
            try{
                
                // Clear any existing data from the table model
                DefaultTableModel model = (DefaultTableModel) ZReportTable.getModel();
                model.setRowCount(0);
                
                ZReportTable.setModel(buildTableModel(salesRS));
                ZReportTable.repaint();
                ZReportTable.print(PrintMode.NORMAL);
            }
            catch(PrinterException | SQLException e){
                System.out.println("SQL Exception");
            }
        }
    }//GEN-LAST:event_GenerateZReportBtnActionPerformed

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
     * Creates the X and Z Report JFrame and sets it as visible
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
            java.util.logging.Logger.getLogger(XZ_ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XZ_ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XZ_ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XZ_ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XZ_ReportFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton GenerateXReportBtn;
    private javax.swing.JToggleButton GenerateZReportBtn;
    private javax.swing.JButton ManagerBackBtn;
    private javax.swing.JLabel TotalSalesLabel;
    private javax.swing.JLabel TotalSalesLabel1;
    private javax.swing.JPanel TotalSalesPanel;
    private javax.swing.JLabel XReportLabel;
    private javax.swing.JPanel XReportPanel;
    private javax.swing.JLabel XY_Label;
    private javax.swing.JLabel ZReportLabel;
    private javax.swing.JPanel ZReportPanel;
    private javax.swing.JScrollPane ZReportScroll;
    private javax.swing.JTable ZReportTable;
    // End of variables declaration//GEN-END:variables
}
