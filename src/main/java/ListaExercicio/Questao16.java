package ListaExercicio;

import java.util.Scanner;

public class Questao16 {

	public static void main (String...arg){
		
		Scanner entrada = new Scanner(System.in);
		
		Double valor = 50.00; // valor mensal;
		Integer minQlqr = 100; // plano de 100 min qualquer num, por mês;
		Integer minVaiVai = 50; // valor minuto para ligação vai vai;
		Double valorExcedenteVaiVai = 0.20; // valor em ligação excedente vai vai;
		Double valorExcedenteOutrasOp = 0.65; // valor de excedente para outras operadoras;
		Double valorLigacaoFixa = 0.10; // valor ligação fixa
		int opcaoEscolha; // função para o switch case;
		
		System.out.println("Controle do plano Vai-Vai");
		System.out.println("escolha um das seguintes opções");
		System.out.println("1 - Outras operadoras");
		System.out.println("2 - Ligações Vai-Vai");
		System.out.println("3 - telefonia fixa");
		opcaoEscolha = entrada.nextInt();
		System.out.println();
		
		switch (opcaoEscolha){
		 case 1: // a opção 1 válida o consumo de ligação para outras operadoras.
			 System.out.println("Informe a quantidade de minutos utilizado para ligar"
			 		+ " para outras operadoras ");
			 Integer l1 = entrada.nextInt();
			 
			 if (l1 < minQlqr){
				 System.out.println("Você consumiu " + l1 + " minuto. Ainda restam "+ (minQlqr - l1));
				 
			 } else {
				 if (l1> minQlqr){
					 System.out.println("Você excedeu o pacote disponibilizado para ligar "
						 		+ "para outras operadoras. ");
						 System.out.println("total consumido em minutos: "+l1);
						 System.out.println("total em excedentes R$"+ ((l1 - minQlqr) * valorExcedenteOutrasOp) );
				 }
				 
			 }
		 case 2:  // a opção 2 válida o consumo de ligação para numeros da Vai-Vai.
			 System.out.println("Informe a quantidade de minutos utilizado para ligar"
			 		+ " para outras operadoras ");
			 Integer l2 = entrada.nextInt();
			 
			 if (l2 < minVaiVai){
				 System.out.println("Você consumiu " + l2 + " minuto. Ainda restam "+ ((minQlqr + minVaiVai) - l2));
				 
			 } else {
				 if (l2> minVaiVai){
					 System.out.println("Você excedeu o pacote disponibilizado para ligar "
						 		+ "para outras operadoras. ");
						 System.out.println("total consumido em minutos: "+l2);
						 System.out.println("total em excedentes R$"+ ((l2 - minVaiVai) * valorExcedenteVaiVai) );
				 }
				 
			 }
		 case 3:  // a opção 3 válida o consumo de ligação para telefones fixos.
			 System.out.println("Informe a quantidade de minutos utilizado para ligar"
			 		+ " para outras operadoras ");
			 Integer l3 = entrada.nextInt();
			 
			 if (l3 < minQlqr){
				 System.out.println("Você consumiu " + l3 + " minuto. Ainda restam "+ (minQlqr - l3));
				 
			 } else {
				 if (l3> minQlqr){
					 System.out.println("Você excedeu o pacote disponibilizado para ligar "
						 		+ "para outras operadoras. ");
						 System.out.println("total consumido em minutos: "+l3);
						 System.out.println("total em excedentes R$"+ ((l3 - minQlqr) * valorExcedenteOutrasOp) );
				 }
				 
			 }	 
		}
	}
}
