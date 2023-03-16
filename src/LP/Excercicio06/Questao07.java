package LP.Excercicio06;

import java.util.Scanner;
import java.util.Random;

public class Questao07 {
	public static void main(String[] args) {
		double soma = 0, preco[] = new double[500];
		int i, quantidadeVendida[] = new int[500];
		Scanner leitor = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			System.out.println("Insira o valor");
			preco[i] = leitor.nextDouble();
			System.out.println("Qual a quantidade vendida desse produto?");
			quantidadeVendida[i] = leitor.nextInt();
		}
		for (i = 0; i < 5; i++) {
			System.out.println("O produto: " + i + " vendeu: " + preco[i] * quantidadeVendida[i]);
			soma += preco[i] * quantidadeVendida[i];
		}
		System.out.println("O total arrecadado foi: " + soma);
	}
}
// Author : Ivanilso da Silva Conceição Filho