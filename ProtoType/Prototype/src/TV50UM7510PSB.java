
public class TV50UM7510PSB extends LGPrototype {

	protected TV50UM7510PSB (TV50UM7510PSB tv) {
		this.tela = "LED 50 UHD 4K";
		this.valorVenda = tv.getValorVenda();
	}
	

	
	public TV50UM7510PSB() {
		
	}


	public String infoTv() {
		
		System.out.println("A TV LG TV50UM7510PSB POSSUI TELA " + this.tela + " e custa " + getValorVenda());
		return null;
	}

	
	public LGPrototype clonar() {
		
		return new TV50UM7510PSB (this);
	}
	
	

}
