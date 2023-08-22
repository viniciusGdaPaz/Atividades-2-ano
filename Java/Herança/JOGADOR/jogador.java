package modelo;

public class Jogador {

	private String posicao;
	private String nome;
	private Integer idade;
	private String nacionalidade;
	
	
	
	//metodos
	public String getCorrer() {
		String v = "RUNNNNNN";
		return v;
	}
	
	public String getChutar() {
		String c = "chutttttaaaa";
		return c;
	}
	
	
	//gets and setters
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
	
	
}
