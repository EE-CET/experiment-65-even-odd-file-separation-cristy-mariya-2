import java.io.*;
import java.util.*;

public class FileSeparator {
    public static void main(String[] args) {
        try {
            File inputFile = new File("numbers.txt");
            Scanner sc = new Scanner(inputFile);

            PrintWriter evenWriter = new PrintWriter("even.txt");
            PrintWriter oddWriter = new PrintWriter("odd.txt");

            // Separate numbers
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    evenWriter.print(num + " ");
                } else {
                    oddWriter.print(num + " ");
                }
            }

            sc.close();
            evenWriter.close();
            oddWriter.close();

            // Read even.txt
            Scanner evenReader = new Scanner(new File("even.txt"));
            System.out.print("Even File: ");
            while (evenReader.hasNextInt()) {
                int num = evenReader.nextInt();
                System.out.print(num);
                if (evenReader.hasNextInt()) {
                    System.out.print(" ");
                }
            }
            evenReader.close();

            System.out.println();

            // Read odd.txt
            Scanner oddReader = new Scanner(new File("odd.txt"));
            System.out.print("Odd File: ");
            while (oddReader.hasNextInt()) {
                int num = oddReader.nextInt();
                System.out.print(num);
                if (oddReader.hasNextInt()) {
                    System.out.print(" ");
                }
            }
            oddReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
