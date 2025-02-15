package View;

import Model.Endereco;
import Model.EstadoCivil;
import Model.Medico;
import Model.Operador;
import Model.Paciente;
import Model.Sexo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import util.Botoes;
import util.Formata;

public class Cadastros extends javax.swing.JFrame {
    
    /**
     * Registra o medico com as informaçoes inseridas na view */
    private void registrarMedico() {
        if (tfSnMed.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfNmMed.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCpfMed.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tftCRM.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (TffTelefoneMedico.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCelularMedico.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffRgMed.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else {

            String nome = tfNmMed.getText();
            String sobrenome = tfSnMed.getText();
            String CRM = tftCRM.getText();
            String CPF = tffCpfMed.getText();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            String Nascimento = fmt.format(this.dtcDataDeNascimentoMed.getDate());
            String Telefone = TffTelefoneMedico.getText();
            String estadocivil = cbEstadoCivilMedico.getSelectedItem().toString().toUpperCase();
            String sexo = cbSexoMed.getSelectedItem().toString().toUpperCase();
            String Celular = tffCelularMedico.getText();
            String Email = tfEmailMed.getText();
            String RG = tffRgMed.getText();
            String logradouro = tfRuaMed.getText();
            String numero = tfNumeroMed.getText();
            String complemento = tfComplementoMed.getText();
            String cidade = tfCidadeMed.getText();
            String bairro = tfBairroMed.getText();
            int cep = Integer.parseInt(tffCepMed.getText());
            String login = tfUsuarioMed.getText();
            String senha = String.valueOf(pfSenhaMed.getPassword());

            Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
            Medico medico = new Medico(CRM, login, senha, 10, nome, sobrenome, RG, CPF, Nascimento, endereco, Celular, Telefone, Email, EstadoCivil.valueOf(estadocivil), Sexo.valueOf(sexo));
            medico.gravar();

        }
    }
   /**
    * Registra o paciente com as informaçoes inseridas na view */
    private void registrarPaciente() {
        if (tfSnPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfNmPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCpfPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (TffTelefonePaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfEmailPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (TffCelularPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffRgPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else {

            String nome = tfNmPaciente.getText();
            String sobrenome = tfSnPaciente.getText();
            String CPF = tffCpfPaciente.getText();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            String Nascimento = fmt.format(this.dtcDataDeNascimentoPaciente.getDate());
            String Telefone = TffTelefonePaciente.getText();
            String estadocivil = cbEstadoCivil.getSelectedItem().toString().toUpperCase();
            String sexo = cbSexoPac.getSelectedItem().toString().toUpperCase();
            String convenio = cbConvenio.getSelectedItem().toString();
            String Celular = TffCelularPaciente.getText();
            String Email = tfEmailPaciente.getText();
            String RG = tffRgPaciente.getText();
            String logradouro = tfRuaPaciente.getText();
            String numero = tfNumeroPaciente.getText();
            String complemento = tfComplementoPaciente.getText();
            String cidade = tfCidadePaciente.getText();
            String bairro = tfBairroPaciente.getText();
            int cep = Integer.parseInt(tffCepPaciente.getText());

            Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
            Paciente paciente = new Paciente(convenio, nome, sobrenome, RG, CPF, Nascimento, endereco, Celular, Telefone, Email, EstadoCivil.valueOf(estadocivil), Sexo.valueOf(sexo));
            paciente.gravar();

        }
    }
    /**
     * Registra o operador com as informaçoes inseridas na view */
    private void registrarOperador() {
        if (tfSnOperador.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfNmOperador.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCpfOperador.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffTelefoneOperador.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfEmailOperador.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCelularOperador.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffRgOperador.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else {
        
        String nome = tfNmOperador.getText();
        String sobrenome = tfSnOperador.getText();
        String CPF = tffCpfOperador.getText();
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String Nascimento = fmt.format(this.dtcDataDeNascimentoOperador.getDate());
        String Telefone = tffCelularOperador.getText();
        String estadocivil = cbEstadoCivilOperador.getSelectedItem().toString().toUpperCase();
        String sexo = cbSexoOperador.getSelectedItem().toString().toUpperCase();
        String Celular = tffTelefoneOperador.getText();
        String Email = tfEmailOperador.getText();
        String RG = tffRgOperador.getText();
        String logradouro = tfRuaOperador.getText();
        String numero = tfNumeroOperador.getText();
        String complemento = tfComplementoOperador.getText();
        String cidade = tfCidadeOperador.getText();
        String bairro = tfBairroOperador.getText();
        int cep = Integer.parseInt(tffCepOperador.getText());
        String login = tfUserOperador.getText();
        String senha = String.valueOf(pfSenhaOperador.getPassword());
        
        Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
        Operador operador = new Operador(login, senha, 20, nome, sobrenome, RG, CPF, Nascimento, endereco, Celular, Telefone, Email, EstadoCivil.valueOf(estadocivil), Sexo.valueOf(sexo));
        operador.gravar();
    }
    }
    /**
     * Usado para colocar as mascaras nos campos que precisam ser formatados*/
    private void setMask() {
        tffCpfMed.setFormatterFactory(Formata.cpf());
        tffCpfPaciente.setFormatterFactory(Formata.cpf());
        tffCpfOperador.setFormatterFactory(Formata.cpf());
        TffTelefonePaciente.setFormatterFactory(Formata.telefone());
        TffTelefoneMedico.setFormatterFactory(Formata.telefone());
        tffTelefoneOperador.setFormatterFactory(Formata.telefone());
        TffCelularPaciente.setFormatterFactory(Formata.celular());
        tffCelularMedico.setFormatterFactory(Formata.celular());
        tffCelularOperador.setFormatterFactory(Formata.celular());
        tffRgMed.setFormatterFactory(Formata.RG());
        tffRgPaciente.setFormatterFactory(Formata.RG());
        tffRgOperador.setFormatterFactory(Formata.RG());
    }
   /**
    * Limpa os campos do medico*/
    private void LimpaMed() {
	        tfSnMed.setText("");
		tfNmMed.setText("");
		tffCpfMed.setText("");
		tffCelularMedico.setText("");
                tffRgMed.setText("");
                dtcDataDeNascimentoMed.cleanup();
                TffTelefoneMedico.setText("");
                tfEmailMed.setText("");
                tfRuaMed.setText("");
                tfNumeroMed.setText("");
                tfComplementoMed.setText("");
                tfCidadeMed.setText("");
                tfBairroMed.setText("");
                tffCepMed.setText("");
                tfUsuarioMed.setText("");
                pfSenhaMed.setText("");
                tftCRM.setText("");
    }
    /**
     * Limpa os campos do Paciente*/
    private void LimpaPaciente() {
		tfSnPaciente.setText("");
		tfNmPaciente.setText("");
		tffCpfPaciente.setText("");
		TffTelefonePaciente.setText("");
                tffRgPaciente.setText("");
                dtcDataDeNascimentoPaciente.cleanup();
                TffCelularPaciente.setText("");
                tfEmailPaciente.setText("");
                tfRuaPaciente.setText("");
                tfNumeroPaciente.setText("");
                tfComplementoPaciente.setText("");
                tfCidadePaciente.setText("");
                tfBairroPaciente.setText("");
                tffCepPaciente.setText("");
    }
        /**
         * Limpa os campos do Operador*/
        private void LimpaOperador() {
		tfSnOperador.setText("");
		tfNmOperador.setText("");
		tffCpfOperador.setText("");
		tffTelefoneOperador.setText("");
                tffRgOperador.setText("");
                dtcDataDeNascimentoOperador.cleanup();
                tffCelularOperador.setText("");
                tfEmailOperador.setText("");
                tfRuaOperador.setText("");
                tfNumeroOperador.setText("");
                tfComplementoOperador.setText("");
                tfCidadeOperador.setText("");
                tfBairroOperador.setText("");
                tffCepOperador.setText("");
                tfUserOperador.setText("");
                pfSenhaOperador.setText("");
    }

    /**
     * Creates new form CadastroPaciente
     */
    public Cadastros() {
        initComponents();
        setMask();
        centralizarComponente();
    }
    /**
     * Centraliza a view na tela do usuario*/
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

        lblTitulo = new javax.swing.JLabel();
        tbCadastros = new javax.swing.JTabbedPane();
        pnPaciente = new javax.swing.JPanel();
        lblDataNascimento = new javax.swing.JLabel();
        lblSexoPaciente = new javax.swing.JLabel();
        tffCpfPaciente = new javax.swing.JFormattedTextField();
        lblCpf = new javax.swing.JLabel();
        tfNmPaciente = new javax.swing.JTextField();
        lblNmPaciente = new javax.swing.JLabel();
        TffTelefonePaciente = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        cbEstadoCivil = new javax.swing.JComboBox<>();
        lblEstadoCivil = new javax.swing.JLabel();
        cbConvenio = new javax.swing.JComboBox<>();
        lblConvenio = new javax.swing.JLabel();
        lbPacientes = new javax.swing.JLabel();
        tfSnPaciente = new javax.swing.JTextField();
        lblSnPaciente = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        cbSexoPac = new javax.swing.JComboBox<>();
        dtcDataDeNascimentoPaciente = new com.toedter.calendar.JDateChooser();
        lblCelularPac = new javax.swing.JLabel();
        lblEmailPac = new javax.swing.JLabel();
        tfEmailPaciente = new javax.swing.JTextField();
        tffRgPaciente = new javax.swing.JFormattedTextField();
        TffCelularPaciente = new javax.swing.JFormattedTextField();
        jpInfos = new javax.swing.JPanel();
        lblRuaPac = new javax.swing.JLabel();
        lblNumeroPac = new javax.swing.JLabel();
        lblComplementoPac = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        tfRuaPaciente = new javax.swing.JTextField();
        tfNumeroPaciente = new javax.swing.JTextField();
        tfComplementoPaciente = new javax.swing.JTextField();
        tfCidadePaciente = new javax.swing.JTextField();
        tfBairroPaciente = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        tffCepPaciente = new javax.swing.JFormattedTextField();
        pnMedico = new javax.swing.JPanel();
        tfNmMed = new javax.swing.JTextField();
        tffCpfMed = new javax.swing.JFormattedTextField();
        TffTelefoneMedico = new javax.swing.JFormattedTextField();
        cbEstadoCivilMedico = new javax.swing.JComboBox<>();
        lblEstadoCivil1 = new javax.swing.JLabel();
        lblTelefoneMed = new javax.swing.JLabel();
        lblDataNascimentoMed = new javax.swing.JLabel();
        lblSexMed = new javax.swing.JLabel();
        lblNmMed = new javax.swing.JLabel();
        lblCpfMed = new javax.swing.JLabel();
        lblCRM = new javax.swing.JLabel();
        tftCRM = new javax.swing.JFormattedTextField();
        lbMedicos = new javax.swing.JLabel();
        tfSnMed = new javax.swing.JTextField();
        lblSnMed = new javax.swing.JLabel();
        dtcDataDeNascimentoMed = new com.toedter.calendar.JDateChooser();
        lblCelularMed = new javax.swing.JLabel();
        cbSexoMed = new javax.swing.JComboBox<>();
        lblEmailMed = new javax.swing.JLabel();
        tfEmailMed = new javax.swing.JTextField();
        lblRGMed = new javax.swing.JLabel();
        tffRgMed = new javax.swing.JFormattedTextField();
        tffCelularMedico = new javax.swing.JFormattedTextField();
        pnAcesso = new javax.swing.JPanel();
        lblAcesso = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        tfUsuarioMed = new javax.swing.JTextField();
        pfSenhaMed = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        lblRuaMed = new javax.swing.JLabel();
        lblNumeroMed = new javax.swing.JLabel();
        lblComplementoMed = new javax.swing.JLabel();
        lblBairroMed = new javax.swing.JLabel();
        lblCidadeMed = new javax.swing.JLabel();
        lblCepMed = new javax.swing.JLabel();
        tfRuaMed = new javax.swing.JTextField();
        tfNumeroMed = new javax.swing.JTextField();
        tfComplementoMed = new javax.swing.JTextField();
        tfCidadeMed = new javax.swing.JTextField();
        tfBairroMed = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tffCepMed = new javax.swing.JFormattedTextField();
        pnOperador = new javax.swing.JPanel();
        tfNmOperador = new javax.swing.JTextField();
        tffCpfOperador = new javax.swing.JFormattedTextField();
        tffTelefoneOperador = new javax.swing.JFormattedTextField();
        cbEstadoCivilOperador = new javax.swing.JComboBox<>();
        lblEstadoCivilOp = new javax.swing.JLabel();
        lblTelefoneOp = new javax.swing.JLabel();
        lblDataNascimentoOp = new javax.swing.JLabel();
        lblSexOp = new javax.swing.JLabel();
        lbOpNome = new javax.swing.JLabel();
        lbCpfOp = new javax.swing.JLabel();
        lbOperador = new javax.swing.JLabel();
        tfSnOperador = new javax.swing.JTextField();
        lbSnOp = new javax.swing.JLabel();
        dtcDataDeNascimentoOperador = new com.toedter.calendar.JDateChooser();
        lblCelularOp = new javax.swing.JLabel();
        cbSexoOperador = new javax.swing.JComboBox<>();
        lblEmailOp = new javax.swing.JLabel();
        tfEmailOperador = new javax.swing.JTextField();
        lblRGOp = new javax.swing.JLabel();
        tffRgOperador = new javax.swing.JFormattedTextField();
        tffCelularOperador = new javax.swing.JFormattedTextField();
        jpInfosOp = new javax.swing.JPanel();
        lblAccess = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        tfUserOperador = new javax.swing.JTextField();
        pfSenhaOperador = new javax.swing.JPasswordField();
        jpLoginInfos = new javax.swing.JPanel();
        lblRuaOp = new javax.swing.JLabel();
        lblNumeroOp = new javax.swing.JLabel();
        lblComplementoOp = new javax.swing.JLabel();
        lblBairroOp = new javax.swing.JLabel();
        lblCidadeOp = new javax.swing.JLabel();
        lblCepOp = new javax.swing.JLabel();
        tfRuaOperador = new javax.swing.JTextField();
        tfNumeroOperador = new javax.swing.JTextField();
        tfComplementoOperador = new javax.swing.JTextField();
        tfCidadeOperador = new javax.swing.JTextField();
        tfBairroOperador = new javax.swing.JTextField();
        lblEnderecoOp = new javax.swing.JLabel();
        tffCepOperador = new javax.swing.JFormattedTextField();
        lblbCadPaciente = new javax.swing.JLabel();
        lblbLimpar = new javax.swing.JLabel();

        setTitle("Cadastros");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Cadastros");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 0, -1, -1));

        pnPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDataNascimento.setText("Data de nascimento");
        pnPaciente.add(lblDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 38, -1, -1));

        lblSexoPaciente.setText("Sexo do Paciente");
        pnPaciente.add(lblSexoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 96, -1, -1));

        tffCpfPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        pnPaciente.add(tffCpfPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 58, 107, -1));

        lblCpf.setText("Cpf");
        pnPaciente.add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 40, -1, -1));
        pnPaciente.add(tfNmPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 122, -1));

        lblNmPaciente.setText("Nome");
        pnPaciente.add(lblNmPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 40, -1, -1));
        pnPaciente.add(TffTelefonePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, 105, -1));

        lblTelefone.setText("Telefone");
        pnPaciente.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 96, -1, -1));

        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viuvo", "Separado" }));
        cbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoCivilActionPerformed(evt);
            }
        });
        pnPaciente.add(cbEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 116, 106, -1));

        lblEstadoCivil.setText("Estado civil");
        pnPaciente.add(lblEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 96, -1, -1));

        cbConvenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amil", "NotreDame Intermédica", "Nenhum" }));
        pnPaciente.add(cbConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 116, 92, -1));

        lblConvenio.setText("Convenio");
        pnPaciente.add(lblConvenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 96, -1, -1));

        lbPacientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPacientes.setText("Pacientes");
        pnPaciente.add(lbPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 0, -1, -1));
        pnPaciente.add(tfSnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 58, 109, -1));

        lblSnPaciente.setText("Sobrenome");
        pnPaciente.add(lblSnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 40, -1, -1));

        lblRg.setText("Rg");
        pnPaciente.add(lblRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 38, -1, -1));

        cbSexoPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        pnPaciente.add(cbSexoPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 116, 102, -1));
        pnPaciente.add(dtcDataDeNascimentoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 58, 105, -1));

        lblCelularPac.setText("Celular");
        pnPaciente.add(lblCelularPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 96, -1, -1));

        lblEmailPac.setText("Email");
        pnPaciente.add(lblEmailPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 147, -1, -1));
        pnPaciente.add(tfEmailPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, 187, -1));
        pnPaciente.add(tffRgPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 58, 118, -1));
        pnPaciente.add(TffCelularPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 116, 116, -1));

        jpInfos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblRuaPac.setText("Rua");

        lblNumeroPac.setText("Numero");

        lblComplementoPac.setText("Complemento");

        lblBairro.setText("Bairro");

        lblCidade.setText("Cidade");

        lblCep.setText("Cep");

        lblEndereco.setText("Endereço");

        javax.swing.GroupLayout jpInfosLayout = new javax.swing.GroupLayout(jpInfos);
        jpInfos.setLayout(jpInfosLayout);
        jpInfosLayout.setHorizontalGroup(
            jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfosLayout.createSequentialGroup()
                .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInfosLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lblEndereco))
                    .addGroup(jpInfosLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblCidade)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpInfosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInfosLayout.createSequentialGroup()
                        .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRuaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpInfosLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblRuaPac)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpInfosLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblNumeroPac)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfosLayout.createSequentialGroup()
                                .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBairro)
                                    .addComponent(tfNumeroPaciente))
                                .addGap(42, 42, 42)))
                        .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblComplementoPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfComplementoPaciente))
                            .addGroup(jpInfosLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblCep)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpInfosLayout.createSequentialGroup()
                        .addComponent(tfCidadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBairroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tffCepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        jpInfosLayout.setVerticalGroup(
            jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuaPac)
                    .addComponent(lblNumeroPac)
                    .addComponent(lblComplementoPac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRuaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplementoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(lblBairro)
                    .addComponent(lblCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffCepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnPaciente.add(jpInfos, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 147, -1, -1));

        tbCadastros.addTab("Paciente", pnPaciente);

        pnMedico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnMedico.add(tfNmMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 107, -1));

        tffCpfMed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        pnMedico.add(tffCpfMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 44, 107, -1));
        pnMedico.add(TffTelefoneMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 105, -1));

        cbEstadoCivilMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viuvo", "Separado" }));
        pnMedico.add(cbEstadoCivilMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 95, 113, -1));

        lblEstadoCivil1.setText("Estado civil");
        pnMedico.add(lblEstadoCivil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 75, -1, -1));

        lblTelefoneMed.setText("Telefone");
        pnMedico.add(lblTelefoneMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 75, -1, -1));

        lblDataNascimentoMed.setText("Data de nascimento");
        pnMedico.add(lblDataNascimentoMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 24, -1, -1));

        lblSexMed.setText("Sexo do Medico");
        pnMedico.add(lblSexMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 75, -1, -1));

        lblNmMed.setText("Nome");
        pnMedico.add(lblNmMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 24, -1, -1));

        lblCpfMed.setText("Cpf");
        pnMedico.add(lblCpfMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 24, -1, -1));

        lblCRM.setText("CRM");
        pnMedico.add(lblCRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 24, -1, -1));
        pnMedico.add(tftCRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 44, 126, -1));

        lbMedicos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMedicos.setText("Medicos");
        pnMedico.add(lbMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 0, -1, -1));
        pnMedico.add(tfSnMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 44, 134, -1));

        lblSnMed.setText("Sobrenome");
        pnMedico.add(lblSnMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 24, -1, -1));
        pnMedico.add(dtcDataDeNascimentoMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 44, 155, -1));

        lblCelularMed.setText("Celular");
        pnMedico.add(lblCelularMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 75, -1, -1));

        cbSexoMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        pnMedico.add(cbSexoMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 95, 84, -1));

        lblEmailMed.setText("Email");
        pnMedico.add(lblEmailMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 126, -1, -1));
        pnMedico.add(tfEmailMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 167, -1));

        lblRGMed.setText("Rg");
        pnMedico.add(lblRGMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 126, -1, -1));
        pnMedico.add(tffRgMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 119, 20));
        pnMedico.add(tffCelularMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 95, 117, -1));

        pnAcesso.setBackground(new java.awt.Color(153, 153, 153));
        pnAcesso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAcesso.setText("Acesso");
        pnAcesso.add(lblAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        lblUsuario.setText("Usuario");
        pnAcesso.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        lblSenha.setText("Senha");
        pnAcesso.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, -1, -1));
        pnAcesso.add(tfUsuarioMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, -1));
        pnAcesso.add(pfSenhaMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, -1));

        pnMedico.add(pnAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 80, 190, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRuaMed.setText("Rua");
        jPanel3.add(lblRuaMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 37, -1, -1));

        lblNumeroMed.setText("Numero");
        jPanel3.add(lblNumeroMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 37, -1, -1));

        lblComplementoMed.setText("Complemento");
        jPanel3.add(lblComplementoMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 37, -1, -1));

        lblBairroMed.setText("Bairro");
        jPanel3.add(lblBairroMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 91, -1, -1));

        lblCidadeMed.setText("Cidade");
        jPanel3.add(lblCidadeMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 91, -1, -1));

        lblCepMed.setText("Cep");
        jPanel3.add(lblCepMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 91, -1, -1));
        jPanel3.add(tfRuaMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 57, 147, -1));
        jPanel3.add(tfNumeroMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 57, 61, -1));
        jPanel3.add(tfComplementoMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 57, 84, -1));
        jPanel3.add(tfCidadeMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 111, 133, -1));
        jPanel3.add(tfBairroMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 111, 86, -1));

        jLabel5.setText("Endereço");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 12, -1, -1));
        jPanel3.add(tffCepMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 111, 75, -1));

        pnMedico.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, 360, 140));

        tbCadastros.addTab("Medicos", pnMedico);

        pnOperador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnOperador.add(tfNmOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 107, -1));

        tffCpfOperador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        tffCpfOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffCpfOperadorActionPerformed(evt);
            }
        });
        pnOperador.add(tffCpfOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 44, 107, -1));
        pnOperador.add(tffTelefoneOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 105, -1));

        cbEstadoCivilOperador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo", "Separado" }));
        pnOperador.add(cbEstadoCivilOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 95, 113, -1));

        lblEstadoCivilOp.setText("Estado civil");
        pnOperador.add(lblEstadoCivilOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        lblTelefoneOp.setText("Telefone");
        pnOperador.add(lblTelefoneOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 75, -1, -1));

        lblDataNascimentoOp.setText("Data de nascimento");
        pnOperador.add(lblDataNascimentoOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        lblSexOp.setText("Sexo");
        pnOperador.add(lblSexOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 75, -1, -1));

        lbOpNome.setText("Nome");
        pnOperador.add(lbOpNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 24, -1, -1));

        lbCpfOp.setText("Cpf");
        pnOperador.add(lbCpfOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 24, -1, -1));

        lbOperador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbOperador.setText("Operador");
        pnOperador.add(lbOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 0, -1, -1));
        pnOperador.add(tfSnOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 44, 134, -1));

        lbSnOp.setText("Sobrenome");
        pnOperador.add(lbSnOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 24, -1, -1));
        pnOperador.add(dtcDataDeNascimentoOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 44, 110, -1));

        lblCelularOp.setText("Celular");
        pnOperador.add(lblCelularOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 75, -1, -1));

        cbSexoOperador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        pnOperador.add(cbSexoOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 95, 84, -1));

        lblEmailOp.setText("Email");
        pnOperador.add(lblEmailOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));
        pnOperador.add(tfEmailOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 95, 148, -1));

        lblRGOp.setText("Rg");
        pnOperador.add(lblRGOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));
        pnOperador.add(tffRgOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 44, 138, -1));
        pnOperador.add(tffCelularOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 95, 117, -1));

        jpInfosOp.setBackground(new java.awt.Color(153, 153, 153));
        jpInfosOp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccess.setText("Acesso");
        jpInfosOp.add(lblAccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 0, -1, -1));

        lblUser.setText("Usuario");
        jpInfosOp.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        lblPass.setText("Senha");
        jpInfosOp.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, -1, -1));
        jpInfosOp.add(tfUserOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, -1));
        jpInfosOp.add(pfSenhaOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 150, -1));

        pnOperador.add(jpInfosOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 126, 230, 90));

        jpLoginInfos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblRuaOp.setText("Rua");

        lblNumeroOp.setText("Numero");

        lblComplementoOp.setText("Complemento");

        lblBairroOp.setText("Bairro");

        lblCidadeOp.setText("Cidade");

        lblCepOp.setText("Cep");

        lblEnderecoOp.setText("Endereço");

        javax.swing.GroupLayout jpLoginInfosLayout = new javax.swing.GroupLayout(jpLoginInfos);
        jpLoginInfos.setLayout(jpLoginInfosLayout);
        jpLoginInfosLayout.setHorizontalGroup(
            jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginInfosLayout.createSequentialGroup()
                .addGroup(jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLoginInfosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRuaOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpLoginInfosLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblRuaOp))
                            .addComponent(tfCidadeOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpLoginInfosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblCidadeOp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLoginInfosLayout.createSequentialGroup()
                        .addGroup(jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfBairroOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpLoginInfosLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblNumeroOp))
                            .addComponent(tfNumeroOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tffCepOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComplementoOp)
                            .addComponent(tfComplementoOperador))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpLoginInfosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblBairroOp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCepOp)
                        .addGap(53, 53, 53))))
            .addGroup(jpLoginInfosLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(lblEnderecoOp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpLoginInfosLayout.setVerticalGroup(
            jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginInfosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnderecoOp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuaOp)
                    .addComponent(lblNumeroOp)
                    .addComponent(lblComplementoOp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRuaOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplementoOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidadeOp)
                    .addComponent(lblBairroOp)
                    .addComponent(lblCepOp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLoginInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidadeOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairroOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffCepOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnOperador.add(jpLoginInfos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, -1, -1));

        tbCadastros.addTab("Operador", pnOperador);

        getContentPane().add(tbCadastros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 690, 364));
        tbCadastros.getAccessibleContext().setAccessibleName("Pacientes");

        lblbCadPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Add_User_Male_50px.png"))); // NOI18N
        lblbCadPaciente.setToolTipText("Cadastrar");
        lblbCadPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbCadPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblbCadPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblbCadPacienteMouseExited(evt);
            }
        });
        getContentPane().add(lblbCadPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 405, -1, -1));

        lblbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Broom_50px.png"))); // NOI18N
        lblbLimpar.setToolTipText("Limpar Campos");
        lblbLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbLimparMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblbLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblbLimparMouseExited(evt);
            }
        });
        getContentPane().add(lblbLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 405, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblbCadPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbCadPacienteMouseEntered
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.botabotao(lblbCadPaciente);
    }//GEN-LAST:event_lblbCadPacienteMouseEntered

    private void lblbCadPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbCadPacienteMouseClicked
        // TODO add your handling code here:
        if (tbCadastros.getSelectedComponent() == pnPaciente) {
            registrarPaciente();
        } else if (tbCadastros.getSelectedComponent() == pnMedico) {
            registrarMedico();
        } else if (tbCadastros.getSelectedComponent() == pnOperador) {
            registrarOperador();
        }
    }//GEN-LAST:event_lblbCadPacienteMouseClicked

    private void lblbCadPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbCadPacienteMouseExited
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.tirabotao(lblbCadPaciente);
    }//GEN-LAST:event_lblbCadPacienteMouseExited

    private void lblbLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbLimparMouseClicked
        // TODO add your handling code here:
        if (tbCadastros.getSelectedComponent() == pnPaciente) {
            LimpaPaciente();
        } else if (tbCadastros.getSelectedComponent() == pnMedico) {
            LimpaMed();
        } else if (tbCadastros.getSelectedComponent() == pnOperador){
            LimpaOperador();
        }
    }//GEN-LAST:event_lblbLimparMouseClicked

    private void lblbLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbLimparMouseEntered
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.botabotao(lblbLimpar);
    }//GEN-LAST:event_lblbLimparMouseEntered

    private void lblbLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbLimparMouseExited
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.tirabotao(lblbLimpar);
    }//GEN-LAST:event_lblbLimparMouseExited

    private void cbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoCivilActionPerformed

    private void tffCpfOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffCpfOperadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffCpfOperadorActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TffCelularPaciente;
    private javax.swing.JFormattedTextField TffTelefoneMedico;
    private javax.swing.JFormattedTextField TffTelefonePaciente;
    private javax.swing.JComboBox<String> cbConvenio;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private javax.swing.JComboBox<String> cbEstadoCivilMedico;
    private javax.swing.JComboBox<String> cbEstadoCivilOperador;
    private javax.swing.JComboBox<String> cbSexoMed;
    private javax.swing.JComboBox<String> cbSexoOperador;
    private javax.swing.JComboBox<String> cbSexoPac;
    private com.toedter.calendar.JDateChooser dtcDataDeNascimentoMed;
    private com.toedter.calendar.JDateChooser dtcDataDeNascimentoOperador;
    private com.toedter.calendar.JDateChooser dtcDataDeNascimentoPaciente;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpInfos;
    private javax.swing.JPanel jpInfosOp;
    private javax.swing.JPanel jpLoginInfos;
    private javax.swing.JLabel lbCpfOp;
    private javax.swing.JLabel lbMedicos;
    private javax.swing.JLabel lbOpNome;
    private javax.swing.JLabel lbOperador;
    private javax.swing.JLabel lbPacientes;
    private javax.swing.JLabel lbSnOp;
    private javax.swing.JLabel lblAccess;
    private javax.swing.JLabel lblAcesso;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairroMed;
    private javax.swing.JLabel lblBairroOp;
    private javax.swing.JLabel lblCRM;
    private javax.swing.JLabel lblCelularMed;
    private javax.swing.JLabel lblCelularOp;
    private javax.swing.JLabel lblCelularPac;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCepMed;
    private javax.swing.JLabel lblCepOp;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidadeMed;
    private javax.swing.JLabel lblCidadeOp;
    private javax.swing.JLabel lblComplementoMed;
    private javax.swing.JLabel lblComplementoOp;
    private javax.swing.JLabel lblComplementoPac;
    private javax.swing.JLabel lblConvenio;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpfMed;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblDataNascimentoMed;
    private javax.swing.JLabel lblDataNascimentoOp;
    private javax.swing.JLabel lblEmailMed;
    private javax.swing.JLabel lblEmailOp;
    private javax.swing.JLabel lblEmailPac;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEnderecoOp;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblEstadoCivil1;
    private javax.swing.JLabel lblEstadoCivilOp;
    private javax.swing.JLabel lblNmMed;
    private javax.swing.JLabel lblNmPaciente;
    private javax.swing.JLabel lblNumeroMed;
    private javax.swing.JLabel lblNumeroOp;
    private javax.swing.JLabel lblNumeroPac;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRGMed;
    private javax.swing.JLabel lblRGOp;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblRuaMed;
    private javax.swing.JLabel lblRuaOp;
    private javax.swing.JLabel lblRuaPac;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexMed;
    private javax.swing.JLabel lblSexOp;
    private javax.swing.JLabel lblSexoPaciente;
    private javax.swing.JLabel lblSnMed;
    private javax.swing.JLabel lblSnPaciente;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefoneMed;
    private javax.swing.JLabel lblTelefoneOp;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblbCadPaciente;
    private javax.swing.JLabel lblbLimpar;
    private javax.swing.JPasswordField pfSenhaMed;
    private javax.swing.JPasswordField pfSenhaOperador;
    private javax.swing.JPanel pnAcesso;
    private javax.swing.JPanel pnMedico;
    private javax.swing.JPanel pnOperador;
    private javax.swing.JPanel pnPaciente;
    private javax.swing.JTabbedPane tbCadastros;
    private javax.swing.JTextField tfBairroMed;
    private javax.swing.JTextField tfBairroOperador;
    private javax.swing.JTextField tfBairroPaciente;
    private javax.swing.JTextField tfCidadeMed;
    private javax.swing.JTextField tfCidadeOperador;
    private javax.swing.JTextField tfCidadePaciente;
    private javax.swing.JTextField tfComplementoMed;
    private javax.swing.JTextField tfComplementoOperador;
    private javax.swing.JTextField tfComplementoPaciente;
    private javax.swing.JTextField tfEmailMed;
    private javax.swing.JTextField tfEmailOperador;
    private javax.swing.JTextField tfEmailPaciente;
    private javax.swing.JTextField tfNmMed;
    private javax.swing.JTextField tfNmOperador;
    private javax.swing.JTextField tfNmPaciente;
    private javax.swing.JTextField tfNumeroMed;
    private javax.swing.JTextField tfNumeroOperador;
    private javax.swing.JTextField tfNumeroPaciente;
    private javax.swing.JTextField tfRuaMed;
    private javax.swing.JTextField tfRuaOperador;
    private javax.swing.JTextField tfRuaPaciente;
    private javax.swing.JTextField tfSnMed;
    private javax.swing.JTextField tfSnOperador;
    private javax.swing.JTextField tfSnPaciente;
    private javax.swing.JTextField tfUserOperador;
    private javax.swing.JTextField tfUsuarioMed;
    private javax.swing.JFormattedTextField tffCelularMedico;
    private javax.swing.JFormattedTextField tffCelularOperador;
    private javax.swing.JFormattedTextField tffCepMed;
    private javax.swing.JFormattedTextField tffCepOperador;
    private javax.swing.JFormattedTextField tffCepPaciente;
    private javax.swing.JFormattedTextField tffCpfMed;
    private javax.swing.JFormattedTextField tffCpfOperador;
    private javax.swing.JFormattedTextField tffCpfPaciente;
    private javax.swing.JFormattedTextField tffRgMed;
    private javax.swing.JFormattedTextField tffRgOperador;
    private javax.swing.JFormattedTextField tffRgPaciente;
    private javax.swing.JFormattedTextField tffTelefoneOperador;
    private javax.swing.JFormattedTextField tftCRM;
    // End of variables declaration//GEN-END:variables
}
