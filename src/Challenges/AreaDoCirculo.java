import java.io.IOException;
import java.util.Locale;
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
 
      


        double pi = 3.14159;
        double R = reader.nextDouble();
        double A = pi * Math.pow(R,2);

        var resultado = String.format(Locale.US,"%.4f", A);

        System.out.println("A=" + resultado);
    }
 
}
