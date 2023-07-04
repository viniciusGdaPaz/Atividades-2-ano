package execucao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Posto;

public class PostoExec {

	public static void main(String[] args) {
Integer l;
Integer in = 1;
Integer opcao;		
Scanner leitor = new Scanner(System.in);
Posto Posto = new Posto();
Posto.setAbastecimentoGasolina(new ArrayList<>());
Posto.setLitrosGasolina(0);
do {	
System.out.println("==========Menu==========");	
System.out.println("(1) Abastecer");
System.out.println("(2) Repor Estoque");
System.out.println("(3) Listar Abastecimento");
System.out.println("(0) Sair");
System.out.println("========================");
opcao=Integer.parseInt(leitor.nextLine());

switch(opcao) { 
//============================================
case 1 :
	System.out.println("==========Abastecimento==========");
	System.out.println("Quantos litros você deseja abastecer?");
	l=Integer.parseInt(leitor.nextLine());
	if(Posto.abastecer(l)==false){
		System.out.println("gasolina insuficiente");
	}else {
		System.out.println("abastecimento realizado");
		
        
		
	}
	
	System.out.println("================================");
	
	
 break;

//============================================
 
//============================================
case 2 :
	System.out.println("==========Reposição==========");
	System.out.println("Quantos litros voce irá repor ?");
	l=Integer.parseInt(leitor.nextLine());
	Posto.reporestoque(l);
	System.out.println("Estoque: "+Posto.getLitrosGasolina()+" Litros de gasolina");
	System.out.println("=============================");
	

break;

//============================================

//============================================
case 3 :
		for( Integer i : Posto.getAbastecimentoGasolina()){
			System.out.println("Abastecimento ("+(in)+") =  "+i+" litros");
			in++;
		}
		

		 break;
//============================================

//============================================
case 0:
		System.out.println("PROGRAMA ENCERRADO :)");		
				

				 break;
//============================================
		 
		 default:
			 System.out.println("essa opcão não existe");
			 
		break;	 
}
	
}while(opcao!=0);
		
	}

}
