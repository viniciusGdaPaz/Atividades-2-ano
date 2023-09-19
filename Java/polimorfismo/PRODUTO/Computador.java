package modelo;

public class Computador extends Produto{

	
	private Integer memoria;
	private String processador;
	
	
	
	public String getDados() {
		return"O produto de descrição:"+this.descricao+", tem a memoria:"
				+this.memoria+ " / unidade de medida:"+this.unidademedida+", com "
						+ "processador:"+this.processador;
	}
	
	
	public Integer getMemoria() {
		return memoria;
	}
	public void setMemoria(Integer memoria) {
		this.memoria = memoria;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	
	
}
