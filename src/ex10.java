import java.util.Scanner;
import java.text.DecimalFormat;

public class ex10 {
    public static void main (String [] agrs){     

        double tempC, tempF;

    System.out.println ("Informe a temperatura em graus Celsius que deseja converter para Fahrenheit.");
    Scanner teclado = new Scanner (System.in);
    tempC = teclado.nextDouble();
    teclado.close();
    tempF = (tempC*1.8) + 32;
    DecimalFormat formatador = new DecimalFormat("0.0");
    System.out.println ("A temperatura em graus Fahrenheit é " + formatador.format (tempF));





    }

    
}
