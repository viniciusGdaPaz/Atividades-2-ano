package execucao;

import java.util.ArrayList;
import java.util.List;

import modelo.Cidade;
import modelo.Estado;

public class CidadesExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cidade>cidades = new ArrayList<>();
		
		
		//EStado
		Estado sc = new Estado();
		sc.setNome("Santa Catarina");
		sc.setSigla("SC");
		
		Estado pr = new Estado();
		pr.setNome("Paraná");
		pr.setSigla("PR");
		
		//Cidade
		Cidade floripa = new Cidade();
		floripa.setNome("Floriánopoles");
		floripa.setQtdhabitantes(300000);
		floripa.setAltitude(0);
		floripa.setEstado(sc);
		cidades.add(floripa);
		
		Cidade blumenau = new Cidade();
		blumenau.setNome("Blumenau");
		blumenau.setQtdhabitantes(250000);
		blumenau.setAltitude(150);
		blumenau.setEstado(sc);
		cidades.add(blumenau);
		
		Cidade foz = new Cidade();
		foz.setNome("Foz do Iguaçu");
		foz.setAltitude(145);
		foz.setQtdhabitantes(500000);
		foz.setEstado(pr);
		cidades.add(foz);
		
		Cidade cascavel = new Cidade();
		cascavel.setNome("Cascavel");
		cascavel.setAltitude(200);
		cascavel.setQtdhabitantes(200000);
		cascavel.setEstado(pr);
		cidades.add(cascavel);
		
		for( Cidade f : cidades) {
			
			System.out.println("A cidade "+ f.getNome()+", localizada no estado "+ f.getEstado().getNome()+
					"("+f.getEstado().getSigla()+") possui "+ f.getQtdhabitantes()+"habitantes");
			
		}
		
		

	}

}
