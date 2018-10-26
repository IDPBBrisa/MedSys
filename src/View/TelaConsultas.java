package View;

import Model.Consulta;
import dao.ConnectionFactory;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class TelaConsultas extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultas
     */
    
    private String a;
    private String b;
    private String c;
    private String d;
    private String d2;
    private String e;
    private String e2;
    
    private void setTable(){
        
        
        
        Consulta con = new Consulta(a,b,c,d,d2,e,e2);
        
        tbConsultaAberta.setModel(con.TableConsulta());
        
        /*DefaultTableModel Consultas = new DefaultTableModel(new String[]{"Codigo da Consulta","Status","Data da Consulta","Paciente","Sobrenome","Medico","Sobrenome"}, 0);
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("Select cd_Consulta,ds_status,dt_consulta,nm_Paciente,sn_Paciente,nm_Medico,sn_Medico from d3_Consultas");
            rs = stmt.executeQuery();
            while(rs.next()){
                String a = rs.getString("cd_Consulta");
                String b = rs.getString("ds_status");
                String c = rs.getString("dt_consulta");
                String d = rs.getString("nm_Paciente");
                String d2 = rs.getString("sn_Paciente");
                String e = rs.getString("nm_Medico");
                String e2 = rs.getString("sn_Medico");
                Consultas.addRow(new Object[]{a,b,c,d,d2,e,e2});
            }
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao pegar dados");
        }
        
        tbConsultaAberta.setModel(Consultas);*/
        
    }
    public TelaConsultas() {
        initComponents();
        setTable();
        centralizarComponente();
    }
    
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

        tfCd_paciente = new javax.swing.JTextField();
        tffCPF = new javax.swing.JFormattedTextField();
        tffNmPaciente = new javax.swing.JTextField();
        jtpConsultas = new javax.swing.JTabbedPane();
        spAbertas = new javax.swing.JScrollPane();
        tbConsultaAberta = new javax.swing.JTable();
        pnBaixadas = new javax.swing.JPanel();
        spBaixadas = new javax.swing.JScrollPane();
        tbConsultasBaixadas = new javax.swing.JTable();
        lblCancelar = new javax.swing.JLabel();
        lblConsultas = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblNomeDoPaciente = new javax.swing.JLabel();
        btplPesquisa = new javax.swing.JPanel();
        btpPesquisa = new javax.swing.JLabel();
        pnbNovaConsulta = new javax.swing.JPanel();
        lblNovaConsulta = new javax.swing.JLabel();
        lblbNovaConsulta = new javax.swing.JLabel();
        pnbCancelarConsulta = new javax.swing.JPanel();
        lblCancelaConsulta = new javax.swing.JLabel();
        lblbCancelarConsulta = new javax.swing.JLabel();

        setTitle("Consultas");

        tbConsultaAberta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código da Consulta", "Status", "Data da Consulta", "Paciente", "Medico", "SID", "Tipo de Exame"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spAbertas.setViewportView(tbConsultaAberta);
        if (tbConsultaAberta.getColumnModel().getColumnCount() > 0) {
            tbConsultaAberta.getColumnModel().getColumn(0).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(1).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(2).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(3).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(4).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(5).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(6).setResizable(false);
        }

        jtpConsultas.addTab("Abertas", spAbertas);

        tbConsultasBaixadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spBaixadas.setViewportView(tbConsultasBaixadas);

        javax.swing.GroupLayout pnBaixadasLayout = new javax.swing.GroupLayout(pnBaixadas);
        pnBaixadas.setLayout(pnBaixadasLayout);
        pnBaixadasLayout.setHorizontalGroup(
            pnBaixadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spBaixadas, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );
        pnBaixadasLayout.setVerticalGroup(
            pnBaixadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spBaixadas, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jtpConsultas.addTab("Baixadas", pnBaixadas);

        lblCancelar.setToolTipText("");

        lblConsultas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblConsultas.setText("Consultas");

        lblCodigo.setText("Codigo");

        lblCpf.setText("Cpf");

        lblNomeDoPaciente.setText("Nome do Paciente");

        btplPesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btpPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Search_20px.png"))); // NOI18N
        btpPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btpPesquisaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btplPesquisaLayout = new javax.swing.GroupLayout(btplPesquisa);
        btplPesquisa.setLayout(btplPesquisaLayout);
        btplPesquisaLayout.setHorizontalGroup(
            btplPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btplPesquisaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btpPesquisa))
        );
        btplPesquisaLayout.setVerticalGroup(
            btplPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btplPesquisaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btpPesquisa))
        );

        pnbNovaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnbNovaConsultaMouseClicked(evt);
            }
        });

        lblNovaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_New_File_50px.png"))); // NOI18N
        lblNovaConsulta.setToolTipText("");

        lblbNovaConsulta.setText("Nova cosulta");

        javax.swing.GroupLayout pnbNovaConsultaLayout = new javax.swing.GroupLayout(pnbNovaConsulta);
        pnbNovaConsulta.setLayout(pnbNovaConsultaLayout);
        pnbNovaConsultaLayout.setHorizontalGroup(
            pnbNovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbNovaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnbNovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbNovaConsulta))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        pnbNovaConsultaLayout.setVerticalGroup(
            pnbNovaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbNovaConsultaLayout.createSequentialGroup()
                .addComponent(lblNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblbNovaConsulta))
        );

        pnbCancelarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnbCancelarConsultaMouseClicked(evt);
            }
        });

        lblCancelaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Delete_File_50px.png"))); // NOI18N

        lblbCancelarConsulta.setText("Cancelar consulta");

        javax.swing.GroupLayout pnbCancelarConsultaLayout = new javax.swing.GroupLayout(pnbCancelarConsulta);
        pnbCancelarConsulta.setLayout(pnbCancelarConsultaLayout);
        pnbCancelarConsultaLayout.setHorizontalGroup(
            pnbCancelarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbCancelarConsultaLayout.createSequentialGroup()
                .addComponent(lblbCancelarConsulta)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnbCancelarConsultaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblCancelaConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnbCancelarConsultaLayout.setVerticalGroup(
            pnbCancelarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbCancelarConsultaLayout.createSequentialGroup()
                .addComponent(lblCancelaConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblbCancelarConsulta))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCd_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tffCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addGap(41, 41, 41)
                                .addComponent(lblCpf)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tffNmPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(lblNomeDoPaciente)
                                .addGap(56, 56, 56)
                                .addComponent(btplPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblConsultas)
                        .addGap(310, 310, 310)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnbNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnbCancelarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lblCancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtpConsultas)
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(lblCpf)
                            .addComponent(lblNomeDoPaciente))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btplPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCd_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffNmPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jtpConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(pnbCancelarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnbNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnbNovaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnbNovaConsultaMouseClicked
        // TODO add your handling code here:
        TelaConsultaNova tc = new TelaConsultaNova();
        tc.setVisible(true);
    }//GEN-LAST:event_pnbNovaConsultaMouseClicked

    private void pnbCancelarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnbCancelarConsultaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnbCancelarConsultaMouseClicked

    private void btpPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btpPesquisaMouseClicked
        // TODO add your handling code here:
        BuscaPacinete bp = new BuscaPacinete();
        bp.setVisible(true);
    }//GEN-LAST:event_btpPesquisaMouseClicked

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
            java.util.logging.Logger.getLogger(TelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btpPesquisa;
    private javax.swing.JPanel btplPesquisa;
    private javax.swing.JTabbedPane jtpConsultas;
    private javax.swing.JLabel lblCancelaConsulta;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNomeDoPaciente;
    private javax.swing.JLabel lblNovaConsulta;
    private javax.swing.JLabel lblbCancelarConsulta;
    private javax.swing.JLabel lblbNovaConsulta;
    private javax.swing.JPanel pnBaixadas;
    private javax.swing.JPanel pnbCancelarConsulta;
    private javax.swing.JPanel pnbNovaConsulta;
    private javax.swing.JScrollPane spAbertas;
    private javax.swing.JScrollPane spBaixadas;
    private javax.swing.JTable tbConsultaAberta;
    private javax.swing.JTable tbConsultasBaixadas;
    private javax.swing.JTextField tfCd_paciente;
    private javax.swing.JFormattedTextField tffCPF;
    private javax.swing.JTextField tffNmPaciente;
    // End of variables declaration//GEN-END:variables
}
