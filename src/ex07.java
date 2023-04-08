 import java.util.Scanner;
 class ex07 {
    public static void main (String[] args){

        float area, dobro;
        System.out.println ("Digite uma medida do quadrado");
        Scanner teclado = new Scanner (System.in);
        area = teclado.nextInt();
        teclado.close();    
        area = area*area;
        dobro = area*2;
        System.out.println ("O dobro desta área é " + dobro);


    }
}