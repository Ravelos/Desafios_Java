import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner reader = new Scanner(System.in);
        String sentence = reader.nextLine();
        String[] words = sentence.split("\\s+");
        
        char firstLetter = Character.toLowerCase(words[0].charAt(0));
        for(String word:words){
            if (Character.toLowerCase(word.charAt(0)) != firstLetter) {
                System.out.println("N");
            }else{
                System.out.println("Y");
            }
        }
    }

}
