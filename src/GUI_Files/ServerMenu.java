package GUI_Files;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class ServerMenu extends javax.swing.JFrame {

    /**
     * Creates new form ServerMenu
     */
    public ServerMenu() {
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

        OrderLabel = new javax.swing.JLabel();
        MainDishPanel = new javax.swing.JPanel();
        MainDishLabel = new javax.swing.JLabel();
        BaseIngredients = new javax.swing.JComboBox<>();
        MeatChoice = new javax.swing.JComboBox<>();
        DressingChoice = new javax.swing.JComboBox<>();
        ExtrasChoice = new javax.swing.JComboBox<>();
        ToppingsChoice = new javax.swing.JComboBox<>();
        ToppingsChoice1 = new javax.swing.JComboBox<>();
        ToppingsChoice2 = new javax.swing.JComboBox<>();
        ToppingsLabel = new javax.swing.JLabel();
        DrinkAndExtrasPanel = new javax.swing.JPanel();
        SidesLabel = new javax.swing.JLabel();
        DrinkLabel = new javax.swing.JLabel();
        DrinkSlider = new javax.swing.JSlider();
        SidesSelection = new javax.swing.JComboBox<>();
        SubmitOrder = new javax.swing.JButton();
        OrderTotalPanel = new javax.swing.JPanel();
        PriceLabel = new javax.swing.JLabel();
        OrderTotalLabel = new javax.swing.JLabel();
        MainMenuServerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OrderLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        OrderLabel.setText("Place Your Order:");

        MainDishPanel.setBackground(new java.awt.Color(46, 56, 116));
        MainDishPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MainDishLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        MainDishLabel.setForeground(java.awt.Color.white);
        MainDishLabel.setText("Choose 3 Toppings");

        BaseIngredients.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brown Rice", "Rice Pillaf", "Pita" }));
        BaseIngredients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaseIngredientsActionPerformed(evt);
            }
        });

        MeatChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Falafel", "Meatballs" }));
        MeatChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeatChoiceActionPerformed(evt);
            }
        });

        DressingChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Dressing", "Greek Yogurt", "Aioli", "Harrisa", "Tahini", "Oregano" }));
        DressingChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DressingChoiceActionPerformed(evt);
            }
        });

        ExtrasChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Extras", "Extra Protein", "Extra Dressing" }));
        ExtrasChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtrasChoiceActionPerformed(evt);
            }
        });

        ToppingsChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Toppings", "Feta Cheese", "Cucumber", "Tzatziki", "Hot Sauce", "Peppers", "Hummus", "Olives", "Onions", "Tomato" }));
        ToppingsChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToppingsChoiceActionPerformed(evt);
            }
        });

        ToppingsChoice1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Toppings", "Feta Cheese", "Cucumber", "Tzatziki", "Hot Sauce", "Peppers", "Hummus", "Olives", "Onions", "Tomato" }));
        ToppingsChoice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToppingsChoice1ActionPerformed(evt);
            }
        });

        ToppingsChoice2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Toppings", "Feta Cheese", "Cucumber", "Tzatziki", "Hot Sauce", "Peppers", "Hummus", "Olives", "Onions", "Tomato" }));
        ToppingsChoice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToppingsChoice2ActionPerformed(evt);
            }
        });

        ToppingsLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N
        ToppingsLabel.setForeground(java.awt.Color.white);
        ToppingsLabel.setText("Main Dish");

        javax.swing.GroupLayout MainDishPanelLayout = new javax.swing.GroupLayout(MainDishPanel);
        MainDishPanel.setLayout(MainDishPanelLayout);
        MainDishPanelLayout.setHorizontalGroup(
            MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDishPanelLayout.createSequentialGroup()
                .addGroup(MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainDishPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BaseIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ToppingsChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MeatChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DressingChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExtrasChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ToppingsChoice1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ToppingsChoice2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainDishPanelLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(MainDishLabel)))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainDishPanelLayout.createSequentialGroup()
                    .addContainerGap(206, Short.MAX_VALUE)
                    .addComponent(ToppingsLabel)
                    .addGap(186, 186, 186)))
        );
        MainDishPanelLayout.setVerticalGroup(
            MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainDishPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(BaseIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(MeatChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(DressingChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ExtrasChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MainDishLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ToppingsChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ToppingsChoice1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ToppingsChoice2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainDishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MainDishPanelLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(ToppingsLabel)
                    .addContainerGap(513, Short.MAX_VALUE)))
        );

        DrinkAndExtrasPanel.setBackground(new java.awt.Color(46, 56, 116));
        DrinkAndExtrasPanel.setPreferredSize(new java.awt.Dimension(549, 609));

        SidesLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 30)); // NOI18N
        SidesLabel.setForeground(java.awt.Color.white);
        SidesLabel.setText("Sides");

        DrinkLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 30)); // NOI18N
        DrinkLabel.setForeground(java.awt.Color.white);
        DrinkLabel.setText("Drinks");

        DrinkSlider.setBackground(new java.awt.Color(46, 56, 116));
        DrinkSlider.setForeground(java.awt.Color.white);
        DrinkSlider.setMajorTickSpacing(1);
        DrinkSlider.setMaximum(5);
        DrinkSlider.setMinorTickSpacing(1);
        DrinkSlider.setPaintLabels(true);
        DrinkSlider.setPaintTicks(true);
        DrinkSlider.setSnapToTicks(true);
        DrinkSlider.setValue(0);

        SidesSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Sides", "Salad", "Falafels", "Hummus & Pita" }));
        SidesSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesSelectionActionPerformed(evt);
            }
        });

        SubmitOrder.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SubmitOrder.setText("Submit Order");
        SubmitOrder.setFocusable(false);
        SubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DrinkAndExtrasPanelLayout = new javax.swing.GroupLayout(DrinkAndExtrasPanel);
        DrinkAndExtrasPanel.setLayout(DrinkAndExtrasPanelLayout);
        DrinkAndExtrasPanelLayout.setHorizontalGroup(
            DrinkAndExtrasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinkAndExtrasPanelLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(DrinkAndExtrasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinkAndExtrasPanelLayout.createSequentialGroup()
                        .addComponent(DrinkLabel)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinkAndExtrasPanelLayout.createSequentialGroup()
                        .addComponent(DrinkSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinkAndExtrasPanelLayout.createSequentialGroup()
                        .addComponent(SidesLabel)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinkAndExtrasPanelLayout.createSequentialGroup()
                        .addComponent(SidesSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinkAndExtrasPanelLayout.createSequentialGroup()
                        .addComponent(SubmitOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        DrinkAndExtrasPanelLayout.setVerticalGroup(
            DrinkAndExtrasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinkAndExtrasPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(DrinkLabel)
                .addGap(50, 50, 50)
                .addComponent(DrinkSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(SidesLabel)
                .addGap(31, 31, 31)
                .addComponent(SidesSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(SubmitOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        OrderTotalPanel.setBackground(new java.awt.Color(46, 56, 116));

        PriceLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        PriceLabel.setForeground(java.awt.Color.white);
        PriceLabel.setText("$0.00");

        OrderTotalLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 50)); // NOI18N
        OrderTotalLabel.setForeground(java.awt.Color.white);
        OrderTotalLabel.setText("Total Price:");

        javax.swing.GroupLayout OrderTotalPanelLayout = new javax.swing.GroupLayout(OrderTotalPanel);
        OrderTotalPanel.setLayout(OrderTotalPanelLayout);
        OrderTotalPanelLayout.setHorizontalGroup(
            OrderTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderTotalPanelLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(OrderTotalLabel)
                .addGap(41, 41, 41)
                .addComponent(PriceLabel)
                .addGap(211, 211, 211))
        );
        OrderTotalPanelLayout.setVerticalGroup(
            OrderTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderTotalPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(OrderTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderTotalLabel)
                    .addComponent(PriceLabel))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        MainMenuServerBtn.setBackground(new java.awt.Color(46, 56, 116));
        MainMenuServerBtn.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        MainMenuServerBtn.setForeground(java.awt.Color.white);
        MainMenuServerBtn.setText("Back");
        MainMenuServerBtn.setToolTipText("");
        MainMenuServerBtn.setFocusable(false);
        MainMenuServerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuServerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OrderTotalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(MainMenuServerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(779, 779, 779)
                            .addComponent(OrderLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(400, 400, 400)
                            .addComponent(MainDishPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78)
                            .addComponent(DrinkAndExtrasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(OrderLabel)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainDishPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DrinkAndExtrasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainMenuServerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrderTotalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ToppingsChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToppingsChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToppingsChoiceActionPerformed

    private void BaseIngredientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaseIngredientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BaseIngredientsActionPerformed

    private void MeatChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeatChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MeatChoiceActionPerformed

    private void DressingChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DressingChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DressingChoiceActionPerformed

    private void ExtrasChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtrasChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExtrasChoiceActionPerformed

    private void SidesSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidesSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SidesSelectionActionPerformed

    private void MainMenuServerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuServerBtnActionPerformed
        // TODO add your handling code here:
        String s = evt.getActionCommand();
        if (s.equals("Back")) {
            this.setVisible(false);
            MainMenu menuFrame = new MainMenu();
            menuFrame.setVisible(true);
        }
    }//GEN-LAST:event_MainMenuServerBtnActionPerformed

    private void SubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitOrderActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Order Submitted");
    }//GEN-LAST:event_SubmitOrderActionPerformed

    private void ToppingsChoice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToppingsChoice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToppingsChoice1ActionPerformed

    private void ToppingsChoice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToppingsChoice2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToppingsChoice2ActionPerformed

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
            java.util.logging.Logger.getLogger(ServerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ServerMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BaseIngredients;
    private javax.swing.JComboBox<String> DressingChoice;
    private javax.swing.JPanel DrinkAndExtrasPanel;
    private javax.swing.JLabel DrinkLabel;
    private javax.swing.JSlider DrinkSlider;
    private javax.swing.JComboBox<String> ExtrasChoice;
    private javax.swing.JLabel MainDishLabel;
    private javax.swing.JPanel MainDishPanel;
    private javax.swing.JButton MainMenuServerBtn;
    private javax.swing.JComboBox<String> MeatChoice;
    private javax.swing.JLabel OrderLabel;
    private javax.swing.JLabel OrderTotalLabel;
    private javax.swing.JPanel OrderTotalPanel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel SidesLabel;
    private javax.swing.JComboBox<String> SidesSelection;
    private javax.swing.JButton SubmitOrder;
    private javax.swing.JComboBox<String> ToppingsChoice;
    private javax.swing.JComboBox<String> ToppingsChoice1;
    private javax.swing.JComboBox<String> ToppingsChoice2;
    private javax.swing.JLabel ToppingsLabel;
    // End of variables declaration//GEN-END:variables
}
