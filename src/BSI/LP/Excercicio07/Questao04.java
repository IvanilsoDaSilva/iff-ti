package BSI.LP.Excercicio07;

import java.util.Scanner;
import java.util.Random;

public class Questao04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int i=2, j=3;
	    double matriz[][] = new double[i][j], maiorAltura[] = new double[i];
	    
	    for(i=0;i<2;i++) {
	      for(j=0;j<3;j++) {
	        System.out.print("Altura dos jogadores da delegação"+i+": ");
	        matriz[i][j]=input.nextFloat();
	      }
	    }

	    for(i=0;i<2;i++) {
	      maiorAltura[i] = 0.0;
	      for(j=0;j<3;j++) {
	        if(matriz[i][j]>maiorAltura[i]){
	          maiorAltura[i] = matriz[i][j];
	        }
	      }
	    }
	    for(i=0;i<2;i++) {
	      for(j=0;j<3;j++) {
	        if(matriz[i][j]==maiorAltura[i]){
	          System.out.print("\n Delegação"+i+" Posicao"+j+": "+ maiorAltura[i]);
	        }
	      }
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho