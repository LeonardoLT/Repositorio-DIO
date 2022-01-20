package poo.model;

import javax.management.RuntimeErrorException;

public class Pessoa {
	
	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;
	

	public enum TipoPessoa {FISICA, JURIDICA}
	
	public int codigo;
	public String nome;
	public String documento;
	public TipoPessoa tipo;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDopcumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		if(documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento n�o pode ser nulo ou vazio");
		}
		if(documento.length() == TAMANHO_CPF) {
			setDocumento(documento, TipoPessoa.FISICA);
		}else if(documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, TipoPessoa.JURIDICA);
		}else {
			throw new RuntimeException("Documento inv�lido para pessoa Fisica ou Juridica");
		}
		this.documento = documento;
	}
	
	private void setDocumento(String documento, TipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}

	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}
}
