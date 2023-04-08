import java.util.Scanner;

class ex16{
  public static void main (String[] args) {

    float area, valor, litrosTinta, latasTinta;
    
    System.out.println ("Informe o tamanho em metros quadrados da área a ser pintada.");
    Scanner teclado = new Scanner (System.in);
    area = teclado.nextFloat ();
    teclado.close();
    litrosTinta = area/3;
    latasTinta = (int) Math.ceil (litrosTinta/18);
    
    valor = latasTinta*80;
    System.out.println ("A quantidade de latas necessária é "+latasTinta+" e o valor total é R$"+valor);
    
    
  }

}
  
  