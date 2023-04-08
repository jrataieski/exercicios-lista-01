import java.util.Scanner;
import java.text.DecimalFormat;

public class ex15 {
    public static void main (String [] args){

        double valorHora, horasMes, salarioBruto, salarioLiq, IR, INSS, sindicato;

        System.out.println ("Informe o valor que você ganha por hora trabalhada");
        Scanner teclado = new Scanner (System.in);
        valorHora = teclado.nextDouble();
        System.out.println ("Informe o número de horas trabalhadas no mês");
        horasMes = teclado.nextDouble();
        teclado.close();
        salarioBruto = valorHora*horasMes;
        IR = salarioBruto*0.11;
        INSS = salarioBruto*0.08;
        sindicato = salarioBruto*0.05;
        salarioLiq = salarioBruto - IR - INSS - sindicato;
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println ("Salário Bruto: R$"+formatador.format(salarioBruto)+"\nIR (11%): R$"+formatador.format(IR)+"\nINSS(8%): R$"+formatador.format(INSS)+"\nSindicato(5%): R$"+formatador.format(sindicato)+"\nSalário Liquido: R$"+formatador.format(salarioLiq));
       
    }
}
