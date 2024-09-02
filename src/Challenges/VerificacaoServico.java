import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        scanner.close();
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        String resultado = verifyServices(servico, entradaCliente);
        
        System.out.println(resultado);
    
    }
    
    public static String verifyServices(String serviceToVerify, String hiredServices) {
          return hiredServices.contains(serviceToVerify) ? "Sim" : "Nao";
    }
}
