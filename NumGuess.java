import java.util.Random;
import java.util.Scanner;

class NumGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(100) + 1;
        int tryc=0;
        while (true) {
            System.out.print("Enter the guess(1-100): ");
            Scanner sc = new Scanner(System.in);
            int playguess = sc.nextInt();
            tryc++;
            if (playguess == random) {
                System.out.println("Correct! You Win!");
                System.out.println("It took you " +tryc+ " tries!");
                break;
            } else if (random > playguess) {
                System.out.println("Nope! The number is higher. Guess again.");
            } else {
                System.out.println("Nope! The number is lower. Guess again.");
            }
        }
    }
}
