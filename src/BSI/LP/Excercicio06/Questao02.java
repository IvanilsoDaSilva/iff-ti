package BSI.LP.Excercicio06;

import java.util.Scanner;
import java.util.Random;

public class Questao02 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		double elementosA[] = new double[20];
		double elementosB[] = new double[20];
		int contadorElementoA, contadorElementoB = 0;
		for (contadorElementoA = 0; contadorElementoA < 20; contadorElementoA++) {
			System.out.print("Informe um elento para o conjunto A: ");
			elementosA[contadorElementoA] = entradaTeclado.nextDouble();
		}
		for (contadorElementoA = 19; contadorElementoA >= 0; contadorElementoA--) {
			elementosB[contadorElementoB] = elementosA[contadorElementoA];
			contadorElementoB++;
		}
		System.out.println("Vetor B é :");
		for (contadorElementoB = 0; contadorElementoB < 20; contadorElementoB++) {
			System.out.println(elementosB[contadorElementoB]);
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho