package Aula_14_08;

public class ObjetoAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal1 = new Animal (); //coelho
		Animal animal2 = new Animal (); //vaca
		Animal animal3 = new Animal (); //bezerro
		Animal animal4 = new Animal (); //cachorro
		Animal animal5 = new Animal (); //coelho
		Animal animal6 = new Animal (); //pintinho
		Animal animal7 = new Animal (); //galinha
		
	                   	//CARACTERISTICAS DOS ANIMAIS
	
		//CARACTERISTICAS DO COELHO
		
		animal1.setespecie("Especie:Mini-Loop");
		animal1.setCor("Cor:Laranja");
		animal1.setTamanho("Tamanho:porte medio");
		animal1.setalimentacao("Alimentação: Vegetais");
         

		
		animal2.setespecie("Especie: Jersey ");
		animal2.setCor("Cor: Preto e Branco");
		animal2.setTamanho("Tamanho:porte Grande");
		animal2.setalimentacao("Alimentação: Vegetais");
		
		//CARACTERISTICAS DO BEZERRO
		
		animal3.setespecie("Especie:Angus ");
		animal3.setCor("Cor: Preto e Branco");
		animal3.setTamanho("Tamanho:porte Pequeno");
		animal3.setalimentacao("Alimentação: Vegetais");
		
		//CARACTERISTICAS DO CABRITO
		
		animal4.setespecie("Especie:Canindé ");
		animal4.setCor("Cor: Bege");
		animal4.setTamanho("Tamanho:porte Pequeno");
		animal4.setalimentacao("Alimentação: Vegetais");
		
		//CARACTERISTICAS DO CACHORRO
		
		animal5.setespecie("Especie:Lulu da Pomerania");
		animal5.setCor("Cor: Branco");
		animal5.setTamanho("Tamanho:porte Pequeno");
		animal5.setalimentacao("Alimentação: Ração");
		
		//CARACTERISTICAS DO PINTINHO
		
		animal6.setespecie("Especie:Gallus gallus domesticus");
		animal6.setCor("Cor: Amarelo");
		animal6.setTamanho("Tamanho:porte Pequeno");
		animal6.setalimentacao("Alimentação: Minhoca");
		
		//CARACTERISTICAS DA GALINHA
		
		animal7.setespecie("Especie:Lagorne");
		animal7.setCor("Cor: Branca");
		animal7.setTamanho("Tamanho:porte Pequeno");
		animal7.setalimentacao("Alimentação: Milho");
		
		
		                    //APRESENTAÇAO DO COELHO
		
		
		System.out.println("--------COELHO---------");
		System.out.println(animal1.getCor());
		System.out.println(animal1.getespecie());
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getalimentacao());
		
		System.out.println("              ");
		System.out.println("         Ações      ");
		System.out.println(" -"+animal1.comer());
		System.out.println(" -"+animal1.dorme());
		System.out.println(" -"+animal1.correr());
		System.out.println("              ");
		
		//APRESENTAÇAO DA VACA
		
		System.out.println("--------VACA---------");
		System.out.println(animal2.getCor());
		System.out.println(animal2.getespecie());
		System.out.println(animal2.getTamanho());
		System.out.println(animal2.getalimentacao());
		
		System.out.println("              ");
		System.out.println("         Ações       ");
		System.out.println(" -"+animal1.comer());
		System.out.println(" -"+animal1.dorme());
		System.out.println(" -"+animal1.correr());
		System.out.println("              ");
		
		//APRESENTAÇAO DO BEZERRO
		
		System.out.println("--------BEZERRO---------");
		System.out.println(animal3.getCor());
		System.out.println(animal3.getespecie());
		System.out.println(animal3.getTamanho());
		System.out.println(animal3.getalimentacao());
		
		System.out.println("              ");
		System.out.println("         Ações       ");
		System.out.println(" -"+animal1.comer());
		System.out.println(" -"+animal1.dorme());
		System.out.println(" -"+animal1.correr());
		System.out.println("              ");
		
		//APRESENTAÇAO DO CABRITO
		
		System.out.println("--------CABRITO---------");
		System.out.println(animal4.getCor());
		System.out.println(animal4.getespecie());
		System.out.println(animal4.getTamanho());
		System.out.println(animal4.getalimentacao());
		
		System.out.println("              ");
		System.out.println("         Ações       ");
		System.out.println(" -"+animal1.comer());
		System.out.println(" -"+animal1.dorme());
		System.out.println(" -"+animal1.correr());
		System.out.println("              ");
		
		//APRESENTAÇAO DO CACHORRO
		
		System.out.println("--------CACHORRO---------");
		System.out.println(animal5.getCor());
		System.out.println(animal5.getespecie());
		System.out.println(animal5.getTamanho());
		System.out.println(animal5.getalimentacao());
		
		System.out.println("              ");
		System.out.println("         Ações       ");
		System.out.println(" -"+animal1.comer());
		System.out.println(" -"+animal1.dorme());
		System.out.println(" -"+animal1.correr());
		System.out.println("              ");
		
		//APRESENTAÇAO DO PINTINHO
		
		System.out.println("--------PINTINHO---------");
		System.out.println(animal6.getCor());
		System.out.println(animal6.getespecie());
		System.out.println(animal6.getTamanho());
		System.out.println(animal6.getalimentacao());
		
		System.out.println("              ");
		System.out.println("         Ações       ");
		System.out.println(" -"+animal1.comer());
		System.out.println(" -"+animal1.dorme());
		System.out.println(" -"+animal1.correr());
		System.out.println("              ");
		
		//APRESENTAÇAO DA GALINHA
		
		System.out.println("              ");
		System.out.println("--------GALINHA---------");
		System.out.println(animal7.getCor());
		System.out.println(animal7.getespecie());
		System.out.println(animal7.getTamanho());
		System.out.println(animal7.getalimentacao());
		
		System.out.println("         Ações       ");
		System.out.println(" -"+animal1.comer());
		System.out.println(" -"+animal1.dorme());
		System.out.println(" -"+animal1.correr());
		System.out.println("              ");
		
	}

}
