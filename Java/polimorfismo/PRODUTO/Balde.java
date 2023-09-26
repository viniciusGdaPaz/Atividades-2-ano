package modelo;

public class Balde extends Produto{

	
	private Double capacidade;
	
	
	
	public String getDados() {
		return"O produto de descrição:"+this.descricao+" / unidade de medida:"+this.unidademedida
				+"com capacidade de "+this.capacidade+" de água";
	}
	
	
	
	

	public Double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Double capacidade) {
		this.capacidade = capacidade;
	}
	
	
	
	
}
