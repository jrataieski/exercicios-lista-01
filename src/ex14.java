import java.util.Scanner;

public class ex14 {
    public static void main (String[] agrs){

        double peso;

        System.out.println ("Insira o peso dos peixes");
        Scanner teclado = new Scanner (System.in);
        peso = teclado.nextDouble();
        teclado.close();
        if (peso > 50){
            double excesso = peso - 50;
            double multa = 4*excesso;
            System.out.println ("Quantidade excedente " + excesso + "kg e valor de multa R$" + multa);
        }
        else{
            System.out.println ("Não há valor de multa"); 
        }
    } 
}

