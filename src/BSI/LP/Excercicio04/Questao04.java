package BSI.LP.Excercicio04;

import java.util.Scanner;
import java.util.Random;

public class Questao04 {
	public static void main(String[] args) {
		int contador;
	    double somaDaAlturaHomens=0, somaDaAlturaMulheres=0, menorAltura=1000.0, maiorAltura=0, altura, contadorDeMulheres=0, contadorDeHomens=0;
	    char sexo;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Programa para obter 50 fichas.\n");
	    for (contador = 1; contador <= 3; contador++) {
	      System.out.print("Insira o sexo: ");
	      sexo = input.next().charAt(0);
	      System.out.print("Insira a altura: ");
	      altura = input.nextFloat();

	      if (maiorAltura<altura){
	        maiorAltura = altura;
	      }
	      if (menorAltura>altura){
	        menorAltura = altura;
	      }
	      
	      switch (sexo){
	        case 'm':
	        case 'M' : 
	          contadorDeHomens++;
	          somaDaAlturaHomens = somaDaAlturaHomens + altura;
	          break;
	        case 'f':
	        case 'F' : 
	          contadorDeMulheres++;
	          somaDaAlturaMulheres = somaDaAlturaMulheres + altura;
	          break;
	        default: 
	          System.out.print("Erro! sexo inválido...");
	      }
	    }
	    System.out.println("Menor altura: "+menorAltura);
	    System.out.println("Maior altura: "+maiorAltura);
	    System.out.println("Media da altura das alunas: "+somaDaAlturaMulheres/contadorDeMulheres);
	    System.out.println("Media da altura da turma: "+(somaDaAlturaHomens+somaDaAlturaMulheres)/3);
	}
}
// Author : Ivanilso da Silva Conceição Filho