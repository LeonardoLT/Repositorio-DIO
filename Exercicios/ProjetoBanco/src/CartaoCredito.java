
public class CartaoCredito extends Cartao {

	private double limite;
	
	public CartaoCredito(Conta conta, String numero, String codigo) {
		super(conta, numero, codigo);
		// TODO Auto-generated constructor stub
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
