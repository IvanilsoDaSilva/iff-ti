package BSI.LP.Excercicio06;

import java.util.Scanner;
import java.util.Random;

public class Questao03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cont, soma = 0, vetornum[] = new int[200];
		double media;
		for (cont = 0; cont < 200; cont++) {
			System.out.print("Entre com um número:");
			vetornum[cont] = teclado.nextInt();
			soma = soma + vetornum[cont];
		}
		media = soma / 200;
		System.out.println("A média é:" + media);
		for (cont = 0; cont < 200; cont++) {
			if (vetornum[cont] > media) {
				System.out.println("A posição é:" + cont + " Número:" + vetornum[cont]);
			}
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho