package LP.Excercicio09;

import java.util.Scanner;
import java.util.Random;

public class Questao04 {
	public static int[] numerosOrdenadosDecrescente(int numeros[]) {
		int i, j, aux;
		
		for (i=0;i<numeros.length;i++) {
			for (j=i+1;j<numeros.length;j++) {
				if(numeros[i]<numeros[j]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		return numeros;
	}
	
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner input = new Scanner(System.in);
		int i, tamanhoArray = 10, numeros[] = new int[tamanhoArray], numerosDecrescentes[] = new int[tamanhoArray];
		
		System.out.print("Programa para indentificar quantidade de numeros negativos em array com numeros aleatórios.\n");
		for (i=0; i<numeros.length;i++) {
			numeros[i] = gerador.nextInt(101)-50;
			System.out.printf("| %4d |", numeros[i]);
		}
		
		numerosDecrescentes = numerosOrdenadosDecrescente(numeros);
		System.out.print("\n");
		
		for(i=0;i<numerosDecrescentes.length;i++) {
			System.out.printf("| %4d |",numerosDecrescentes[i]);
		}
	}
} 
// Author : Ivanilso da Silva Conceição Filho