import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();
	private static double DINHEIRO_EM_CAIXA;

	public Banco() {
		nome = "LeoBank";
		DINHEIRO_EM_CAIXA = 10000;
	}

	public String getNome() {
		return nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}

	public static double getDINHEIRO_EM_CAIXA() {
		return DINHEIRO_EM_CAIXA;
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void descontarDinheiro(double valor) {
		DINHEIRO_EM_CAIXA -= valor;
	}

}
