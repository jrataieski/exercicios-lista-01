import java.util.Scanner;

class ex04 {
  public static void main(String[] args) {

    float nota1, nota2, nota3, nota4, soma, media;
    
    System.out.println ("Digite o valor da nota um: ");
    Scanner teclado = new Scanner (System.in);
    nota1 = teclado.nextFloat();
    System.out.println ("Digite o valor da nota dois: ");
    nota2 = teclado.nextFloat();
    System.out.println ("Digite o valor da nota três: ");
    nota3 = teclado.nextFloat ();
    System.out.println ("Digite o valor da nota quatro: ");
    nota4 = teclado.nextFloat ();
    teclado.close();
    soma = nota1+nota2+nota3+nota4;
    media = soma/4;
    System.out.println ("A soma total das notas é "+soma+" e a sua média é "+media);
    
  }

}