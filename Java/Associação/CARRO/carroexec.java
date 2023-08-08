package execucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Fabricante;

public class carroExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fabricante> fabricantes = new ArrayList<>();
		Scanner leitor = new Scanner(System.in);

		
		Fabricante v = new Fabricante();
		v.setNome("Volkswagem");
		v.setSigla("VW");
		fabricantes.add(v);
		
		
		Fabricante c = new Fabricante();
		c.setNome("Chavrolet");
		c.setSigla("GM");
		fabricantes.add(c);
		
		
	   Fabricante f = new Fabricante();
	   f.setNome("Fiat");
	   f.setSigla("F");
	   fabricantes.add(f);
	   
	   
	   Fabricante r = new Fabricante();
	   r.setNome("Renault");
	   r.setSigla("RN");
	   fabricantes.add(r);
	   
	   
	Integer opcao;
	
	System.out.println("----------------Menu----------------");
	System.out.println("(1) Cadastrar carro");
	System.out.println("(2)  Excluir  carro");
	System.out.println("(3)  Listar  carro");
	System.out.println("(0) Sair");
	
	opcao = leitor.nextLine();	   
	   
	   
		
		
		
		
		
	}

}
