package execucao;

import java.util.ArrayList;

import modelo.Jogador;
import modelo.Time;

public class JogadoresExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Time a = new Time();
		a.setJogadores(new ArrayList<>());
		a.setEstado("PR");
		a.setNome("Flamengo");
		
		Time b = new Time();
		b.setJogadores(new ArrayList<>());
		b.setEstado("MG");
		b.setNome("Sport");
		
		Jogador n1 = new Jogador();
		n1.setNome("Leo");
		n1.setIdade(18);
		n1.setPosicao("goleiro");
		n1.setTime(a);
		a.getAdd(n1);
		

		Jogador n2 = new Jogador();
		n2.setNome("joão");
		n2.setIdade(21);
		n2.setPosicao("atacante");
		n2.setTime(a);
		a.getAdd(n2);
		

		Jogador n3 = new Jogador();
		n3.setNome("Gabriel");
		n3.setIdade(25);
		n3.setPosicao("meio-campista");
		n3.setTime(b);
		b.getAdd(n3);
		

		Jogador n4 = new Jogador();
		n4.setNome("Vinicius J.");
		n4.setIdade(30);
		n4.setPosicao("zagueiro");
		n4.setTime(b);
		b.getAdd(n4);
		
		
		
for(Jogador ex : a.getJogadores()) {
			
			System.out.println("O  "+ex.getNome()+" é jogador no Time:"+ex.getTime().getNome()+
					"("+ex.getTime().getEstado()+") possui "+ ex.getIdade()+" anos e atua na "
							+ "posição de "+ ex.getPosicao()+"\n");
			
		}
		
		
        for(Jogador ax : b.getJogadores()) {
			
			System.out.println("O  "+ax.getNome()+" é jogador no Time:"+ax.getTime().getNome()+
					"("+ax.getTime().getEstado()+") possui "+ ax.getIdade()+" anos e atua na "
							+ "posição de "+ ax.getPosicao()+"\n");
			
		}		
		
		
		
		
		
	}

}
