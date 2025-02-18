import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        System.out.println("Guess the number I am thinking of! 1-100");
        Scanner input = new Scanner(System.in);

        // RNG
        Random random = new Random();
        int secret_number = random.nextInt(1, 100);

        boolean runningGame = true;
        while (runningGame) {
            System.out.println("Enter your guess: ");
            int number = input.nextInt();
            if (number > secret_number) {
                System.out.println("Guess lower!");
                runningGame = true;
            } else if (number < secret_number) {
                System.out.println("Guess higher!");
                runningGame = true;
            } else {
                System.out.println("You win!");
                System.exit(0);
                runningGame = false;
            }
        }
    }
}
