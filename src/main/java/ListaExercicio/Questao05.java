package ListaExercicio;

import java.util.Scanner;

public class Questao05 {
	public static void main (String...arg){
		
		Scanner entrada = new Scanner (System.in);
		
		int opcaoEscolha;
		Double salario;
		Double emprestimoDisponivel;
		
		System.out.println("Selecione seu departamento");
		System.out.println("[ 1 ] - Diretoria");
		System.out.println("[ 2 ] - Gerência");
		System.out.println("[ 3 ] - Operacional");
		System.out.println("_____________________________");
		System.out.println();
		opcaoEscolha = entrada.nextInt();
		
		switch (opcaoEscolha){
		 case 1:
         	System.out.println("Informe seu salário");
         	salario = entrada.nextDouble();
         	emprestimoDisponivel = (salario * 0.3);
         	System.out.println("Emprestimo disponível é de: R$"+emprestimoDisponivel);
         case 2:
         	System.out.println("Informe seu salário");
         	salario = entrada.nextDouble();
         	emprestimoDisponivel = salario * 0.25;
         	System.out.println("Emprestimo disponível é de: R$"+emprestimoDisponivel);
         case 3:
         	System.out.println("Informe seu salário");
         	salario = entrada.nextDouble();
         	emprestimoDisponivel = salario * 0.20;
         	System.out.println("Emprestimo disponível é de: R$"+emprestimoDisponivel);
         default:
         System.out.println("Esolheu uma opção inválida");
		}
           
		
	}
	
}
