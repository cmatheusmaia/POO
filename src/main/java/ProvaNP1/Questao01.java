package ProvaNP1;

import java.util.Scanner;

public class Questao01 {

	public static void main (String...arg){
		Scanner entrada = new Scanner (System.in);
		
		Integer x;
		Integer x1;
		Integer x2;
		Integer y;
		Integer y1;
		Integer y2;
		
		System.out.println("Informe o valor de x");
		x = entrada.nextInt();
		System.out.println("Informe o valor de x1");
		x1 = entrada.nextInt();
		System.out.println("Informe o valor de x2");
		x2 = entrada.nextInt();
		System.out.println("Informe o valor de y");
		y = entrada.nextInt();
		System.out.println("Informe o valor de y1");
		y1 = entrada.nextInt();
		System.out.println("Informe o valor de y2");
		y2 = entrada.nextInt();
		
		double l1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		double l2 = Math.sqrt(Math.pow(x-x2, 2)+Math.pow(y-y2, 2));
		double l3 = Math.sqrt(Math.pow(x1-x, 2)+Math.pow(y1-y, 2));
		
		double calculoPerimetro = l1 + l2 + l3;
		
		if ((l1 <(l2 + l3) && (l2 < (l1 + l3) & (l3 < (l1 + l2))))){
			System.out.println("Forma um triangulo");
				System.out.println("Calculo perimetro do triangulo: "+calculoPerimetro);
			} else {
			System.out.println("Não forma um triangulo");
			}
		
		}
}
