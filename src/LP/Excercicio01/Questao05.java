package LP.Excercicio01;

import java.util.Scanner;
import java.util.Random;

public class Questao05 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float espacoInicial, espacoFinal, velocidade, tempo;
    
	    System.out.print("Programa para calcular posição de um objeto movel pela formula S=So+v.t.");
	    System.out.print("\nS=So+v.t\nInsira o valor de So: ");
	    espacoInicial = INPUT.nextFloat();
	    System.out.print("S="+espacoInicial+"+v.t\nInsira o valor de v: ");
	    velocidade = INPUT.nextFloat();
	    System.out.print("S="+espacoInicial+"+"+velocidade+".t\nInsira o valor de t: ");
	    tempo = INPUT.nextFloat();
	    espacoFinal = espacoInicial+(tempo*velocidade);
	    System.out.print(espacoFinal+"="+espacoInicial+"+"+velocidade+"."+tempo);
	}
}
// Author : Ivanilso da Silva Conceição Filho