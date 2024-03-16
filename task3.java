import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly.");
                System.out.println("You took " + attempts + " attempts.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
