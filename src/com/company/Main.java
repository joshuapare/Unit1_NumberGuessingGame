package com.company;

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
        int userGuess = 0; // to hold the users guess, 0 to start
        int correctAnswer = 0; // to hold the correct answer - we will generate in a minute
        int range = 10; // to hold the maximum value the random number can be
        int numberOfGuesses = 0; // to hold the number of guesses

        // 2. Let's get the prompts we need out of the way
        String welcomeMessage = "------------------Number Guessing Game---------------------\n\n" +
                                "Welcome to the number guessing game!\n";
        String rangeMessage = "Please enter the maximum number to guess to:";
        String tooHighPrompt = "Your guess was too high. Please try again.\n";
        String tooLowPrompt = "Your guess was too low. Please try again.\n";
        String correctPrompt = "You got it! Great work.\n";

        // 3. Lets start the program! First, we need to create an infinite loop. We will use breaks and continues
        //    to exit or continue on in the loop

        while(true){



        }




    }
}
