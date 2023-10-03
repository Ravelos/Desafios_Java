package Challenges;

import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }

    @Override
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
    }

    public void abrirCofre(int senhaDigital){
        if(validarSenha(senhaDigital)){
            System.out.println("Cofre aberto!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
    }
}

public class DesafioCofres {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();
        Cofre cofre = null;

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            int confirmarSenha = scanner.nextInt();
            cofre = new CofreDigital(senha);
            cofre.imprimirInformacoes();
            ((CofreDigital)cofre).abrirCofre(confirmarSenha);
        }else{
            cofre = new CofreFisico();
            cofre.imprimirInformacoes();
        }
    }
}