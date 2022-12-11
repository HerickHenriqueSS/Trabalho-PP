
public class TV70PUG677478 extends PhillipsPrototype {

		protected TV70PUG677478 (TV70PUG677478 tv) {
		this.tela = "LED 70 HDR";
		this.valorVenda = tv.getValorVenda();
	}
		

	public TV70PUG677478() {
			
		}


	public String infoTv() {
	
		System.out.println("A TV Phillips TV70PUG677478 POSSUI TELA " + this.tela + " e custa " + getValorVenda());
		return null;
	}

	public PhillipsPrototype clonar() {
		
		return new TV70PUG677478(this);
	}

}
