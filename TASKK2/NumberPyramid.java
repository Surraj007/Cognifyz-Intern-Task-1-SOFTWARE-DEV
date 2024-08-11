import java.util.Random;
import java.util.Scanner;
public class NumberPyramid {

    public static void main(String[] args) {
        // Define the height of the pyramid
        int height = 5;

        // Step 2: Generate the pyramid pattern
        for (int i = 1; i <= height; i++) {
            // Step 3: Print spaces for left padding
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            // Print the numbers in the pyramid
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
