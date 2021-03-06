package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // The goal of this project is to utilize the following concepts from previous classes:
        // 1. Loops
        // 2. Break and Continue
        // 3. Conditional Logic

        // You will have the program do the following:
        // 1. Generate a random number in a range. You may either ask the user for a limit, or create various modes.
        // 2. Let the user input a number
        // 3. If the number is correct, exit the program
        // 4. If the number is incorrect, tell the user if they were too high or to low, and repeat prompting

        // There isn't a need to do exception handling in this version, but you may implement "try" and "catch" blocks
        //   if you're feeling up to the challenge!

        // Here is the solution with the steps:

        // 1. Let's create some variables to hold relevant information
        int userGuess = 0; // to hold the users guess
        int correctAnswer = 0; // to hold the correct answer - we will generate in a minute
        int range = 10; // to hold the maximum value the random number can be
        int numberOfGuesses = 0; // to hold the number of guesses

        // 2. Let's get the prompts we need out of the way. This is just to make the code cleaner in the actual game below.
        String welcomeMessage = "------------------Number Guessing Game---------------------\n\n" +
                                "Welcome to the number guessing game!\n";
        String rangeMessage = "Please enter the maximum number to guess to:";
        String letsGoPrompt = "Great! Let's begin.\n-------------------------------------\n";
        String entryPrompt = "Please enter your guess:";
        String tooHighPrompt = "Your guess was too high. Please try again.\n";
        String tooLowPrompt = "Your guess was too low. Please try again.\n";
        String correctPrompt = "You got it! You're total guess count was: ";

        // Let's also create error messages too. We will use these when we get to exception handling.
        String invalidEntry = "Invalid entry. Please enter a positive whole number.";

        // 3. Lets create a Scanner object so we can take in user input from the command line
        Scanner scanner = new Scanner(System.in); // This is a new Scanner object with the name of "scanner".

        // 4. Let's print out the start of the program, and ask the user for a range
        System.out.println(welcomeMessage);
        System.out.println(rangeMessage);
        range = scanner.nextInt(); // grab entry and store in the "range" variable.

        // 5. Let's generate a random number by doing the following:
        //    a. using Math.random() to generate a double between 0.0 and 1.0
        //    b. multiplying that decimal by the users range value to get our number, but currently as decimal
        //    c. convert it to an integer and floor it to make it a whole number
        correctAnswer = (int)(Math.random() * range);

        System.out.println(letsGoPrompt);

        // 5. Now we start the infinite loop of the game.
        while(true){
            System.out.println(entryPrompt); // ask for number
            userGuess = scanner.nextInt(); // grab number and store

            // Lets set up the conditions
            if (userGuess == correctAnswer) { // if guess and answer match
                System.out.println(correctPrompt + numberOfGuesses); // print correct prompt
                break; // exit game
            } else if (userGuess > correctAnswer) { // if too high
                System.out.println(tooHighPrompt);
            } else if (userGuess < correctAnswer) { // if too low
                System.out.println(tooLowPrompt);
            }

            // if we have gotten to this point, the answer was incorrect (loop not broken out of), so let's increment the guessing counter.
            numberOfGuesses++;

        }
    }
}
