
public abstract class Conta implements IConta{
	
	private static final int NUMERO_AGENCIA = 1;
	private static int NUMERO_CONTA = 1;
	
	private int agencia;
	private int numero;
	private Cliente cliente;
	private double saldo;
	private Banco banco;

	public Conta(Cliente cliente) {
		agencia = NUMERO_AGENCIA;
		numero = NUMERO_CONTA++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirInfosComuns() {
		System.out.printf("Titular: %s\n", this.cliente.getNome());
		System.out.printf("Agência: %d\n", this.agencia);
		System.out.printf("Número: %d\n", this.numero);
		System.out.printf("Agência: %.2f\n", this.saldo);
	}
	
	public void fazerEmprestimo(Banco banco, double valor, Conta conta) {
		banco.descontarDinheiro(valor);
		conta.depositar(valor);
		System.out.println(banco.getDINHEIRO_EM_CAIXA());
	}
	
}
