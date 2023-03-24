package GUI_Files;

/**
 * Creates the Manager Menu JFrame
*/
public class ManagerMenu extends javax.swing.JFrame {

    /**
     * Creates new form ManagerMenu
     */
    public ManagerMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManagerMenuLabel = new javax.swing.JLabel();
        ManageInventoryBtn = new javax.swing.JButton();
        MainMenuBtn = new javax.swing.JButton();
        SalesRestockBtn = new javax.swing.JButton();
        ExcessBtn = new javax.swing.JButton();
        XZ_ReportBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        ManagerMenuLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        ManagerMenuLabel.setText("Manager Menu");

        ManageInventoryBtn.setBackground(new java.awt.Color(46, 56, 116));
        ManageInventoryBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ManageInventoryBtn.setForeground(java.awt.Color.white);
        ManageInventoryBtn.setText("Manage Inventory");
        ManageInventoryBtn.setFocusPainted(false);
        ManageInventoryBtn.setFocusable(false);
        ManageInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageInventoryBtnActionPerformed(evt);
            }
        });

        MainMenuBtn.setBackground(new java.awt.Color(46, 56, 116));
        MainMenuBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        MainMenuBtn.setForeground(java.awt.Color.white);
        MainMenuBtn.setText("Back");
        MainMenuBtn.setFocusPainted(false);
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
            }
        });

        SalesRestockBtn.setBackground(new java.awt.Color(46, 56, 116));
        SalesRestockBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SalesRestockBtn.setForeground(java.awt.Color.white);
        SalesRestockBtn.setText("Sales and Restock");
        SalesRestockBtn.setFocusPainted(false);
        SalesRestockBtn.setFocusable(false);
        SalesRestockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesRestockBtnActionPerformed(evt);
            }
        });

        ExcessBtn.setBackground(new java.awt.Color(46, 56, 116));
        ExcessBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ExcessBtn.setForeground(java.awt.Color.white);
        ExcessBtn.setText("Excess Report");
        ExcessBtn.setFocusPainted(false);
        ExcessBtn.setFocusable(false);
        ExcessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcessBtnActionPerformed(evt);
            }
        });

        XZ_ReportBtn.setBackground(new java.awt.Color(46, 56, 116));
        XZ_ReportBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        XZ_ReportBtn.setForeground(java.awt.Color.white);
        XZ_ReportBtn.setText("X and Z Report");
        XZ_ReportBtn.setFocusPainted(false);
        XZ_ReportBtn.setFocusable(false);
        XZ_ReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XZ_ReportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(790, 790, 790)
                        .addComponent(ManagerMenuLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(ManageInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(XZ_ReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SalesRestockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212)
                                .addComponent(ExcessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(ManagerMenuLabel)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalesRestockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExcessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(XZ_ReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(MainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Back")) {
            this.setVisible(false);
            MainMenu menuFrame = new MainMenu();
            menuFrame.setVisible(true);
        }
    }//GEN-LAST:event_MainMenuBtnActionPerformed

    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void ManageInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageInventoryBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Manage Inventory")) {
            this.setVisible(false);
            ManageInventoryFrame inventoryFrame = new ManageInventoryFrame();
            inventoryFrame.setVisible(true);
        }
    }//GEN-LAST:event_ManageInventoryBtnActionPerformed
    
    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void SalesRestockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesRestockBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Sales and Restock")) {
            this.setVisible(false);
            SalesRestockFrame salesRestock = new SalesRestockFrame();
            salesRestock.setVisible(true);
        }
    }//GEN-LAST:event_SalesRestockBtnActionPerformed

    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void ExcessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcessBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Excess Report")) {
            this.setVisible(false);
            ExcessReportFrame excessFrame = new ExcessReportFrame();
            excessFrame.setVisible(true);
        }
    }//GEN-LAST:event_ExcessBtnActionPerformed

    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void XZ_ReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XZ_ReportBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("X and Z Report")) {
            this.setVisible(false);
            XZ_ReportFrame XZFrame = new XZ_ReportFrame();
            XZFrame.setVisible(true);
        }
    }//GEN-LAST:event_XZ_ReportBtnActionPerformed

    /**
     * Creates Manager Menu and sets it to visible
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
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManagerMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcessBtn;
    private javax.swing.JButton MainMenuBtn;
    private javax.swing.JButton ManageInventoryBtn;
    private javax.swing.JLabel ManagerMenuLabel;
    private javax.swing.JButton SalesRestockBtn;
    private javax.swing.JButton XZ_ReportBtn;
    // End of variables declaration//GEN-END:variables
}
