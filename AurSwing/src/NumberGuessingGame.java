//Question No:2

import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100)+1;

        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        do{
            System.out.print("Enter the Guess Number: ");
            guess = scanner.nextInt();

            if(guess>randomNumber){
                System.out.println("Too high, try again.");
            }else if(guess<randomNumber){
                System.out.println("Too low, try again.");
            }else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }while(guess != randomNumber);
    }
}
