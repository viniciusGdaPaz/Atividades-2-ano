package modelo;

public abstract class Midia {

	protected String descricao;
	protected Double precoPago;
	
	
	public  String getDados() {
		return(" Descrição: "+this.descricao+"/ preço pago: "+this.precoPago);
	}
	
	public abstract String getTipo();
	
	
	
	
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPrecoPago() {
		return precoPago;
	}

	public void setPrecoPago(Double precoPago) {
		this.precoPago = precoPago;
	}

public String getDescricao() {
		return descricao;
	}

	
}
