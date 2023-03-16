package LP.Excercicio06;

import java.util.Scanner;
import java.util.Random;

public class Questao06 {
	public static void main(String[] args) {
		String nome[] = new String[30];
		int i, idade[] = new int[30];
		double mediaDasIdades = 0, mediaTotal = 0;
		Scanner leitor = new Scanner(System.in);
		for (i = 0; i < 30; i++) {
			System.out.println("Digite o nome");
			nome[i] = leitor.next();

			System.out.println("Digite a idade");
			idade[i] = leitor.nextInt();

			mediaDasIdades += idade[i];
			leitor.nextLine();

		}
		mediaTotal = mediaDasIdades / 30;
		System.out.println("A média das idades é: " + mediaTotal);

		for (i = 0; i < 30; i++) {
			if (idade[i] >= mediaTotal) {
				System.out.println("Nome: " + nome[i] + " posição " + i);
			}
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho