package modelo;

public class Animal {

	private String nome;
	private String raca;
	
	//métodos
	public String getDados() {
     String dados = "Nome: "+ this.nome;
     dados+= "  Raça: "+this.raca;
     return dados;
	}

	
	//gets and seters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String gatRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	 
	
	
	
}
