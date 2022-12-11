package families;
import abstracts.CarroFactory;
import modelos.CDPlayer;
import modelos.Roda;
import modelos.RodaLigaLeve;
import modelos.Som;

public class CarroLuxoFactory extends CarroFactory{

	@Override
	public Roda montarRoda() {
		return new RodaLigaLeve();
	}

	@Override
	public Som montarSom() {
		return new CDPlayer();
	}

}
