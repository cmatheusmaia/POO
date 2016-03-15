package ListaExercicio;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. A cada
 * tentativa dele, forneça uma dica falando se o número é maior ou menor. Quando
 * ele descobrir exiba uma mensagem de parabéns e mostre em quantas tentativas
 * ele conseguiu.
 * 
 * @author git/cmatheusmaia
 */

public class Questao07 {

	public static void main(String... arg) {

		Random random = new Random();
		boolean continuar = true;
		int sorteado = 1 + random.nextInt(99);
		while (continuar) {

			boolean ganhou = false;
			Scanner scan = new Scanner(System.in);
			int tentativas = 0;
			while (!ganhou) {
				// int palpite = scan.nextInt();
				int palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Dê seu palpite"));
				if (palpite > sorteado) {
					JOptionPane.showMessageDialog(null, "O numero é menor");
				} else if (palpite < sorteado) {
					JOptionPane.showMessageDialog(null, "O seu palpite é maior");
				} else {
					JOptionPane.showMessageDialog(null, "Parabéns você ganhou \n tentativas: " + tentativas);
					ganhou = true;
					continuar = JOptionPane.showInputDialog(null, "Deseja continuar? S para sim e N para não").equalsIgnoreCase("S");
				}
				tentativas++;
			}
		}
	}
}