import java.util.Scanner;

class ex08 {
  public static void main(String[] args) {

    float valorHora, valorMensal, horas;
    
    System.out.println ("Olá! Qual o valor que você ganha por hora trabalhada?");
    Scanner teclado = new Scanner (System.in);
    valorHora = teclado.nextFloat();
    System.out.println ("E qual é o número de horas trabalhas no mês?");
    horas = teclado.nextFloat ();
    teclado.close();
    valorMensal = valorHora*horas;
    System.out.println ("O total do seu salário no mês foi de R$"+valorMensal);
    
  }

}