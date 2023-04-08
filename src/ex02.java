import java.util.Scanner;

class ex02 {
  public static void  main(String[] args) {

    int num;

    System.out.println ("Olá! Por favor, informe um número. ");
    Scanner teclado = new Scanner (System.in);
    num = teclado.nextInt();
    teclado.close();
    System.out.println ("O número informado foi " + num);
    
  }

}
  