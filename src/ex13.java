import java.util.Scanner;
class ex13 {
    public static void main (String[]args){

        double h,peso = 0;
        char sexo;
        
        System.out.println ("Informe a sua altura");
        Scanner teclado = new Scanner (System.in);
        h = teclado.nextDouble();
        System.out.println ("Informe seu sexo, sendo H para homem e M para mulher.");
        sexo = teclado.next().charAt(0);
        teclado.close();    
         //Para homens: (72.7*h) - 58   
        if (sexo == 'H'){
            peso = (72.7*h) - 58;
        }
        //Para mulheres: (62.1*h) - 44.7
        else if (sexo == 'M'){
            peso = (62.1*h) - 44.7;
        }
        System.out.println("Seu peso ideal é "+peso);
    }

}
