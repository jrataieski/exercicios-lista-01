import java.util.Scanner;
import java.text.DecimalFormat;
class ex12{
    public static void main (String[]args){

        double altura,peso; 
        
        System.out.println ("Digite a sua altura");
        Scanner teclado = new Scanner(System.in);
        altura = teclado.nextDouble();
        teclado.close();
        peso = (72.7*altura)-58;
        DecimalFormat formatador = new DecimalFormat ("0.00");
        System.out.println ("Seu peso ideal é "+ formatador.format (peso));

    }
}