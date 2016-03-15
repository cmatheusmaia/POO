package Banco;

public class Conta {

	private String nome;
	private Double saldo;
	private Long id;
	private Integer tipo;
	private Cliente cliente;
	private Agencia agencia;

	public String getNome() {
		return nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public Long getId() {
		return id;
	}
	public Integer getTipo() {
		return tipo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	
}
