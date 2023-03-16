package LP.Excercicio06;

import java.util.Scanner;
import java.util.Random;

public class Questao04 {
	public static void main(String[] args) {
		int i, maior = 0, numeros[] = new int[50];
		Scanner leitor = new Scanner(System.in);
		for (i = 0; i < 50; i++) {
			System.out.println("Digite um número");
			numeros[i] = leitor.nextInt();
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		for (i = 0; i < numeros.length; i++) {
			if (numeros[i] == maior) {
				System.out.println("Número: " + numeros[i] + " posição " + i + " \n");
			}
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho