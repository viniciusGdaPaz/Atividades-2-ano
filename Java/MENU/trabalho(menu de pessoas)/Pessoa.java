package modelo;

public class Pessoa {
	//atributos
private String nome;
private String sobrenome;
		


//metodos
public String getname() {
String name = (this.nome+" "+this.sobrenome);
			return name;
}
		
		
		
//gets and seters
public String getNome() {
 return nome;
		}
public void setNome(String nome) {
this.nome = nome;
		}
public String getSobrenome() {
	return sobrenome;
		}
public void setSobrenome(String sobrenome) {
this.sobrenome = sobrenome;
		}
		
		
		
		
		

	
}
