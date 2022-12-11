
public class TV43J5290 extends SamsungPrototype {

	
		protected TV43J5290 (TV43J5290 tv) {
		this.tela = "LED 43 Full HD";
		this.valorVenda = tv.getValorVenda();
	}
	
	
	public TV43J5290() {
		
		}


	public String infoTv() {
		
		System.out.println("A TV TV43J5290 POSSUI TELA " + this.tela + " e custa " + getValorVenda());
		return null;
	}

	
	public SamsungPrototype clonar() {
		
		return new TV43J5290 (this);
	}
	
	

}
