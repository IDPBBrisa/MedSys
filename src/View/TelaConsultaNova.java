package View;

import Model.Consulta;
import Model.Medico;
import Model.Paciente;
import Model.Sexo;
import dao.PacienteDao;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import util.Botoes;
import util.Formata;

public class TelaConsultaNova extends javax.swing.JFrame {
    Paciente paciente;
    Medico medico;
    /** 
     * Preenche o combobox de medicos com todos os medicos presentes na base de dados
     */
    private void setMedico(){
        Medico med = new Medico();
        for (Medico medico : med.buscar()) {
            cbMedico.addItem(medico.getNome().concat(" "+medico.getSobrenome()));
        }
        
        
        
    }
    
    /*private void setPaciente(){
        Paciente pac = new Paciente();
        for (Paciente paciente : pac.buscar()){
            cbPaciente.addItem(paciente.getNome().concat(" "+paciente.getSobrenome()));
        }
    }*/
    
     /*private void registrarConsulta() {


            String nome = tfNmMed.getText();
            String sobrenome = tfSnMed.getText();
            String CRM = tftCRM.getText();
            String CPF = tffCpfMed.getText();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            String Nascimento = fmt.format(this.dtcDataDeNascimentoMed.getDate());
            String Telefone = TffCelularMed.getText();


		//Consulta cons = new Consulta(Status, DataConsulta, QueixaPaciente, ExameFisico, Conduta, sid, PacienteNome, PacienteSobrenome, MedicoNome, MedicoSobrenome);
                //cons.gravar();
    }*/
    /** 
     * Coloca a mascara nos campos formatados
     */
    private void setMask(){
        tfCPF.setFormatterFactory(Formata.cpf());
    }

    
    /**
     * Creates new form TelaConsultaNova
     */
    public TelaConsultaNova() {
        initComponents();
        centralizarComponente();
        setMedico();
        setMask();
        //setPaciente();
    }
     /**
     *Centraliza a view na tela do usuario
      */
    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovaConsulta = new javax.swing.JLabel();
        cbMedico = new javax.swing.JComboBox<>();
        lblMedico = new javax.swing.JLabel();
        lblDataDaConsulta = new javax.swing.JLabel();
        lblIcone = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblbSalvar = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        BtnPesquisa = new javax.swing.JButton();
        tfNomePaciente = new javax.swing.JTextField();
        tfCPF = new javax.swing.JFormattedTextField();

        setTitle("Nova Consulta");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblNovaConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNovaConsulta.setText("Nova consulta");

        lblMedico.setText("Medico");

        lblDataDaConsulta.setText("Data da consulta");

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Doctors_Bag_70px.png"))); // NOI18N

        lblbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Save_30px.png"))); // NOI18N
        lblbSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbSalvarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblbSalvarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblbSalvarMouseEntered(evt);
            }
        });

        lblPaciente.setText("Paciente");

        BtnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Search_20px.png"))); // NOI18N
        BtnPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPesquisaMouseClicked(evt);
            }
        });

        tfNomePaciente.setEditable(false);

        tfCPF.setText("CPF do Paciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblIcone)
                        .addGap(90, 90, 90)
                        .addComponent(lblNovaConsulta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblbSalvar)
                                .addGap(40, 40, 40)))
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(tfNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPaciente)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(lblMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDataDaConsulta)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcone)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblNovaConsulta)))
                .addGap(20, 20, 20)
                .addComponent(lblPaciente)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisa))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDataDaConsulta)
                        .addGap(6, 6, 6)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblbSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbSalvarMouseEntered
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.botabotao(lblbSalvar);
    }//GEN-LAST:event_lblbSalvarMouseEntered

    private void lblbSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbSalvarMouseExited
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.tirabotao(lblbSalvar);
    }//GEN-LAST:event_lblbSalvarMouseExited

    private void lblbSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbSalvarMouseClicked
        // TODO add your handling code here:
        TelaConsultas TC = new TelaConsultas();
        TC.setTable();
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String data = fmt.format(jDateChooser1.getDate());

        Consulta consulta = new Consulta(data, cbMedico.getSelectedItem().toString(), tfNomePaciente.getText());
        consulta.gravar();
        
    }//GEN-LAST:event_lblbSalvarMouseClicked

    private void BtnPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPesquisaMouseClicked
        // TODO add your handling code here:
        PacienteDao dao = new PacienteDao();
        paciente = dao.findOne(tfCPF.getText());
        tfNomePaciente.setText(paciente.getNome() + " " + paciente.getSobrenome());
    }//GEN-LAST:event_BtnPesquisaMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        TelaConsultas TC = new TelaConsultas();
        TC.setTable();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        TelaConsultas TC = new TelaConsultas();
        TC.setTable();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(TelaConsultaNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaNova().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPesquisa;
    private javax.swing.JComboBox<String> cbMedico;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel lblDataDaConsulta;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblNovaConsulta;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblbSalvar;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfNomePaciente;
    // End of variables declaration//GEN-END:variables
}
