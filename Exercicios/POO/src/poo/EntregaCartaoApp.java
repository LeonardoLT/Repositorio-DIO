package poo;

import java.util.ArrayList;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente();
		endereco.cep = "00000000";
		
		try {
			cliente.adicionarEndereco(endereco);
			System.out.println("Endereço adicionado com sucesso!");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
		}
		
	}
}
