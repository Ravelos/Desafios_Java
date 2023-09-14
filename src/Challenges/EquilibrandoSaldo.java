package Challenges;

import java.util.Scanner;
import java.text.DecimalFormat;
public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();
        DecimalFormat format = new DecimalFormat("0.0");

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        double saldoAtualizado = (saldoAtual + valorDeposito) - valorRetirada;
        String saldoFormatado = format.format(saldoAtualizado);

        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println("Saldo atualizado na conta: " + saldoFormatado);
    }
}
