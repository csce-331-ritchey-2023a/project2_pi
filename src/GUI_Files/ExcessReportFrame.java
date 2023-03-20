package GUI_Files;

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
        StartDateField = new javax.swing.JTextField();
        EndDateField = new javax.swing.JTextField();

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

        StartDateField.setText("Start Date");

        EndDateField.setText("End Date");
        EndDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndDateFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExcessReportPanelLayout = new javax.swing.GroupLayout(ExcessReportPanel);
        ExcessReportPanel.setLayout(ExcessReportPanelLayout);
        ExcessReportPanelLayout.setHorizontalGroup(
            ExcessReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExcessReportPanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EndDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
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
                    .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void EndDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndDateFieldActionPerformed

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
    private javax.swing.JTextField EndDateField;
    private javax.swing.JLabel ExcessReportLabel;
    private javax.swing.JPanel ExcessReportPanel;
    private javax.swing.JTable InventoryTable;
    private javax.swing.JButton ManagerBackBtn;
    private javax.swing.JTextField StartDateField;
    private javax.swing.JScrollPane TableScrollPanel;
    // End of variables declaration//GEN-END:variables
}
