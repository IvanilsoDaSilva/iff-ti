package LP.Excercicio04;

import java.util.Scanner;
import java.util.Random;

public class Questao03 {
	public static void main(String[] args) {
		int N = 0, contador=2;
	    boolean numeroPrimo=true;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Programa para calcular se um numero N e primo.");
	    System.out.print("\nInsira N: ");
	    N = input.nextInt();
	    while ((contador<N)&&(numeroPrimo)) {
	      if (N%contador == 0) {
	        numeroPrimo = false;
	        System.out.print(N+"%"+contador+"=0, ");
	      }
	      contador++;
	    }
	    if (numeroPrimo) {
	      System.out.print("O numero é primo");
	    }
	    else {
	      System.out.print("então numero não é primo");
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho