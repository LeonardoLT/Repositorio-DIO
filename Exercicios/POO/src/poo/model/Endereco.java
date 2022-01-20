package poo.model;

public class Endereco {
	
	public enum TipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO}; //enum cria classificações pra enumerar um objeto
	
	public String endereco;
	public String numero;
	public String complemento;
	public String bairro;
	public String estado;
	public String cep;
	
	public TipoEndereco tipo;
}
