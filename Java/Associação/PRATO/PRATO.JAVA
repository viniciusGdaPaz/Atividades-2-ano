package modelo;

public class Prato {
	
	private Integer numero;
	private String nome;
	private Double valor;
	
	
	//construtor
	
	public void setinfo(Integer n, String no, Double v) {
		this.numero = n;
		this.nome = no;
		this.valor = v;
	}
	
	
	
	
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	

}
