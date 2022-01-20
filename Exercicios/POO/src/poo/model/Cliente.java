package poo.model;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class Cliente extends Pessoa {
	
	private List<Endereco> endereco;
	
	/*public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}*/

	public void adicionarEndereco(Endereco endereco) {
		if(endereco == null) {
			throw new NullPointerException("Endereco n�o pode ser nulo");
		}
		if(endereco.cep == null) {
			throw new NullPointerException("Cep n�o pode ser nulo");
		}
		
		getEndereco().add(endereco);
	}
	
	private List<Endereco> getEndereco() {
		if(endereco == null) {
			endereco = new ArrayList<Endereco>(); //Inicializa o obketo endereco
		}
		return endereco;
	}
}
