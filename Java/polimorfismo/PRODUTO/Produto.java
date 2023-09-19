package modelo;

public class Produto {

	
	protected String descricao;
	protected String unidademedida;
	
	
	
	public String getDados() {
		return"O produto tem descrição:"+this.descricao+" / unidade de medida:"+this.unidademedida;
	}
	
	
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidademedida() {
		return unidademedida;
	}
	public void setUnidademedida(String unidademedida) {
		this.unidademedida = unidademedida;
	}
	
}
