package BSI.LP.Excercicio03;

import java.util.Scanner;
import java.util.Random;

public class Questao04 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
	    int numero, soma = 0, N;
	    
	    System.out.print("Programa para somar numeros entre 1 e N.");
	    System.out.print("\nInsira N: ");
	    N = INPUT.nextInt();
	    for (numero = 1; numero <= N; numero++) {
	      soma = soma + numero;
	    }
	    System.out.print("A soma é: " + soma);
	}
}
// Author : Ivanilso da Silva Conceição Filho