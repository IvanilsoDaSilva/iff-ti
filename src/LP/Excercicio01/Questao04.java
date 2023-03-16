package LP.Excercicio01;

import java.util.Scanner;
import java.util.Random;

public class Questao04 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		String a, b, aux;

	    System.out.print("Programa trocar valor de A e B.");
	    System.out.print("\nInsira o valor de A: ");
	    a = INPUT.next();
	    System.out.print("Insira o valor de B: ");
	    b = INPUT.next();
	    aux = a;
	    a = b;
	    b = aux;
	    System.out.print("Valor de A: "+a+"\nValor de B: "+b);
	}
}
// Author : Ivanilso da Silva Conceição Filho