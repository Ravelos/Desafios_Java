package Challenges;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double valorInicial = scanner.nextDouble();


        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();
        int i;

        DecimalFormat df = new DecimalFormat("#.##");


        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        for(i = 0; i < periodo; i++){
            valorInicial += valorInicial * taxaJuros;
        }


        System.out.println("Valor final do investimento: R$ " + df.format(valorInicial));

        scanner.close();
    }
}
