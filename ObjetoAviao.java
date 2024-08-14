package Aula_14_08;
public class ObjetoAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao aviao1 = new Aviao ();
		
		aviao1.setCor( "Branco");
		aviao1.setModelo("Airbus A320neo");
		aviao1.setagencia("Latam");
		aviao1.setMarca("Airbus");
		
		
		System.out.println("--------AVIAO 1---------");
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.getagencia());
		System.out.println(aviao1.getMarca());
	}

}
