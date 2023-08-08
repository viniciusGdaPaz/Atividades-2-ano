package execucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Departamento;
import modelo.Funcionario;

public class FuncionarioExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Funcionario> funcionario = new ArrayList<>();
		
		Scanner leitor = new Scanner(System.in);
		
		for(int x=0 ; x<5 ; x++) {
			
			Funcionario a = new Funcionario();
			Departamento b = new Departamento();
			
			System.out.println("-----------------------"+(x+1)+"-----------------------");
			System.out.println("Informe o nome do funcionario:");
			a.setNome(leitor.nextLine());
			System.out.println("Informe o cargo do Funcionario:");
			a.setCargo(leitor.nextLine());
			System.out.println("Informe o sálario do funcionario:");
			a.setSalario(Float.parseFloat(leitor.nextLine()));
			a.setDepto(b);
			System.out.println("Informe o Departamento:");
			b.setNome(leitor.nextLine());
			System.out.println("Informe o numero da Sala:");
			b.setNumeroSala(Integer.parseInt(leitor.nextLine()));
			funcionario.add(a);
						
			
		}
		
		for(Funcionario ex : funcionario) {
			System.out.println(" \nnome do funcionario: "+ ex.getNome()+ "\ncargo: "+ex.getCargo()
			                    +" \nsálario: "+ex.getSalario()+" reais"
			                    + "\nnome do departamento: "+ex.getDepto().getNome()+
			                    "( numero da sala: "+ex.getDepto().getNumeroSala()+")");
		}
		
		
		leitor.close();
		
		
		
		
	}

}
