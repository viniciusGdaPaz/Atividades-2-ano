package execucao;
import modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaExec {

	public static void main(String[] args) {

 List<Pessoa> pessoas = new ArrayList<>();
		
 Scanner leitor = new Scanner(System.in);
 
 Integer opcao;
 
 do {
	 
	 System.out.println("==========MENU==========");
 System.out.println("(1): Cadastrar");
 System.out.println("(2): Exibir a Lista");
 System.out.println("(3): Excluir");
 System.out.println("(0): Sair");
 System.out.println("========================");
 System.out.println("\n Digite a opção:");
 opcao=Integer.parseInt(leitor.nextLine());
 
  switch(opcao) {
  case 1:
	  Pessoa p = new Pessoa();
	  System.out.println("\nInforme o nome da pessoa :");
	  p.setNome(leitor.nextLine());
	  System.out.println("\nInforme o Sobrenome :");
	  p.setSobrenome(leitor.nextLine());
	  pessoas.add(p);
	  
  break;
 //======================================
  case 2:
	  
	  System.out.println("==========Pessoas==========");
	  for(Pessoa n : pessoas) {
		 
		 System.out.println("("+(pessoas.indexOf(n)+1)+")"+n.getname()+"\n");
	  }
		  
	  
	  
	  break;
//======================================
  case 3:
	  System.out.println();
	  System.out.println("\n==========Exclusão de pessoas==========");
	  
	  
	  Integer indice ;
	  System.out.println("Informe o indice da pessoa que deseja excluir até("+(pessoas.size())+"):");
	  indice = Integer.parseInt(leitor.nextLine());
	  if((indice-1)<= pessoas.size()) {
			indice=indice-1;
			pessoas.remove(indice.intValue());
		}else
			System.out.println("índice não encontrado");
       	  
	  
	  
	  break;
//======================================
  case 0:
	  
	  System.out.println("\n FIM DO PROGRAMA");
	  
	  break;
//======================================
  default :
		System.out.println("opção invalida");
	    break;
  }
  
 
 
 
 }while(opcao!=0);
 
		
		
		
		
		
	}

}
