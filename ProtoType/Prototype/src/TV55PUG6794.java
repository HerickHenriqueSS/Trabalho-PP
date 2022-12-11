
public class TV55PUG6794 extends PhillipsPrototype{

	protected TV55PUG6794 (TV55PUG6794 tv) {
		this.tela = "LED 55 4K Ultra HD AMBILIGHT";
		this.valorVenda = tv.getValorVenda();
	}
	
	
	public TV55PUG6794() {
		
	}


	public String infoTv() {
		System.out.println("A TV Phillips TV55PUG6794 POSSUI TELA " + this.tela + " e custa " + getValorVenda());
		return null;
	}

	
	public PhillipsPrototype clonar() {
		
		return new TV55PUG6794 (this);
	}

}
