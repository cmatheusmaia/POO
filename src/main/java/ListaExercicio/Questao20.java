package ListaExercicio;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao20 {

	public static void main (String...arg){
		
		Scanner entrada = new Scanner (System.in);
		Integer tabuada;
		
		for (int I = 1; I <= 10; I++){
			System.out.println("Tabuada de "+I);
			for(int N = 1; N <= 10; N++){
				System.out.println(I+" x "+N+" = "+I*N);
			}
		}
		
	}
}

