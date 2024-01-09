import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    
     private static final Scanner reader = new Scanner(System.in);
 
    public static void main(String[] args) throws IOException {
 
         Map<Integer, String> cidades = new HashMap<Integer, String>();

        cidades.put( 11, new String("Sao Paulo"));
        cidades.put(61, new String("Brasilia"));
        cidades.put(19, new String("Campinas"));
        cidades.put(31, new String("Belo Horizonte"));
        cidades.put(32, new String("Juiz de Fora"));
        cidades.put(27, new String("Vitoria"));
        cidades.put(71, new String("Salvador"));
        cidades.put(21, new String("Rio de Janeiro"));

        Integer keyToSearch = reader.nextInt();


        if ( cidades.containsKey( keyToSearch ) ) {
            System.out.println(cidades.get(keyToSearch));
        }else{
            System.out.println("DDD nao cadastrado");
        }
 
  }
}
