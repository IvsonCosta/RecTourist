package br.com.RecTourist.entidade;

public class Usuario {
	private long id;
	private String nome;
	private String sobrenome;
	private String sexo;
	private String email;
	private Endereco endereco;

	public Usuario() {

	}

	public Usuario(long id, String nome, String sobrenome, String sexo, String email,Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.email = email;
		this.endereco = endereco;
	}
	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
