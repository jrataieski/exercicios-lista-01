import java.util.Scanner;

public class ex17 {
    public static void main (String[] args){

        double area, valorLata, valorGalao, valorMistura, litrosTinta, latasTinta, galoes, litrosFaltantes, latasTintaMistura, galoesMistura, litrosTintaMistura;

        System.out.println ("Informe o tamanho em metros quadrados da área a ser pintada.");
        Scanner teclado = new Scanner (System.in);
        area = teclado.nextDouble();
        teclado.close();
        litrosTinta = area/6;
        
        latasTinta = (int) Math.ceil(litrosTinta/18);
        galoes = (int) Math.ceil(litrosTinta/3.6);

        valorLata = latasTinta*80;
        valorGalao = galoes*25;

        litrosTintaMistura = litrosTinta*1.1;
        latasTintaMistura = (int)litrosTintaMistura/18;
        litrosFaltantes = litrosTintaMistura -(latasTintaMistura * 18);
        galoesMistura = (int) Math.ceil (litrosFaltantes/3.6);
        valorMistura = (latasTintaMistura*80)+(galoesMistura*25);

        System.out.println ("Caso você opte por comprar apenas em latas, a quantidade de latas deve ser "+latasTinta+" e o valor é R$"+valorLata+"\nCaso você opte por comprar em galões, a quantidade de galões deve ser "+galoes+" e o valor é R$"+valorGalao+"\nCaso você opte por misturar latas e galões, a quantidade de latas deve ser "+latasTintaMistura+", a quantidade de galões deve ser "+galoesMistura+" e o valor será R$"+valorMistura);

    }
    
}
