package br.com.RecTourist.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PontosTuristicos")
@SequenceGenerator(name = "PT_seq", sequenceName = "PT_seq", allocationSize = 1, initialValue = 1)

public class PontosTuristicos {
	
	@Id
	@Column(name = "id_PT")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PT_seq")
	private long id_PT;

	@Column(name = "nome_PT", length = 100)
	private String nome_PT;

	@Column(name = "descricao_PT", length = 100)
	private String descricao_PT;

	public PontosTuristicos() {

	}

	public PontosTuristicos(long id_PT, String nome_PT, String descricao_PT) {
		super();
		this.descricao_PT = descricao_PT;
		this.id_PT = id_PT;
		this.nome_PT = nome_PT;

	}

	public long getId_PT() {
		return id_PT;
	}

	public void setId_PT(long id_PT) {
		this.id_PT = id_PT;
	}

	public String getNome_PT() {
		return nome_PT;
	}

	public void setNome_PT(String nome_PT) {
		this.nome_PT = nome_PT;
	}

	public String getDescricao_PT() {
		return descricao_PT;
	}

	public void setDescricao_PT(String descricao_PT) {
		this.descricao_PT = descricao_PT;
	}

}
