import java.util.Scanner;

class ex05 {
  public static void  main(String[] args) {

    int metro, resultado;
    System.out.println ("Olá! Por favor, digite a metragem que deseja converter. ");
    Scanner teclado = new Scanner (System.in);
    metro = teclado.nextInt();
    teclado.close();
    resultado = metro*100;
    System.out.println (resultado + "cm");

  }

}
    