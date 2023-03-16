package BSI.LP.Excercicio07;

import java.util.Scanner;
import java.util.Random;

public class Questao05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int i=4, j=5, k=2;
	    double matriz[][][] = new double[i][j][k];
	    
	    for(i=0;i<4;i++) {
	      for(j=0;j<5;j++) {
	        for(k=0;k<2;k++) {
	          System.out.print("Insira o valor: ");
	          matriz[i][j][k]=input.nextFloat();
	        }
	      }
	    }

	    for(i=0;i<4;i++) {
	      for(j=0;j<5;j++) {
	        for(k=0;k<2;k++) {
	          System.out.printf("\nValor[%d][%d][%d]: %f",i,j,k,matriz[i][j][k]);
	        }
	      }
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho