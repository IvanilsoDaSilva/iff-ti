package LP.Excercicio05;

import java.util.Scanner;
import java.util.Random;

public class Questao05 {
	public static void main(String[] args) {
		String palavra1 = new String();
	    String palavra2 = new String();

	    Scanner input = new Scanner(System.in);
	    System.out.print("Programa conta caracteres de palavra e compara se são iguais.");
	    System.out.print("\nInsira a primeira palalavra: ");
	    palavra1 = input.next();
	    System.out.print("Insira a segunda palavra: ");
	    palavra2 = input.next();

	    System.out.println(palavra1 +" - "+ palavra1.length ());
	    System.out.println(palavra2 +" - "+ palavra2.length ());

	    if(palavra1.equals(palavra2)){
	      System.out.print("As palavras são iguais");
	    }
	    else {
	      System.out.print("As palavras são diferentes");
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho