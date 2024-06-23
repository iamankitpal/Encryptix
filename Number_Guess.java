
import java.util.Random;

import java.util.Scanner;
class Number_Guess {

    public static void main(String[] args) {

        int answer, guess;

        final int MAX = 100;

        final int ATTEMPTS = 10;

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        answer = rand.nextInt(MAX) + 1;

        System.out.println("Guess a number between 1 and 100 ");

        System.out.println("You have 10 guesses");

        boolean correct = false;

        int attemptsLeft = ATTEMPTS;

        while (!correct && attemptsLeft > 0) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attemptsLeft--;

            if (guess > answer) {

                System.out.println("It is smaller than: " + guess);

                System.out.println("You have " + attemptsLeft + " guesses left");
            }
            else if (guess < answer) {

                System.out.println("It is larger than: " + guess);

                System.out.println("You have " + attemptsLeft + " guesses left");
            }
            else {

                System.out.println("Yes, you guessed the number!");

                correct = true;
            }

            if (attemptsLeft == 0 && !correct) {
                System.out.println("You've used all your guesses. The correct number was: " + answer);
            }
        }

        sc.close();
    }
}