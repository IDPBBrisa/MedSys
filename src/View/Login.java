package View;

import Controller.Principal;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

        
    
    private void LogarFuncionario(){
        if(tfUserMed.getText().length() ==0){
            JOptionPane.showMessageDialog(null,"Há campos em branco, preencha todas!");
        } else if(pfPassMed.getPassword().length==0){
            JOptionPane.showMessageDialog(null,"Há campos em branco, preencha todos!");
        } else {
            String username = tfUserMed.getText();
            char[] pass = pfPassMed.getPassword();
            String password = String.copyValueOf(pass);
            
            Principal l = new Principal();
            l.validarlogin(username, password);
            
            if(l.validarlogin(username,password)){
                System.out.println("Login Valido");
		Interface i = new Interface();
		i.setVisible(true);
                this.setVisible(false);
            } else {
                System.out.println("Login Invalido");
            }
        }
    }
    
    public Login() {
        initComponents();
        tfUserOp.requestFocus();
        tfUserOp.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpClasseLogin = new javax.swing.JTabbedPane();
        pnLogPac = new javax.swing.JPanel();
        lblLogCliente = new javax.swing.JLabel();
        tfUserOp = new javax.swing.JTextField();
        pfPassOp = new javax.swing.JPasswordField();
        btnPacLogin = new javax.swing.JButton();
        lblImgPac = new javax.swing.JLabel();
        pnLogMed = new javax.swing.JPanel();
        lblLogMed = new javax.swing.JLabel();
        lblImgMed = new javax.swing.JLabel();
        tfUserMed = new javax.swing.JTextField();
        pfPassMed = new javax.swing.JPasswordField();
        btnLogMed = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tpClasseLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpClasseLoginMouseClicked(evt);
            }
        });

        lblLogCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLogCliente.setText("Operador");

        tfUserOp.setText("Usuario");

        pfPassOp.setText("jPasswordField1");
        pfPassOp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfPassOpFocusGained(evt);
            }
        });

        btnPacLogin.setText("Login");

        lblImgPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Access_100px.png"))); // NOI18N

        javax.swing.GroupLayout pnLogPacLayout = new javax.swing.GroupLayout(pnLogPac);
        pnLogPac.setLayout(pnLogPacLayout);
        pnLogPacLayout.setHorizontalGroup(
            pnLogPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogPacLayout.createSequentialGroup()
                .addGroup(pnLogPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLogPacLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblImgPac)
                        .addGap(18, 18, 18)
                        .addGroup(pnLogPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUserOp, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfPassOp, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnLogPacLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnPacLogin))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLogPacLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogCliente)
                        .addGap(74, 74, 74)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        pnLogPacLayout.setVerticalGroup(
            pnLogPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogPacLayout.createSequentialGroup()
                .addGroup(pnLogPacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLogPacLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogCliente)
                        .addGap(50, 50, 50)
                        .addComponent(tfUserOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pfPassOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnLogPacLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblImgPac)))
                .addGap(13, 13, 13)
                .addComponent(btnPacLogin)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tpClasseLogin.addTab("Secretaria", pnLogPac);

        lblLogMed.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLogMed.setText("Medico");

        lblImgMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Medical_Doctor_100px.png"))); // NOI18N
        lblImgMed.setToolTipText("");

        tfUserMed.setText("Usuario");

        pfPassMed.setText("jPasswordField2");
        pfPassMed.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfPassMedFocusGained(evt);
            }
        });

        btnLogMed.setText("Login");
        btnLogMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnLogMedLayout = new javax.swing.GroupLayout(pnLogMed);
        pnLogMed.setLayout(pnLogMedLayout);
        pnLogMedLayout.setHorizontalGroup(
            pnLogMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogMedLayout.createSequentialGroup()
                .addGroup(pnLogMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnLogMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnLogMedLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(lblImgMed)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnLogMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pfPassMed)
                                .addComponent(tfUserMed)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLogMedLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogMed)
                            .addGap(89, 89, 89)))
                    .addGroup(pnLogMedLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblLogMed)
                        .addGap(93, 93, 93)))
                .addGap(102, 102, 102))
        );
        pnLogMedLayout.setVerticalGroup(
            pnLogMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogMedLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogMed)
                .addGroup(pnLogMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLogMedLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(tfUserMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pfPassMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnLogMedLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblImgMed)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogMed)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tpClasseLogin.addTab("Medico", pnLogMed);

        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLogin.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpClasseLogin)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogin)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tpClasseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogMedActionPerformed
        // TODO add your handling code here:
        LogarFuncionario();
    }//GEN-LAST:event_btnLogMedActionPerformed

    private void tpClasseLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpClasseLoginMouseClicked
        // TODO add your handling code here:
        tfUserMed.requestFocus();
        tfUserMed.setText("");
        tfUserOp.requestFocus();
        tfUserOp.setText("");
    }//GEN-LAST:event_tpClasseLoginMouseClicked

    private void pfPassMedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassMedFocusGained
        // TODO add your handling code here:
        pfPassMed.setText("");
    }//GEN-LAST:event_pfPassMedFocusGained

    private void pfPassOpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassOpFocusGained
        // TODO add your handling code here:
        pfPassOp.setText("");
    }//GEN-LAST:event_pfPassOpFocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogMed;
    private javax.swing.JButton btnPacLogin;
    private javax.swing.JLabel lblImgMed;
    private javax.swing.JLabel lblImgPac;
    private javax.swing.JLabel lblLogCliente;
    private javax.swing.JLabel lblLogMed;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPasswordField pfPassMed;
    private javax.swing.JPasswordField pfPassOp;
    private javax.swing.JPanel pnLogMed;
    private javax.swing.JPanel pnLogPac;
    private javax.swing.JTextField tfUserMed;
    private javax.swing.JTextField tfUserOp;
    private javax.swing.JTabbedPane tpClasseLogin;
    // End of variables declaration//GEN-END:variables
}
