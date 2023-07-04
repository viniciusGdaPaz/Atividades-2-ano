package modelo;

import java.util.List;

public class Posto {
    //atributos
	private Integer litrosGasolina;
	List<Integer>abastecimentoGasolina ;
	
	//metodos
	public Boolean abastecer(Integer Litros) {
		if(this.litrosGasolina>=Litros) {
			this.litrosGasolina -= Litros;
			this.abastecimentoGasolina.add(Litros);
			return true;
		}else {
			return false;
		}
	}
	
	
	public void reporestoque(Integer Litros) {
		this.litrosGasolina+=Litros;
	}
	
	//gets and sets

	public Integer getLitrosGasolina() {
		return litrosGasolina;
	}

	public void setLitrosGasolina(Integer litrosGasolina) {
		this.litrosGasolina = litrosGasolina;
	}

	public List<Integer> getAbastecimentoGasolina() {
		return abastecimentoGasolina;
	}

	public void setAbastecimentoGasolina(List<Integer> abastecimentoGasolina) {
		this.abastecimentoGasolina = abastecimentoGasolina;
	}
	
	
}
