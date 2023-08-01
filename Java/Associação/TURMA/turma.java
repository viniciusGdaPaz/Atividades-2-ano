package modelo;

import java.util.List;

public class Turma {

	private String nome;
	private String curso;
	private List<Aluno>alunos;
	
	
	public void getadiciona(Aluno a){
		alunos.add(a);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
}
