package br.com.RecTourist.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
@SequenceGenerator(name = "Usuario_seq", sequenceName = "Usuario_seq", allocationSize = 1, initialValue = 1)
public class Usuario {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "Usuario_seq")
	private long id;
	
	@Column(name = "nome", length = 100)
	private String nome;
	
	@Column(name = "sobrenome", length = 100)
	private String sobrenome;
	
	@Column(name = "sexo", length = 100)
	private String sexo;
	
	@Column(name = "email", length = 100)
	private String email;
	

	public Usuario() {
	}

	public Usuario(long id, String nome, String sobrenome, String sexo, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.email = email;
		
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
