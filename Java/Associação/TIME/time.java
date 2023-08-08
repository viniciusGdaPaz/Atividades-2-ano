package modelo;

import java.util.List;

public class Time {

	
	//atributos
	private String nome;
	private String estado;
	private List<Jogador>jogadores;
	
	
	
	//metodos
	public void getAdd(Jogador joga){
		this.jogadores.add(joga);
	}
	
	//gets and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	
	
}
