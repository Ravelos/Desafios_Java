package Challenges;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Depositos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        double valor = scanner.nextDouble();
        double saldoAtualizado = 0.0;


        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            saldoAtualizado += valor;
            String saldoFormatado = f.format(saldoAtualizado);
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ "+ saldoFormatado);

        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Encerrando o programa...");
        } else {
            //TODO: Imprimir a mensagem de encerrar o programa.
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
        scanner.close();
    }
}
