package LP.Excercicio09;

import java.util.Scanner;
import java.util.Random;

public class Questao02 {
	public static int[] inverteArray(int numeros[]) {
		int i, numerosInvertidos[] = new int[numeros.length];
		
		for(i=0;i<numeros.length;i++) {
			numerosInvertidos[numeros.length-1-i] = numeros[i];
		}
		return numerosInvertidos;
	}
	
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		int i, TAMANHODOARRAY = 10, numeros[] = new int[TAMANHODOARRAY], numerosInvertidos[] = new int[TAMANHODOARRAY];

		System.out.print("Programa para inverter array de numeros inteiros.\n");
		for(i=0;i<numeros.length;i++) {
			numeros[i] = GERADOR.nextInt(21)-10;
			System.out.printf("| %3d |", numeros[i]);
		}
		numerosInvertidos = inverteArray(numeros);
		System.out.print("\n");
		for(i=0;i<numerosInvertidos.length;i++) {
			System.out.printf("| %3d |",numerosInvertidos[i]);
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho