package families;
import abstracts.CarroFactory;
import modelos.Roda;
import modelos.RodaSimples;
import modelos.Som;
import modelos.TocaFitas;

public class CarroPopularFactory extends CarroFactory{

	@Override
	public Roda montarRoda() {
		return new RodaSimples();
	}

	@Override
	public Som montarSom() {
		return new TocaFitas();
	}

}
