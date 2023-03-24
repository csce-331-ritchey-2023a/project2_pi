package GUI_Files;

/**
 * Opens the Main Menu JFrame
 * @author Team_Pi
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenuLabel = new javax.swing.JLabel();
        ServerBtn = new javax.swing.JButton();
        ph_logo = new javax.swing.JLabel();
        ManagerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.darkGray);
        setName("mainMenu_Frame"); // NOI18N

        MainMenuLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        MainMenuLabel.setText("Choose Manager or Server Side:");

        ServerBtn.setBackground(new java.awt.Color(46, 56, 116));
        ServerBtn.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N
        ServerBtn.setForeground(java.awt.Color.white);
        ServerBtn.setText("Server");
        ServerBtn.setFocusPainted(false);
        ServerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerBtnActionPerformed(evt);
            }
        });

        ph_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p&hlogo.png"))); // NOI18N

        ManagerBtn.setBackground(new java.awt.Color(46, 56, 116));
        ManagerBtn.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N
        ManagerBtn.setForeground(java.awt.Color.white);
        ManagerBtn.setText("Manager");
        ManagerBtn.setFocusPainted(false);
        ManagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainMenuLabel)
                .addGap(608, 608, 608))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(704, 704, 704)
                        .addComponent(ph_logo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(ServerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(426, 426, 426)
                    .addComponent(ManagerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(444, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(ph_logo)
                .addGap(32, 32, 32)
                .addComponent(MainMenuLabel)
                .addGap(294, 294, 294)
                .addComponent(ServerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(535, 535, 535)
                    .addComponent(ManagerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(385, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void ServerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServerBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Server")) {
            this.setVisible(false);
            ServerMenu serverMenuFrame = new ServerMenu();
            serverMenuFrame.setVisible(true);
        }
    }//GEN-LAST:event_ServerBtnActionPerformed
    
    /**
     * @param ActionEventListener used to determine when the button has been pressed.
    */
    private void ManagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Manager")) {
            this.setVisible(false);
            ManagerMenu managerMenuFrame = new ManagerMenu();
            managerMenuFrame.setVisible(true);
        }
    }//GEN-LAST:event_ManagerBtnActionPerformed

    /**
     * Creates manager Menu and sets it to visible
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainMenuLabel;
    private javax.swing.JButton ManagerBtn;
    private javax.swing.JButton ServerBtn;
    private javax.swing.JLabel ph_logo;
    // End of variables declaration//GEN-END:variables
}
