package br.com.RecTourist.entidade;

public class PontosTuristicos {

	private String nomePT;
	private String descricaoPT;
	private Endereco enderecoPT;
	private long idPT;
	
	
	
	public PontosTuristicos() {
		super();
	}



	public PontosTuristicos(String nomePT, String descricaoPT, Endereco enderecoPT, long idPT) {
		super();
		this.nomePT = nomePT;
		this.descricaoPT = descricaoPT;
		this.enderecoPT = enderecoPT;
		this.idPT = idPT;
	}



	public String getNomePT() {
		return nomePT;
	}



	public void setNomePT(String nomePT) {
		this.nomePT = nomePT;
	}



	public String getDescricaoPT() {
		return descricaoPT;
	}



	public void setDescricaoPT(String descricaoPT) {
		this.descricaoPT = descricaoPT;
	}



	public Endereco getEnderecoPT() {
		return enderecoPT;
	}



	public void setEnderecoPT(Endereco enderecoPT) {
		this.enderecoPT = enderecoPT;
	}



	public long getIdPT() {
		return idPT;
	}



	public void setIdPT(long idPT) {
		this.idPT = idPT;
	}
	
	
	
}
