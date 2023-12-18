package LoginAsAdmin;

public class MenuAdmin extends javax.swing.JFrame {

    public MenuAdmin() {
        initComponents();
        jLabel1.setText("WELCOME " + LoginAdmin.username);
        jPanel6.setBackground(new java.awt.Color(242,242,242));
        jPanel7.setBackground(new java.awt.Color(242,242,242));
        jPanel8.setBackground(new java.awt.Color(242,242,242));
        jPanel9.setBackground(new java.awt.Color(242,242,242));
        listOfRegistration1.setVisible(false);
        accountList1.setVisible(false);
        addConsultation1.setVisible(false);
        
        CloseMenu();
    }

    private void CloseMenu(){
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
    }
    
    private void OpenMenu(){
        jPanel6.setVisible(true);
        jPanel7.setVisible(true);
        jPanel8.setVisible(true);
        jPanel9.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
    }
    
    private void HideText(){
        jLabel4.setVisible(false);
        jLabel2.setVisible(false);
        jButton2.setVisible(false);
        jButton4.setVisible(false);
        jButton3.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        listOfRegistration1 = new LoginAsAdmin.ListOfRegistration();
        addConsultation1 = new LoginAsAdmin.AddConsultation();
        accountList1 = new LoginAsAdmin.AccountList();
        jDesktopPane2 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("LIST OF REGISTRATION");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 47, 170, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel1.setText("WELCOME ADMIN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 182, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu Icon.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 1, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 50));

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("ACCOUNT LIST");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 77, 170, -1));

        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("LOGOUT");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 136, 170, -1));

        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("ADD CONSULTATION");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 106, 170, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("P U S K E S M A S");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(0, 200, 1200, 30);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DANGUN");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(0, 230, 1200, 40);

        jButton2.setText("LIST OF REGISTRATION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(510, 280, 180, 40);

        jButton3.setText("ADD CONSULTATION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(510, 380, 180, 40);

        jButton4.setText("ACCOUNT LIST");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton4);
        jButton4.setBounds(510, 330, 180, 40);

        jButton5.setText("ACCOUNT LIST");
        jDesktopPane1.add(jButton5);
        jButton5.setBounds(510, 330, 180, 40);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDesktopPane1.add(jPanel12);
        jPanel12.setBounds(40, 370, 0, 0);

        listOfRegistration1.setVisible(true);
        jDesktopPane1.add(listOfRegistration1);
        listOfRegistration1.setBounds(0, -20, 1200, 664);

        addConsultation1.setVisible(true);
        jDesktopPane1.add(addConsultation1);
        addConsultation1.setBounds(0, -20, 1200, 664);

        accountList1.setVisible(true);
        jDesktopPane1.add(accountList1);
        accountList1.setBounds(0, -30, 1200, 664);
        jDesktopPane1.add(jDesktopPane2);
        jDesktopPane2.setBounds(0, 0, 1200, 630);

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        accountList1.setVisible(true);
        listOfRegistration1.setVisible(false);
        addConsultation1.setVisible(false);
        HideText();
        CloseMenu();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel6.setBackground(new java.awt.Color(242,242,242));
        jPanel7.setBackground(new java.awt.Color(153,153,153));
        jPanel8.setBackground(new java.awt.Color(242,242,242));
        jPanel9.setBackground(new java.awt.Color(242,242,242));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel6.setBackground(new java.awt.Color(242,242,242));
        jPanel7.setBackground(new java.awt.Color(242,242,242));
        jPanel8.setBackground(new java.awt.Color(242,242,242));
        jPanel9.setBackground(new java.awt.Color(242,242,242));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    if (jPanel6.isVisible()) {
        CloseMenu();
    } 
    else {
        OpenMenu();
    }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new java.awt.Color(242,242,242));
        jPanel7.setBackground(new java.awt.Color(242,242,242));
        jPanel8.setBackground(new java.awt.Color(242,242,242));
        jPanel9.setBackground(new java.awt.Color(242,242,242));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(new java.awt.Color(153,153,153));
        jPanel7.setBackground(new java.awt.Color(242,242,242));
        jPanel8.setBackground(new java.awt.Color(242,242,242));
        jPanel9.setBackground(new java.awt.Color(242,242,242));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        listOfRegistration1.setVisible(true);
        accountList1.setVisible(false);
        addConsultation1.setVisible(false);
        HideText();
        CloseMenu();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        listOfRegistration1.setVisible(false);
        accountList1.setVisible(false);
        addConsultation1.setVisible(true);
        HideText();
        CloseMenu();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        jPanel6.setBackground(new java.awt.Color(242,242,242));
        jPanel7.setBackground(new java.awt.Color(242,242,242));
        jPanel8.setBackground(new java.awt.Color(153,153,153));
        jPanel9.setBackground(new java.awt.Color(242,242,242));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        jPanel6.setBackground(new java.awt.Color(242,242,242));
        jPanel7.setBackground(new java.awt.Color(242,242,242));
        jPanel8.setBackground(new java.awt.Color(242,242,242));
        jPanel9.setBackground(new java.awt.Color(242,242,242));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        LoginAdmin la = new LoginAdmin();
        la.setVisible(true);
        la.pack();
        la.setLocationRelativeTo(null);
        la.setDefaultCloseOperation(LoginAdmin.EXIT_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        jPanel6.setBackground(new java.awt.Color(242,242,242));
        jPanel7.setBackground(new java.awt.Color(242,242,242));
        jPanel8.setBackground(new java.awt.Color(242,242,242));
        jPanel9.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel6.setBackground(new java.awt.Color(242,242,242));
        jPanel7.setBackground(new java.awt.Color(242,242,242));
        jPanel8.setBackground(new java.awt.Color(242,242,242));
        jPanel9.setBackground(new java.awt.Color(242,242,242));
    }//GEN-LAST:event_jPanel9MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listOfRegistration1.setVisible(true);
        accountList1.setVisible(false);
        addConsultation1.setVisible(false);
        HideText();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        listOfRegistration1.setVisible(false);
        accountList1.setVisible(true);
        addConsultation1.setVisible(false);
        HideText();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        listOfRegistration1.setVisible(false);
        accountList1.setVisible(false);
        addConsultation1.setVisible(true);
        HideText();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LoginAsAdmin.AccountList accountList1;
    private LoginAsAdmin.AddConsultation addConsultation1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private LoginAsAdmin.ListOfRegistration listOfRegistration1;
    // End of variables declaration//GEN-END:variables
}
