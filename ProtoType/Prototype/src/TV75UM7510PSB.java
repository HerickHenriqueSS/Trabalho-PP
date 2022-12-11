
public class TV75UM7510PSB extends LGPrototype {

	protected TV75UM7510PSB (TV75UM7510PSB tv) {
		this.tela = "LED 4K  75";
		this.valorVenda = tv.getValorVenda();
	}
	
	

	public TV75UM7510PSB() {
		
	}



	public String infoTv() {
		System.out.println("A TV LG TV75UM7510PSB POSSUI TELA " + this.tela + " e custa " + getValorVenda());
		return null;
	}

	
	public LGPrototype clonar() {
		
		return new TV75UM7510PSB(this) ;
	}

}
