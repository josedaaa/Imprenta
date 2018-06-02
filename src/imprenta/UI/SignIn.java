/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta.UI;

import imprenta.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
        setIconImage(new ImageIcon("assets/icons/account_circle_black_18x18.png").getImage());
        pnlCliente.setVisible(false);
        pnlOperario.setVisible(false);
        lblNifIncorrecto.setVisible(false);
        lblHuella.setIcon(new ImageIcon("assets/icons/fingerprint_black_36x36.png"));
        lblHuella.setEnabled(false);
        lblPistaHuella.setVisible(false);
        setLocationRelativeTo(null);
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
        btnOpera = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlCliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClienteNombre = new javax.swing.JTextField();
        btnClienteAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblNuevoCliente = new javax.swing.JLabel();
        pnlOperario = new javax.swing.JPanel();
        btnOperaAtras = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOperaNif = new javax.swing.JTextField();
        lblHuella = new javax.swing.JLabel();
        lblPistaHuella = new javax.swing.JLabel();
        lblNifIncorrecto = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        lblNuevoOperario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Iniciar sesión");

        btnOpera.setText("Operario");
        btnOpera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperaActionPerformed(evt);
            }
        });

        btnCliente.setText("Cliente");
        btnCliente.setToolTipText("En desarrollo...");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
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
                    .addComponent(btnCliente)
                    .addComponent(btnOpera)
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
                .addComponent(btnOpera)
                .addGap(32, 32, 32)
                .addComponent(btnCliente)
                .addGap(81, 81, 81))
        );

        getContentPane().add(pnlHome, "card2");

        jLabel3.setText("Cliente");

        jLabel4.setText("Nombre:");

        btnClienteAtras.setText("Atrás");
        btnClienteAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteAtrasActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("En el futuro requerirá verificación para acceder.");

        lblNuevoCliente.setFont(lblNuevoCliente.getFont());
        lblNuevoCliente.setForeground(new java.awt.Color(0, 102, 102));
        lblNuevoCliente.setText("Soy un nuevo cliente");
        lblNuevoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevoClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNuevoClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNuevoClienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClienteAtras))
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4))
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5)
                            .addComponent(txtClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lblNuevoCliente))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClienteAtras)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblNuevoCliente)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(pnlCliente, "card3");

        btnOperaAtras.setText("Atrás");
        btnOperaAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperaAtrasActionPerformed(evt);
            }
        });

        jLabel6.setText("Operario");

        jLabel7.setText("NIF:");

        txtOperaNif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOperaNifKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOperaNifKeyReleased(evt);
            }
        });

        lblHuella.setEnabled(false);

        lblPistaHuella.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPistaHuella.setText("Presiona el escáner de huellas situado en la tecla Entrar");

        lblNifIncorrecto.setForeground(java.awt.Color.red);
        lblNifIncorrecto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNifIncorrecto.setText("El NIF introducido no es válido.");

        jToggleButton1.setText("entrar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        lblNuevoOperario.setFont(lblNuevoOperario.getFont());
        lblNuevoOperario.setForeground(new java.awt.Color(0, 102, 102));
        lblNuevoOperario.setText("Soy un nuevo operario");
        lblNuevoOperario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevoOperarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNuevoOperarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNuevoOperarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlOperarioLayout = new javax.swing.GroupLayout(pnlOperario);
        pnlOperario.setLayout(pnlOperarioLayout);
        pnlOperarioLayout.setHorizontalGroup(
            pnlOperarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperarioLayout.createSequentialGroup()
                .addGroup(pnlOperarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOperarioLayout.createSequentialGroup()
                        .addGroup(pnlOperarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOperarioLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(pnlOperarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(lblHuella)
                                    .addComponent(jLabel6)))
                            .addGroup(pnlOperarioLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(pnlOperarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtOperaNif, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNifIncorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(pnlOperarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlOperarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPistaHuella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlOperarioLayout.createSequentialGroup()
                                .addComponent(btnOperaAtras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton1)))))
                .addContainerGap())
            .addGroup(pnlOperarioLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(lblNuevoOperario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOperarioLayout.setVerticalGroup(
            pnlOperarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOperarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOperarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOperaAtras)
                    .addComponent(jToggleButton1))
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOperaNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNifIncorrecto)
                .addGap(47, 47, 47)
                .addComponent(lblHuella, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPistaHuella)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNuevoOperario)
                .addGap(30, 30, 30))
        );

        getContentPane().add(pnlOperario, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperaActionPerformed
        pnlHome.setVisible(false);
        pnlOperario.setVisible(true);
    }//GEN-LAST:event_btnOperaActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        pnlHome.setVisible(false);
        pnlCliente.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnClienteAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAtrasActionPerformed
        pnlCliente.setVisible(false);
        pnlHome.setVisible(true);
    }//GEN-LAST:event_btnClienteAtrasActionPerformed

    private void btnOperaAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperaAtrasActionPerformed
        pnlOperario.setVisible(false);
        lblHuella.setIcon(new ImageIcon("assets/icons/fingerprint_black_36x36.png"));
        lblPistaHuella.setText("Presiona el escáner de huellas situado en la tecla Entrar");
        lblPistaHuella.setForeground(Color.black);
        pnlHome.setVisible(true);
    }//GEN-LAST:event_btnOperaAtrasActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        entrar(2);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtOperaNifKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperaNifKeyPressed
        if (lblHuella.isEnabled()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                if (simulacionHuellaDetectada()) {
                    int tipo = tipoOperario();
                    if (tipo >= 0 && tipo <= 2) {
                        huellaCorrecta();
                        entrar(tipo);
                    } else {
                        JOptionPane.showMessageDialog(
                                rootPane,
                                "<html>"
                                + "<p>El operario con NIF: " + txtOperaNif.getText() + "</p>"
                                + "<p>no existe o no tiene permisos para usar esta herramienta.</p>"
                                + "</html>",
                                "Operario no válido",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                } else {
                    lblHuella.setIcon(new ImageIcon("assets/icons/fingerprint_red_36x36.png"));
                    lblPistaHuella.setText(
                            "<html>"
                            + "<p>Huella no reconocida.</p>"
                            + "<p>Limpia el sensor y vuelve a intentarlo.</p>"
                            + "</html>"
                    );
                    lblPistaHuella.setForeground(Color.red);
                }
            }
        }
    }//GEN-LAST:event_txtOperaNifKeyPressed

    private void txtOperaNifKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperaNifKeyReleased
        if (!Validaciones.validarNIF(txtOperaNif.getText()) && !txtOperaNif.getText().equals("")) {
            lblNifIncorrecto.setVisible(true);
            lblHuella.setEnabled(false);
            lblPistaHuella.setVisible(false);
        } else {
            if (!txtOperaNif.getText().equals("")) {
                lblHuella.setEnabled(true);
                lblPistaHuella.setVisible(true);

            }
            lblNifIncorrecto.setVisible(false);
        }
    }//GEN-LAST:event_txtOperaNifKeyReleased

    private void lblNuevoClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoClienteMouseEntered
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblNuevoClienteMouseEntered

    private void lblNuevoClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoClienteMouseExited
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_lblNuevoClienteMouseExited

    private void lblNuevoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoClienteMouseClicked
        new NuevoCliente(this, true);
    }//GEN-LAST:event_lblNuevoClienteMouseClicked

    private void lblNuevoOperarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoOperarioMouseClicked
        new NuevoOperario(this, true);
    }//GEN-LAST:event_lblNuevoOperarioMouseClicked

    private void lblNuevoOperarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoOperarioMouseEntered
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblNuevoOperarioMouseEntered

    private void lblNuevoOperarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoOperarioMouseExited
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_lblNuevoOperarioMouseExited

    private boolean simulacionHuellaDetectada() {
        return Math.random() > 0.15;
    }

    private int tipoOperario() {
        String nif = txtOperaNif.getText();
        for (Operario o : Datos.operarios) {
            if(nif.equalsIgnoreCase(o.getNIF())) {
                Datos.opActual = o;
                if(o instanceof OMaquina) {
                    return 0;
                } else if (o instanceof OImpresion) {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return -1;
    } //Necesita revisión

    private void huellaCorrecta() {
        String nomOp = ""; //usuario.getNombre();
        lblHuella.setIcon(new ImageIcon("assets/icons/fingerprint_green_36x36.png"));
        lblPistaHuella.setText("Bienvenido " + nomOp);
        lblPistaHuella.setForeground(Color.green);
        JOptionPane.showInternalOptionDialog(
                rootPane,
                "Autenticación correcta",
                null,
                JOptionPane.OK_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new String[]{
                    "Entrar"
                },
                "Entrar"
        );
    }

    private void entrar(int tipo) {
        new MainOperario(tipo).setVisible(true);
        this.dispose();
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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnClienteAtras;
    private javax.swing.JButton btnOpera;
    private javax.swing.JButton btnOperaAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblHuella;
    private javax.swing.JLabel lblNifIncorrecto;
    private javax.swing.JLabel lblNuevoCliente;
    private javax.swing.JLabel lblNuevoOperario;
    private javax.swing.JLabel lblPistaHuella;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlOperario;
    private javax.swing.JTextField txtClienteNombre;
    private javax.swing.JTextField txtOperaNif;
    // End of variables declaration//GEN-END:variables

}
