
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args)  {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter the length of the array:");
            int length = reader.nextInt();
            reader.nextLine();

            List<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                System.out.println("Enter the number " + (i + 1) + ":");
                int number = reader.nextInt();
                reader.nextLine();
                numberList.add(number);

                if (number < 0 && number % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else if (number < 0 && number % 2 != 0) {
                    System.out.println("ODD NEGATIVE");
                } else if (number > 0 && number % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else if (number > 0 && number % 2 != 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("NULL");
                }
            }
        }
    }
