package BSI.LP.Excercicio01;

import java.util.Scanner;
import java.util.Random;

public class Questao03 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float metros, centimetros;
		
	    System.out.print("Programa para passar metros para centímetros.");
	    System.out.print("\nInsira o valor em metros: ");
	    metros = INPUT.nextFloat();
	    centimetros = metros*100;
	    System.out.print("Valor em centínetros: "+centimetros);
	}
}
// Author : Ivanilso da Silva Conceição Filho