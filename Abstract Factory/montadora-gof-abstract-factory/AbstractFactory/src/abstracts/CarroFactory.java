package abstracts;
import modelos.Roda;
import modelos.Som;

public abstract class CarroFactory {
	
	public abstract Roda montarRoda();
	
	public abstract Som montarSom();
}
