import java.util.Scanner;
class ex06 {
    public static void main (String args []) {

     double raio, area;
        
     System.out.println ("Informe o raio do círculo");
     Scanner teclado = new Scanner(System.in);
     raio = teclado.nextInt();
     teclado.close();
     area = 3.14*(raio*raio);
     System.out.println ("A área é " + area);
    }

}