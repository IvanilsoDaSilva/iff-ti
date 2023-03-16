package BSI.LP.Excercicio07;

import java.util.Scanner;
import java.util.Random;

public class Questao02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int i = 7, A[] = new int[i], B[] = new int[i], C[][] = new int[i][2];
	    
	    for (i = 0; i < 7; i++) {
	      System.out.print("Insira o valor do array A na posição[" + i + "]: ");
	      A[i] = input.nextInt();
	      System.out.print("Insira o valor do array B na posição[" + i + "]: ");
	      B[i] = input.nextInt();
	    }
	    
	    for(i=0;i<7;i++) {
	      C[i][0] = A[i];
	      C[i][1] = B[i];
	        
	      System.out.print("\nPosicao ["+i+"][0]: "+C[i][0]+" Posicao ["+i+"][1]: "+C[i][0]);
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho