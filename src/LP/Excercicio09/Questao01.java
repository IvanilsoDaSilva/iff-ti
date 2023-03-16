package LP.Excercicio09;

import java.util.Scanner;
import java.util.Random;

public class Questao01 {
	public static int quantidadeNumerosNegativos(double numeros[]){
		int i, contadorNumerosNegativos=0;
		
		for(i=0;i<numeros.length;i++) {
			if(numeros[i]<0){
				contadorNumerosNegativos++;
			}
		}
		return contadorNumerosNegativos;
	}
	
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		int TAMANHODOARRAY = 10, i;
		double numeros[] = new double[TAMANHODOARRAY];
		
		System.out.print("Programa para indentificar quantidade de numeros negativos em array com numeros aleatórios.\n");
		for(i=0;i<numeros.length;i++) {
			numeros[i] = GERADOR.nextDouble(21)-10;
			System.out.printf("|%6.2f  |",numeros[i]);
		}
		System.out.print("\nNumeros negativos: "+quantidadeNumerosNegativos(numeros));
	}
}
// Author : Ivanilso da Silva Conceição Filho