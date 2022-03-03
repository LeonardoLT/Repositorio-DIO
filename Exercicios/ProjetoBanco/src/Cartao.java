
public class Cartao {

	protected String numero;
	protected String codigo;
	protected Conta conta;
	protected String titular;
	
	
	public Cartao(Conta conta, String numero, String codigo){
		this.numero = numero;
		this.codigo = codigo;
		this.conta = conta;
		titular = conta.getCliente().getNome();
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Conta getConta() {
		return conta;
	}


	public void setConta(Conta conta) {
		this.conta = conta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void informacoesCartao() {
		System.out.printf("\nInformações do cartão\n");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Codigo: %s\n", codigo);
	}
	
}
