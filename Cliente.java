package Aula_14_08;

public class Cliente {

	int identidade;
	String nome;
	String telefone;
	String cpf;
	String rg;

	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getidentidade() {
		return identidade;
	}
	public void setidentidade( int identidade) {
		this.identidade = identidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	public String getrg() {
		return rg;
	}
	public void setrg(String rg) {
		this.rg= rg;
	}
	public String Escolher() {
		return "Escolher";
	}
	public String experimentar() {
		return "experimentar";
	}
	public String pagar() {
		return "Pagar";
	}
	public String devolver() {
		return "devolver";

	}

}



