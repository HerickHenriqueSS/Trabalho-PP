package main;
import abstracts.CarroFactory;
import families.CarroLuxoFactory;
import families.CarroPopularFactory;
import modelos.Carro;

public class MontadoraDeCarro {

	private static Carro montarCarro(String tipo) {
		
		CarroFactory cf = null;
		
		if(tipo == "luxo") {
			cf = new CarroLuxoFactory();
		} else if(tipo == "popular") {
			cf = new CarroPopularFactory();
		}
		
		Carro c = new Carro();
		c.setRoda(cf.montarRoda());
		c.setSom(cf.montarSom());
		
		return c;
	}
	
	
	
	
	@SuppressWarnings("unused") //Suprime o aviso de objeto não utilizado
	public static void main(String[] args) {
		
		//Usar o debug para ver os objetos dentro de cada família
		Carro c1 = montarCarro("luxo");
		Carro c2 = montarCarro("popular");
		System.out.println("END");
				
	}

}
