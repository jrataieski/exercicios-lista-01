import java.util.Scanner;
class ex11{
    public static void main (String [] args){

        int num1,num2,r1;
        float num3,r2,r3;

        // Faça um Programa que peça 2 números inteiros e um número real
        System.out.println ("Digite o primeiro número");
        Scanner teclado = new Scanner(System.in);
        num1 = teclado.nextInt();
        System.out.println ("Digite o segundo número");
        num2 = teclado.nextInt();
        System.out.println("Agora, digite um número com casas decimais");
        num3 = teclado.nextFloat();
        teclado.close();
        // O produto do dobro do primeiro com metade do segundo .
        r1 = num1*2*(num2/2);
        System.out.println ("O produto do dobro do primeiro com metade do segundo é "+r1);
        // A soma do triplo do primeiro com o terceiro.
        r2 = (num1*3)+num3;
        System.out.println("A soma do triplo do primeiro com o terceiro é "+r2);
        // O terceiro elevado ao cubo.
        r3 = num3*num3*num3;
        System.out.println("O terceiro elevado ao cubo é "+r3);

    }
}