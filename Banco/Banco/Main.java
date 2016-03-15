package Banco;

public class Main {

	public static void main(String[] args) {
		Banco b = new Banco();
		b.setNome("Caixa economica");
		System.out.println("Este banco é: "+b.getNome());
		
		Banco a = new Banco();
		a.setNome("Banco do Brasil");
		System.out.println("Este banco é: "+a.getNome());
	}
}
