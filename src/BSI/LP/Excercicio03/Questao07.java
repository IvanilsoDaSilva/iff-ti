package BSI.LP.Excercicio03;

import java.util.Scanner;
import java.util.Random;

public class Questao07 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
	    int contador, N;
	    
	    System.out.print("Programa para mostrar multiplos de 7 de 1 à N.");
	    System.out.print("\nInsira N: ");
	    N = INPUT.nextInt();
	    for (contador = 1; contador <= N; contador++) {
	      if (contador % 7 == 0) {
	        System.out.println(contador);
	      }
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho