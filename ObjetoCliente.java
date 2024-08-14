package Aula_14_08;

public class ObjetoCliente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente(); //GUSTAVO
		Cliente cliente2 = new Cliente(); //MARIA
		
               //CARACTERISTICAS GUSTAVO
		cliente1.setnome( "Nome: Gustavo");
		cliente1.setidentidade(16);
		cliente1.setTelefone(" Telefone: (15)99667-0908");
		cliente1.setcpf("CPF: 876.987.543-09");
		cliente1.setrg("RG: 234.543.234.21");
		
		      //CARACTERISTICAS MARIA
		
		cliente2.setnome( " Nome: Maria");
		cliente2.setidentidade(17);
		cliente2.setTelefone("Celular: (15)99662-9654");
		cliente2.setcpf("CPF: 715.248.870-20");
		cliente2.setrg("RG: 234.543.987.09");
		
              //DADOS GUSTAVO
		System.out.println("--------CLIENTE 1---------");
		System.out.println(cliente1.getnome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getidentidade());
		System.out.println(cliente1.getcpf());
		System.out.println(cliente1.getrg());

		System.out.println("              ");
		System.out.println("         Ações      ");
		System.out.println(" -"+cliente1.Escolher());
		System.out.println(" -"+cliente1.experimentar());
		System.out.println(" -"+cliente1.pagar());
		System.out.println(" -"+cliente1.devolver());
		System.out.println("              ");
		
		    //DADOS MARIA
		System.out.println("--------CLIENTE 2---------");
		System.out.println(cliente2.getnome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getidentidade());
		System.out.println(cliente2.getcpf());
		System.out.println(cliente2.getrg());

		System.out.println("              ");
		System.out.println("         Ações      ");
		System.out.println(" -"+cliente2.Escolher());
		System.out.println(" -"+cliente2.experimentar());
		System.out.println(" -"+cliente2.pagar());
		System.out.println(" -"+cliente2.devolver());
		System.out.println("              ");



	}
}
