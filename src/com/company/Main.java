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

        GuessingGameV1 game1 = new GuessingGameV1();
        game1.runGameV1();

    }
}
