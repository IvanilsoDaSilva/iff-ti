package BSI.LP.Excercicio04;

import java.util.Scanner;
import java.util.Random;

public class Questao06 {
	public static void main(String[] args) {
		int opcao;
	    double aux1,aux2;
	    Scanner input = new Scanner(System.in);
	    Random random = new Random();
	    System.out.print("\nPrograma para calcular área de uma figura plana.");
	    System.out.print("\n-------------\n|1 - Quadrado|\n|2 - Retângulo|\n|3 - Triângulo   |\n|4 - Circulo |\n|5 - Sair    |\n-------------\n");
	    System.out.print("Insira a opção: ");
	    opcao = input.nextInt();
	    while(opcao!=5){
	      if (random.nextInt(2)==1) {
	        switch(opcao){
	          case 1: 
	            System.out.print("\nInsira o lado do quadrado: ");
	            aux1 = input.nextFloat();
	            System.out.print("\nÁrea do quadrado: "+aux1*aux1);
	            break;
	          case 2: 
	            System.out.print("\nInsira o primeiro lado do retângulo: ");
	            aux1 = input.nextFloat();
	            System.out.print("\nInsira o segundo lado do retângulo: ");
	            aux2 = input.nextFloat();
	            System.out.print("\nÁrea do quadrado: "+(aux1*aux2));
	            break;
	          case 3: 
	            System.out.print("\nInsira a base do triangulo: ");
	            aux1 = input.nextFloat();
	            System.out.print("\nInsira a altura do triangulo: ");
	            aux2 = input.nextFloat();
	            System.out.print("\nÁrea do quadrado: "+((aux1*aux2)/2));
	            break;
	          case 4: 
	            System.out.print("\nInsira o raio do circulo: ");
	            aux1 = input.nextFloat();
	            System.out.print("\nÁrea do quadrado: "+(aux1*aux1*Math.PI));
	            break;
	          default:
	            System.out.print("\nErro! Opção inválida.");
	        }
	      }
	      else {
	        if (opcao==1){
	          System.out.print("\nInsira o lado do quadrado: ");
	          aux1 = input.nextFloat();
	          System.out.print("\nÁrea do quadrado: "+aux1*aux1);
	        }
	        else{
	          if (opcao==2) {
	            System.out.print("\nInsira o primeiro lado do retângulo: ");
	            aux1 = input.nextFloat();
	            System.out.print("\nInsira o segundo lado do retângulo: ");
	            aux2 = input.nextFloat();
	            System.out.print("\nÁrea do quadrado: "+(aux1*aux2));
	          }
	          else {
	            if (opcao==3) {
	              System.out.print("\nInsira a base do triangulo: ");
	              aux1 = input.nextFloat();
	              System.out.print("\nInsira a altura do triangulo: ");
	              aux2 = input.nextFloat();
	              System.out.print("\nÁrea do quadrado: "+((aux1*aux2)/2));
	            }
	            else{
	              if (opcao==4) {
	                System.out.print("\nInsira a base do triangulo: ");
	                aux1 = input.nextFloat();
	                System.out.print("\nInsira a altura do triangulo: ");
	                aux2 = input.nextFloat();
	                System.out.print("\nÁrea do quadrado: "+((aux1*aux2)/2));
	              }
	              else {
	                System.out.print("\nErro! Opção inválida.");
	              }
	            }
	          }
	        }
	      }
	      System.out.print("\nPrograma para calcular área de uma figura plana.");
	      System.out.print("\n-------------\n|1 - Quadrado|\n|2 - Retângulo|\n|3 - Triângulo   |\n|4 - Circulo |\n|5 - Sair    |\n-------------\n");
	      System.out.print("Insira a opção: ");
	      opcao = input.nextInt();
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho