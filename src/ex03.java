import java.util.Scanner;  
 class ex03 {
    public static void main (String[] args) {
        
        int num1, num2, soma;

        System.out.println ("Digite o primeiro número");
        Scanner teclado = new Scanner (System.in);
        num1 = teclado.nextInt();
        System.out.println ("Digite o segundo número");
        num2 = teclado.nextInt();
        teclado.close();
        soma = num1 +num2;
        System.out.println ("A soma é " + soma);

    }
}