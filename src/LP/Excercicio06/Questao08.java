package LP.Excercicio06;

import java.util.Scanner;
import java.util.Random;

public class Questao08 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		int vetorA[], vetorB[], vetorSoma[], quantidadeVetor, i, contadorDeIguais = 0;
		System.out.print("Informe a quantidade de números do vetor: ");
		quantidadeVetor = entradaTeclado.nextInt();
		vetorA = new int[quantidadeVetor];
		vetorB = new int[quantidadeVetor];
		vetorSoma = new int[quantidadeVetor];
		for (i = 0; i < quantidadeVetor; i++) {
			System.out.printf("Informe o %dº número do vetor A: ", i + 1);
			vetorA[i] = entradaTeclado.nextInt();
			System.out.printf("Informe o %dº número do vetor B: ", i + 1);
			vetorB[i] = entradaTeclado.nextInt();
			if (vetorA[i] == vetorB[i]) {
				contadorDeIguais++;
			}
		}
		for (i = 0; i < quantidadeVetor; i++) {
			vetorSoma[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorSoma[i]);
		}
		System.out.printf("Quantidade de numeros iguais no vetor \"A\" e \"B\" é: %d", contadorDeIguais);
	}
}
// Author : Ivanilso da Silva Conceição Filho