
public abstract class PhillipsPrototype {
	
	protected double valorVenda;
	protected String tela;
	
	

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public abstract String infoTv();
	
	public abstract PhillipsPrototype clonar();


}
