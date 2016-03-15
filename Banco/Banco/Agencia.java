package Banco;

public class Agencia {
	
	private String nome;
	private Long numero;
	private String endereco;
	private Banco banco;

	public String getNome() {
		return nome;
	}
	public Long getNumero() {
		return numero;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
