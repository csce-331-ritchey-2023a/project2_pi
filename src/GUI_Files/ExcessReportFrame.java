package GUI_Files;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import Dao.Inventory;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class ExcessReportFrame extends javax.swing.JFrame {

    /**
     * Creates new form ExcessReportFrame
     */
    public ExcessReportFrame() {
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

        ExcessReportLabel = new javax.swing.JLabel();
        ManagerBackBtn = new javax.swing.JButton();
        ExcessReportPanel = new javax.swing.JPanel();
        TableScrollPanel = new javax.swing.JScrollPane();
        InventoryTable = new javax.swing.JTable();
        StartTimeField = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ExcessReportLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        ExcessReportLabel.setText("Excess Report");

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

        ExcessReportPanel.setBackground(new java.awt.Color(46, 56, 116));
        ExcessReportPanel.setPreferredSize(new java.awt.Dimension(549, 609));

        InventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rice Pillaf"},
                {"Pita"},
                {"Remaining Items"}
            },
            new String [] {
                "Item Names"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        InventoryTable.setShowGrid(true);
        InventoryTable.getTableHeader().setReorderingAllowed(false);
        TableScrollPanel.setViewportView(InventoryTable);

        StartTimeField.setText("Start Time");

        SubmitBtn.setText("Submit");
        SubmitBtn.setFocusable(false);
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExcessReportPanelLayout = new javax.swing.GroupLayout(ExcessReportPanel);
        ExcessReportPanel.setLayout(ExcessReportPanelLayout);
        ExcessReportPanelLayout.setHorizontalGroup(
            ExcessReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExcessReportPanelLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(StartTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExcessReportPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        ExcessReportPanelLayout.setVerticalGroup(
            ExcessReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExcessReportPanelLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(ExcessReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(ManagerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(433, 433, 433)
                        .addComponent(ExcessReportLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(ExcessReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(563, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExcessReportLabel)
                    .addComponent(ManagerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ExcessReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                .addGap(39, 39, 39))
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
            
            System.out.println(startTime);
            
//            Inventory excessReportObject = new Inventory();
//            ResultSet table = excessReportObject.getExcessReport(startTime);
//            try{
//                InventoryTable = new javax.swing.JTable(buildTableModel(table));
//            }
//            catch(SQLException SQLException){
//                System.out.println("SQL Exception");
//            }
            
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
            java.util.logging.Logger.getLogger(ExcessReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcessReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcessReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcessReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcessReportFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExcessReportLabel;
    private javax.swing.JPanel ExcessReportPanel;
    private javax.swing.JTable InventoryTable;
    private javax.swing.JButton ManagerBackBtn;
    private javax.swing.JTextField StartTimeField;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JScrollPane TableScrollPanel;
    // End of variables declaration//GEN-END:variables
}
