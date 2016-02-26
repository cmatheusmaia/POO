package ListaExercicio;

import java.util.Scanner;

public class Questao04 {
	
	public static void main (String...arg){
		
		Scanner entrada = new Scanner(System.in);
		double comissao = 10;
		double contaFinal;
		
		System.out.println("Informe o valor da conta");
		contaFinal = entrada.nextDouble();
		
		contaFinal = contaFinal + (contaFinal * (comissao /100));
		
		System.out.println(contaFinal);
		
	}
	
}
