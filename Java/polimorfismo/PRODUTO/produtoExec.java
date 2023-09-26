package execucao;

import modelo.Balde;
import modelo.Computador;
import modelo.Livro;
import modelo.Produto;

public class produtoExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Produto p = new Produto();
		p.setDescricao("carro");
		p.setUnidademedida("cavalos de força");
		
		Livro l = new Livro();
		l.setAutor("Riordan");
		l.setDescricao("livro:Percy Jackson");
		l.setUnidademedida("Capitulos/paginas");
		
		Computador c = new Computador();
		c.setDescricao(" comutador da apple");
		c.setMemoria(16);
		c.setProcessador("i512400f");
		c.setUnidademedida("Giga");
		
		Balde b = new Balde();
		b.setCapacidade(5.0);
		b.setDescricao("balde domestico");
		b.setUnidademedida("litros");
		
		System.out.println(p.getDados()+"\n"+ c.getDados()+"\n"+ b.getDados() +"\n"+l.getDados());
		
		
		
	}

}
