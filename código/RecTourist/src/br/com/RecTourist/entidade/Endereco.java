package br.com.RecTourist.entidade;

public class Endereco {
	private String bairro;
	private String rua;
	private String cidade;
	private String estado;
	private long cep;
	
	
	public Endereco() {
	}


	public Endereco(String bairro, String rua, String cidade, String estado, long cep) {
		super();
		this.bairro = bairro;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public long getCep() {
		return cep;
	}


	public void setCep(long cep) {
		this.cep = cep;
	}
	
	

}
