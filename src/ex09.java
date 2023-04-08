import java.util.Scanner;
import java.text.DecimalFormat;

class ex09 {
  public static void main(String[] args ){

    double tempF, tempC;

    System.out.println ("Informe a temperatura em graus Fahrenheit que deseja converter para Celsius.");
    Scanner teclado = new Scanner (System.in);
    tempF = teclado.nextDouble();
    teclado.close();
    tempC = 5 * ((tempF-32) / 9);
    DecimalFormat formatador = new DecimalFormat("0.0");
    System.out.println ("A temperatura em graus Celsius é " + formatador.format (tempC));
  }
 
}