package execucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Pedido;
import modelo.Prato;

public class PedidoExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor = new Scanner(System.in);
		
		List<Pedido>pedidos = new ArrayList<>();
		List<Prato>pratos = new ArrayList<>();
		
		Prato cm = new Prato();
		cm.setinfo(1, "Camarão a Milanesa", 110.00);
		pratos.add(cm);
		
		Prato pm = new Prato();
		pm.setinfo(2, "Pizza Margherita", 80.00);
		pratos.add(pm);
		
		Prato mc = new Prato();
		mc.setinfo(3, "Macarrão a Carbonara", 60.00);
		pratos.add(mc);
		
		Prato bp = new Prato();
		bp.setinfo(4, "Bife à Parmegiana", 75.00);
		pratos.add(bp);
		
		Prato rf = new Prato();
		rf.setinfo(5, "Risoto  ao Funghi", 70.00);
		pratos.add(rf);
		
		Integer opcao = null;
		do {
			System.out.println("----------Menu---------");
			System.out.println("(1) Cadastrar");
			System.out.println("(2) Cancelar");
			System.out.println("(3) Listar");
			System.out.println("(4) Total de vendas");
			System.out.println("(0) Sair ");
			System.out.println("------------------------");
			
			opcao = Integer.parseInt(leitor.nextLine());
			
			
		switch (opcao) {
		case 1: {
			
			System.out.println("==========Pratos==========");
			System.out.println("| Numero:  | Nome:                 |  valor:    |");
			System.out.println("|    1     | Camarão a Milanesa    |   110.00   |");
			System.out.println("|    2     | Pizza Margherita      |    80.00   |");
			System.out.println("|    3     | Macarrão a Carbonara  |    60.00   |");
			System.out.println("|    4     | Bife à Parmegiana     |    75.00   |");
			System.out.println("|    5     | Risoto  ao Funghi     |    70.00   |");
			
			System.out.println("\n informe  o numero do prato:");
			Integer numped = Integer.parseInt(leitor.nextLine());
			
			for(Prato p : pratos) {
				Pedido pd = new Pedido();
				if(numped == p.getNumero()) {
					pd.setPrato(p);
					System.out.println("informe o nome do cliente : ");
					pd.setNomeCliente(leitor.nextLine());
					System.out.println("informe o nome do garçom : ");
					pd.setNomeGarcom(leitor.nextLine());
					pedidos.add(pd);
				}
			}
			
			break;
			
			
			
		
			
			
		}
		case 2: {
			Integer i ;
			Integer in = pedidos.size()-1;
			System.out.println(" Para cancelar, informe o indice do pedido:");
			i = Integer.parseInt(leitor.nextLine());
			
			if((i-1)>in|| (i-1)<0) {
				System.out.println("indice não encontrado , cheque  lista e tente novamente");
				break;
			}
		
			pedidos.remove(i-1);
			
			break;
		}
		
       case 3: {
    	   Integer n = 1;
    	   if(pedidos.size()==0) {
    		   System.out.println("nenhum pedido realizado");
    		   break;
    	   }
			for(Pedido pc : pedidos) {
				
				System.out.println("O cliente "+ pc.getNomeCliente()+ ", foi atendido pelo garçom"
						+pc.getNomeGarcom()+" ,pediu um prato de(indice "+n+"): " + pc.getPrato().getNome()+
						" no  valor de "+ pc.getPrato().getValor()+" reais");
				
				n=n+1;
			}
			break;
			
			
		}
       case 4: {
    	   Double total = 0.00  ;
    	   
    	   if(pedidos.size()==0) {
    		   System.out.println("nunhum pedido foi realizado ainda");
    		   break;
    	   }
    	   for(Pedido d : pedidos) {
    		   
    		   total = total + d.getPrato().getValor();
    		   
    	   }
    	   
    	   System.out.println(" O valor total de todos o pedidos do restaurante é "+total+" reais");
    	   break;
       }
       
       case 0:{
    	   System.out.println("FIM");
       }
		
		
		default:
			System.out.println("opcão invalida");
		
		}
			
			
			
			
			
			
			
			
			
			
			
		}while(opcao != 0);
		
		
		
	}
	
	

}
