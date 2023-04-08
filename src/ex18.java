import java.util.Scanner;
public class ex18 {
    public static void main (String [] args){  

        double tamanhoArquivo, velocidade, tempoDownload, minutos;

        System.out.println("Informe o tamanho do arquivo para download em MB");
        Scanner teclado = new Scanner (System.in);
        tamanhoArquivo = teclado.nextDouble();

        System.out.println ("Informe a velocidade do link em Mbps");
        velocidade = teclado.nextDouble();
        teclado.close();

        tempoDownload = tamanhoArquivo/velocidade;
        minutos = (int) Math.ceil (tempoDownload/60);

        System.out.println ("O tempo aproximado para ficar pronto é "+minutos+" minutos");
        
    }
    
}
