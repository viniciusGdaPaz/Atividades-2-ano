package execucao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Aluno;
import modelo.Turma;

public class TurmaExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner leitor = new Scanner(System.in);
		
		Turma t = new Turma();
		t.setAlunos(new ArrayList<>());
		
		
		
		for(int i =0 ; i<5 ; i++) {
			Aluno v = new Aluno();
			System.out.println("----------"+(i+1)+"----------");
			System.out.println("qual o nome do aluno?");
		    v.setNome(leitor.nextLine());
		    System.out.println("qual a idade do aluno?");
		    v.setIdade(Integer.parseInt(leitor.nextLine()));
		    v.setTurma(t);
		    t.getadiciona(v);
		    
		    
		}
		
		for(Aluno c : t.getAlunos()) {
			System.out.println(" O aluno:"+ c.getNome()+" tem "+c.getIdade()+" anos");
		}
		
		
		

}
}
