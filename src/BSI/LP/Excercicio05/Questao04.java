package BSI.LP.Excercicio05;

import java.util.Scanner;
import java.util.Random;

public class Questao04 {
	public static void main(String[] args) {
		String palavra1, palavra2;

	    Scanner input = new Scanner(System.in);
	    System.out.print("Programa que compara duas palavras, qual a menor.");
	    System.out.print("\nInsira a primeira palalavra: ");
	    palavra1 = input.next();
	    System.out.print("Insira a segunda palavra: ");
	    palavra2 = input.next();
	    if(palavra1.length() >palavra2.length()){
	      System.out.print("A primeira palavra e maior.");
	    }
	    else {
	      System.out.print("A segunda palavra é maior.");
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho