package LP.Excercicio08;

import java.util.Scanner;

class Questao1 {
  static double somar(double x, double y, double z) {
    return x * y * z;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double primeiroNumero, segundoNumero, terceiroNumero;

    System.out.print("Insira o primeiro valor: ");
    primeiroNumero = input.nextFloat();
    System.out.print("Insira o segundo valor: ");
    segundoNumero = input.nextFloat();
    System.out.print("Insira o terceiro valor: ");
    terceiroNumero = input.nextFloat();

    System.out.print("Valor da soma: " + somar(primeiroNumero, segundoNumero, terceiroNumero));
  }
}