package execucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Cd;
import modelo.Dvd;
import modelo.Midia;

public class midiaExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Midia>midias = new ArrayList<>();
		
	Scanner leitor = new Scanner(System.in);
	
	
	Integer m = 0 ;
	
	do {
		System.out.println("\n+=====Cadastre 5 MIDIAS!!=====+");
		System.out.println("|       (1)cadastrar CD       |");
		System.out.println("|       (2)cadastrar DVD      |");
		System.out.println("|       (3)listar             |");
		System.out.println("|       (4)Sair               |");
		System.out.println("+=============================+");
		System.out.print("opcção:");
		m = Integer.parseInt(leitor.nextLine());
		
		switch (m) {
		case 1: {
			
			if(midias.size()<5) {
				setarCD(midias,leitor);
				m++;
	        }else {
	        	System.out.println("Lista está cheia");
	        }
			
			break;
		}
        case 2: {
			if(midias.size()<5) {
        	setarDVD(midias,leitor);
        	m++;
        }else {
        	System.out.println("Lista está cheia");
        }
			break;
		}
       case 3: {
    	   System.out.println("LISTA:");
			if(midias.size()>0) {
        	for(Midia v : midias) {
        		System.out.println("\n"+v.getDados()+"//"+v.getTipo());
        	}
        	}else 
        		System.out.println("não tem nada na lista\n");
        	
			break;
		}
       
       case 4: {
    	    System.out.println("FIM do PROGRAMA");
    	    m = 6;
        	
			break;
		}
		default:
			System.out.println("VALOR INVALIDO!!!!!!");
			break;
		}
		
		
	} while (m<= 5);
		
		
	
	
		
	}
	
	
	
	public static void setarCD(List<Midia>midias, Scanner leitor) {
		Cd c = new Cd();
		System.out.println("Informe a descrição do CD:");
		c.setDescricao(leitor.nextLine());
		System.out.println("informe o preço pago pelo CD:");
		c.setPrecoPago(Double.parseDouble(leitor.nextLine()));
		midias.add(c);
		
	}
	
	public static void setarDVD(List<Midia>midias, Scanner leitor) {
		Dvd d = new Dvd();
		System.out.println("Informe a descrição do DVD:");
		d.setDescricao(leitor.nextLine());
		System.out.println("informe o preço pago pelo DVD:");
		d.setPrecoPago(Double.parseDouble(leitor.nextLine()));
		midias.add(d);
		
	}
	
	

}
