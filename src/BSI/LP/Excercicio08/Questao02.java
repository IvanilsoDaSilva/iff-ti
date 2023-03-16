package BSI.LP.Excercicio08;

import java.util.Scanner;

class Questao2 {
  static char informarPositivoNegativo(double x) {
    if (x>0) {
      return 'P';
    }
    else 
      return 'N';
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double numero;

    System.out.print("Insira o valor: ");
    numero = input.nextFloat();

    System.out.print("Caracter: " + informarPositivoNegativo(numero));
  }
}