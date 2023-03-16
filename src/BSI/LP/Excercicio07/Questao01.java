package BSI.LP.Excercicio07;

import java.util.Scanner;
import java.util.Random;

public class Questao01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int i = 5, j = 3, A[][] = new int[i][j], B[][] = new int[i][j], C[][] = new int[i][j];

	    // for(i=0;i<5;i++){
	    // for(j=0;j<3;j++){1
	    // System.out.print("Insira o valor na posição["+i+"]["+j+"]");
	    // }
	    // }

	    for (i = 0; i < 5; i++) {
	      for (j = 0; j < 3; j++) {
	        System.out.print("Insira o valor do array A na posição[" + i + "][" + j + "]: ");
	        A[i][j] = input.nextInt();
	        System.out.print("Insira o valor do array B na posição[" + i + "][" + j + "]: ");
	        B[i][j] = input.nextInt();
	        C[i][j] = A[i][j] + B[i][j];
	      }
	    }

	    for (i = 0; i < 5; i++) {
	      for (j = 0; j < 3; j++) {
	        System.out.print("\nPosição [" + i + "][" + j + "]" + C[i][j] + ": ");
	      }
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho