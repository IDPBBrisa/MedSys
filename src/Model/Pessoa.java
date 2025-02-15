package Model;

public abstract class Pessoa {

	private long id;
	private String nome;
	private String sobrenome;
	private String rg;
	private String cpf;
	private String dataNascimento;
	private Endereco endereco;
	private String celular;
	private String telefone;
	private String email;
	private EstadoCivil estadocivil;
	private Sexo sexo;

	public Pessoa() {
	}
/**
 * Construtor feito para passagens de tais dados por parametro:
 * @param id
 * @param nome
 * @param sobrenome
 * @param rg
 * @param cpf
 * @param dataNascimento
 * @param endereco
 * @param celular
 * @param telefone
 * @param email
 * @param estadocivil
 * @param sexo 
 */
	public Pessoa(long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.celular = celular;
		this.telefone = telefone;
		this.email = email;
		this.estadocivil = estadocivil;
		this.sexo = sexo;
	}
/**
 * Construtor feito para passagens dos dados por meio dos parametros :
 * @param nome
 * @param sobrenome
 * @param rg
 * @param cpf
 * @param dataNascimento
 * @param endereco
 * @param celular
 * @param telefone
 * @param email
 * @param estadocivil
 * @param sexo 
 */
	public Pessoa(String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.celular = celular;
		this.telefone = telefone;
		this.email = email;
		this.estadocivil = estadocivil;
		this.sexo = sexo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


}
