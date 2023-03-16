package BSI.LP.Excercicio01;

import java.util.Scanner;
import java.util.Random;

public class Questao01 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float celsius, kelvin, fahrenheit;
		
	    System.out.print("Programa para converter graus Celsius em Fahrenheit e Kelvin.");
	    System.out.print("\nInsira o valor em Celsius: ");
	    celsius = INPUT.nextFloat();
	    kelvin = celsius + 273;
	    fahrenheit = (9*celsius+160)/5;
	    System.out.print("Valor em Kelvin: "+kelvin+"\nValor em Fahrenheit: "+fahrenheit);
	}
}
// Author : Ivanilso da Silva Conceição Filho