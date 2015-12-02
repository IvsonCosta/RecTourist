package br.com.RecTourist.entidade;

public class Usuario {
	private long id_Usuario;
	private String email;
	private String senha;
	private String nome;
	private String sobrenome;
	private String sexo;

	public Usuario() {

	}

	public Usuario(long id_Usuario, String email, String senha, String nome) {
		super();
		this.id_Usuario = id_Usuario;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;

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

	public long getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(long id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
