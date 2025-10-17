import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args) {
        Random random=new Random();
        int number = random.nextInt(51); // Generates a random number between 0 and 50
        System.out.println(number); // You can remove this line to hide the answer

        Scanner sc = new Scanner(System.in);
        int count = 1;

        System.out.print("Enter the maximum number of chances: ");
        int max = sc.nextInt();

        while (count <= max) {
            System.out.print("Guess a number in the range 0 to 50: ");

            // Check if input is an integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next(); // Clear invalid input
                continue;
            }

            int guess = sc.nextInt();

            if (guess < 0 || guess > 50) {
                System.out.println("Please enter a number within the given range.");
                continue;
            }

            if (guess == number) {
                System.out.println("You guessed it right!!");
                System.out.println("You took " + count + " chances.");
                return; // End program once guessed correctly
            } else {
                System.out.println("Try again.");
                count++;
            }
        }

        System.out.println("You have exceeded the maximum number of chances.");
        sc.close();
    }
}
