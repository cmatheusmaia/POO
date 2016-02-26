package ListaExercicio;

import java.util.Scanner;

public class Questao02 {
	public static void main (String...arg){
		
		Scanner entrada = new Scanner (System.in);
		
		double dividaInicial;
		double dividaFinal;
		double qtdMeses;
		double taxaJuros;
		
		System.out.println("Informe o valor da divida inicial");
		dividaInicial = entrada.nextDouble();
		System.out.println("Informe a quantidade de meses que deseja pagar essa divida");
		qtdMeses = entrada.nextDouble();
		System.out.println("Informe a taxa de juros");
		taxaJuros =entrada.nextDouble();
		
		dividaFinal = dividaInicial + (dividaInicial * (taxaJuros/100) * qtdMeses);
		System.out.println(dividaFinal);
		
	}
}
