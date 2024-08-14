package Aula_14_08;

public class ObjetoAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal1 = new Animal ();
		
		animal1.setespecie("Especie:Mini-Loop");
		animal1.setCor("Cor:Laranja");
		animal1.setTamanho("Tamanho:porte medio");
		animal1.setalimentacao("Alimentação: Vegetais");
		
		
		System.out.println("--------COELHO---------");
		System.out.println(animal1.getCor());
		System.out.println(animal1.getespecie());
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getalimentacao());
		
		System.out.println("--------AÇÕES---------");
		System.out.println(" -"+animal1.comer());
		System.out.println(" -"+animal1.pular());
		System.out.println(" -"+animal1.correr());
		
	}

}
