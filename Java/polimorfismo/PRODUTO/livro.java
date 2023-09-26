package modelo;

public class Livro extends Produto{

	
	private String autor;
	
	public String getDados() {
		return"O produto de descrição:"+descricao+", foi escrito pelo autor:"
				+this.autor+ " / unidade de medida:"+unidademedida;
	}
	

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}
