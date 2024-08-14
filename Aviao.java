package Aula_14_08;

public class Aviao {
	String marca;
	String cor;
	String modelo;
	String agencia;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getagencia() {
		return agencia;
	}
	public void setagencia(String agencia) {
		this.agencia = agencia;
	}
	public String voar() {
		return "Voando";
	}
	public String pousar() {
		return "Pousar";
	}
	public String planando() {
		return "Planando";

	}

}



