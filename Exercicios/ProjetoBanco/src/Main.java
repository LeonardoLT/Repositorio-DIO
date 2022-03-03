
public class Main {
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		Cliente cliente01 = new Cliente("Leonardo", "Rua dos limões");

		Conta cc = new ContaCorrente(cliente01);
		
		cc.depositar(100);
		cc.imprimirExtrato();
		
		banco.adicionarConta(cc);
		
		cc.fazerEmprestimo(banco, 500, cc);
		cc.imprimirExtrato();
		
		Cartao cartao01 = new CartaoCredito(cc, "0001 0001 0001 0001", "123");
		cartao01.informacoesCartao();
		
	}

}
