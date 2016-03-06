package ListaExercicio;

import java.util.Scanner;

public class Questao15 {

	public static void main (String...arg){
		
		Scanner entrada = new Scanner (System.in);
		
		Float real;
		Float dollar;
		Integer i;
		
		System.out.println("Informe o valor em Real");
		real = entrada.nextFloat();
		
		System.out.println("informe o valor do Dollar hoje");
		dollar = entrada.nextFloat();
		
		Float valor = real * dollar;
		
		System.out.println("O total a ser pago é de: U$$"+valor+" dollares americano.");
				
		
	}
}
