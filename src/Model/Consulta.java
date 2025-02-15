package Model;

import dao.ConsultaDao;
import dao.PacienteDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consulta {

    private String codigoConsulta;
    private String status;
    private String dataConsulta;
    private String laudoMedico;
    private String medicoNome;
    private String pacienteNome;

    protected DefaultTableModel ConsultasAbertas = new DefaultTableModel(new String[]{"Codigo da Consulta", "Status", "Data da Consulta", "Medico", "Paciente"}, 0);
    protected DefaultTableModel ConsultasFechadas = new DefaultTableModel(new String[]{"Codigo da Consulta", "Status", "Data da Consulta", "Medico", "Paciente"}, 0);
    private ArrayList<String> ComboBoxMedico = new ArrayList<>();

    /**
     * Construtor sem parametros para instancia da classe
     */
    public Consulta() {
    }

    /**
     * Construtor feito para passagens de tais dados por parametro:
     *
     * @param dataConsulta
     * @param medicoNome
     * @param pacienteNome
     */
    public Consulta(String dataConsulta, String medicoNome, String pacienteNome) {
        setDataConsulta(dataConsulta);
        setMedicoNome(medicoNome);
        setPacienteNome(pacienteNome);
    }

    /**
     * Construtor feito para passagens de tais dados por parametro:
     *
     * @param codigoConsulta
     * @param laudoMedico
     */
    public Consulta(String codigoConsulta, String laudoMedico) {
        setCodigoConsulta(codigoConsulta);
        setLaudoMedico(laudoMedico);
    }

    /**
     * Construtor feito para passagens de tais dados por parametro:
     *
     * @param status
     * @param dataConsulta
     * @param laudoMedico
     * @param medicoNome
     * @param pacienteNome
     */
    public Consulta(String status, String dataConsulta, String laudoMedico, String medicoNome, String pacienteNome) {
        setStatus(status);
        setDataConsulta(dataConsulta);
        setLaudoMedico(laudoMedico);
        setMedicoNome(medicoNome);
        setPacienteNome(pacienteNome);
    }

    /**
     * Construtor feito para passagens de tais dados por parametro:
     *
     * @param codigoConsulta
     * @param status
     * @param dataConsulta
     * @param laudoMedico
     * @param medicoNome
     * @param pacienteNome
     */
    public Consulta(String codigoConsulta, String status, String dataConsulta, String laudoMedico, String medicoNome, String pacienteNome) {
        setCodigoConsulta(codigoConsulta);
        setStatus(status);
        setDataConsulta(dataConsulta);
        setLaudoMedico(laudoMedico);
        setMedicoNome(medicoNome);
        setPacienteNome(pacienteNome);
    }

    public Consulta(String codigoConsulta) {
        this.codigoConsulta = codigoConsulta;
    }

    public DefaultTableModel getConsultasFechadas() {
        return ConsultasFechadas;
    }

    public void setConsultasFechadas(DefaultTableModel ConsultasFechadas) {
        this.ConsultasFechadas = ConsultasFechadas;
    }

    public ArrayList<String> getComboBoxMedico() {
        return ComboBoxMedico;
    }

    public void setComboBoxMedico(ArrayList<String> ComboBoxMedico) {
        this.ComboBoxMedico = ComboBoxMedico;
    }

    public String getCodigoConsulta() {
        return codigoConsulta;
    }

    public void setCodigoConsulta(String codigoConsulta) {
        this.codigoConsulta = codigoConsulta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getLaudoMedico() {
        return laudoMedico;
    }

    public void setLaudoMedico(String laudoMedico) {
        this.laudoMedico = laudoMedico;
    }

    public String getMedicoNome() {
        return medicoNome;
    }

    public void setMedicoNome(String medicoNome) {
        this.medicoNome = medicoNome;
    }

    public String getPacienteNome() {
        return pacienteNome;
    }

    public void setPacienteNome(String pacienteNome) {
        this.pacienteNome = pacienteNome;
    }

    /**
     * Passa o comando "create" para a classe DAO para gravação de dados no bd.
     */
    public void gravar() {
        ConsultaDao dao = new ConsultaDao();
        int valida = dao.create(this);

        if (valida != 1) {

            String message = "Agendamento não Concluido";
            String erro = "Erro!!";

            JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no Agendamento, verifique...");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }
    }

    /**
     * Passa o comando "delete" para a classe DAO para a exclusão de dados no
     * bd.
     */
    public void excluir() {
        ConsultaDao dao = new ConsultaDao();
        int valida = dao.delete(Long.parseLong(this.getCodigoConsulta()));

        if (valida != 1) {
            String message = "Exclusão não Concluida";
            String erro = "Erro!!";

            JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        }
    }

    /**
     * Passa o comando "update" para a classe DAO para atualização de dados no
     * bd.
     */
    public void Atualizar(String codigoConsulta) {
        ConsultaDao dao = new ConsultaDao();
        this.getLaudoMedico();
        int valida = dao.update(Long.parseLong(codigoConsulta), this);

        if (valida != 1) {
            String message = "Laudo Medico não gravou na Base de Dados";
            String erro = "Erro!!";

            JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Consulta concluida com sucesso");
        }
    }

    /**
     * Constroi o table model, preenche a tabela da janela com os dados do banco
     * de dados.
     *
     * @return
     */
    public DefaultTableModel TableConsulta() {
        //DefaultTableModel ConsultasAbertas = new DefaultTableModel(new String[]{"Codigo da Consulta", "Status", "Data da Consulta", "Paciente", "Medico"}, 0);
        //DefaultTableModel ConsultasFechadas = new DefaultTableModel(new String[]{"Codigo da Consulta","Status","Data da Consulta","Paciente","Sobrenome","Medico","Sobrenome"}, 0);

        ConsultaDao cd = new ConsultaDao();

        for (Consulta ca : cd.read()) {
            if (ca.getStatus().equals("Aberto")) {
                ConsultasAbertas.addRow(new String[]{ca.getCodigoConsulta(), ca.getStatus(), ca.getDataConsulta(), ca.getPacienteNome(), ca.getMedicoNome()});
            } else {
                ConsultasFechadas.addRow(new String[]{ca.getCodigoConsulta(), ca.getStatus(), ca.getDataConsulta(), ca.getPacienteNome(), ca.getMedicoNome()});
            }
            ComboBoxMedico.add(ca.getMedicoNome());
        }
        return ConsultasAbertas;
    }

    /**
     * Retorna as consultas fehcadas
     *
     * @return
     */
    public DefaultTableModel CFechado() {
        return ConsultasFechadas;
    }

    /**
     * Retorna a lista de medicos disponiveis no sistema.
     *
     * @return
     */
    public ArrayList<String> ComboBoxMediquin() {
        return ComboBoxMedico;
    }

    public class TableModel extends DefaultTableModel {

        TableModel(Object[][] data, String[] columnNames) {
            super(data, columnNames);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }
}
