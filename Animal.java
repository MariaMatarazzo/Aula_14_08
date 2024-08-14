package Aula_14_08;

public class Animal {

	String Tamanho;
	String cor;
	String especie;
	String alimentacao;

	public String getTamanho() {
		return Tamanho;
	}
	public void setTamanho(String Tamnho) {
		this.Tamanho = Tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getespecie() {
		return especie;
	}
	public void setespecie(String especie) {
		this.especie = especie;
	}
	public String getalimentacao() {
		return alimentacao;
	}
	public void setalimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	public String pular() {
		return "pular";
	}
	public String correr() {
		return "correr";
	}
	public String comer() {
		return "comer";
	}

}


