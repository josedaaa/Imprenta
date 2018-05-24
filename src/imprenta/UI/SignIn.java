/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta.UI;

import javax.swing.JFrame;

/**
 *
 * @author DAM101
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        pnlClient.setVisible(false);
        pnlEmployee.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEmployee = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlClient = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClientUser = new javax.swing.JTextField();
        pssClientPassword = new javax.swing.JPasswordField();
        btnClientBack = new javax.swing.JButton();
        btnClientSigIn = new javax.swing.JButton();
        pnlEmployee = new javax.swing.JPanel();
        btnEmplBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmplUser = new javax.swing.JTextField();
        pssEmplPassword = new javax.swing.JPasswordField();
        btnEmplSigIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Iniciar sesión");

        btnEmployee.setText("Empleado");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnClient.setText("Cliente");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        jLabel2.setText("¿Quién eres?");

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(btnClient)
                    .addComponent(btnEmployee)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmployee)
                .addGap(32, 32, 32)
                .addComponent(btnClient)
                .addGap(81, 81, 81))
        );

        getContentPane().add(pnlHome, "card2");

        jLabel3.setText("Cliente");

        jLabel4.setText("Usuario");

        jLabel5.setText("Contraseña");

        btnClientBack.setText("Atrás");
        btnClientBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientBackActionPerformed(evt);
            }
        });

        btnClientSigIn.setText("Entrar");

        javax.swing.GroupLayout pnlClientLayout = new javax.swing.GroupLayout(pnlClient);
        pnlClient.setLayout(pnlClientLayout);
        pnlClientLayout.setHorizontalGroup(
            pnlClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientLayout.createSequentialGroup()
                .addGroup(pnlClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClientBack))
                    .addGroup(pnlClientLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(pnlClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(txtClientUser, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(pssClientPassword)))
                    .addGroup(pnlClientLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnClientSigIn))
                    .addGroup(pnlClientLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlClientLayout.setVerticalGroup(
            pnlClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClientBack)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClientUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pssClientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnClientSigIn)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(pnlClient, "card3");

        btnEmplBack.setText("Atrás");
        btnEmplBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmplBackActionPerformed(evt);
            }
        });

        jLabel6.setText("Empleado");

        jLabel7.setText("Usuario");

        jLabel8.setText("Contraseña");

        txtEmplUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmplUserActionPerformed(evt);
            }
        });

        btnEmplSigIn.setText("Entrar");
        btnEmplSigIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmplSigInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEmployeeLayout = new javax.swing.GroupLayout(pnlEmployee);
        pnlEmployee.setLayout(pnlEmployeeLayout);
        pnlEmployeeLayout.setHorizontalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEmplBack))
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel6))
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txtEmplUser)
                            .addComponent(pssEmplPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnEmplSigIn)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        pnlEmployeeLayout.setVerticalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmplBack)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(59, 59, 59)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmplUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pssEmplPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnEmplSigIn)
                .addGap(38, 38, 38))
        );

        getContentPane().add(pnlEmployee, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmplUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmplUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmplUserActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        pnlHome.setVisible(false);
        pnlEmployee.setVisible(true);
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        pnlHome.setVisible(false);
        pnlClient.setVisible(true);
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnClientBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientBackActionPerformed
        pnlClient.setVisible(false);
        pnlHome.setVisible(true);
    }//GEN-LAST:event_btnClientBackActionPerformed

    private void btnEmplBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmplBackActionPerformed
        pnlEmployee.setVisible(false);
        pnlHome.setVisible(true);
    }//GEN-LAST:event_btnEmplBackActionPerformed

    private void btnEmplSigInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmplSigInActionPerformed
        new MainEmployee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEmplSigInActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnClientBack;
    private javax.swing.JButton btnClientSigIn;
    private javax.swing.JButton btnEmplBack;
    private javax.swing.JButton btnEmplSigIn;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlClient;
    private javax.swing.JPanel pnlEmployee;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPasswordField pssClientPassword;
    private javax.swing.JPasswordField pssEmplPassword;
    private javax.swing.JTextField txtClientUser;
    private javax.swing.JTextField txtEmplUser;
    // End of variables declaration//GEN-END:variables
}
