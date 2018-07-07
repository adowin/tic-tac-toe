/*
* Copyright 2018 adowin
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
* documentation files (the "Software"), to deal in the Software without restriction, including without limitation
* the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
* and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all copies or substantial portions
* of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
* TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
* THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
* CONTRACT,TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
* DEALINGS IN THE SOFTWARE.
*
*/
package com.game.tictactoe;

import java.util.Scanner;

/**
 * This class provides an entry point for the Tick Tac Toe game.
 */
public final class TicTacToe {

    /**
     * Program main
     */
    public static void main(final String[] args){

        final TicTacToe ttt = new TicTacToe();
        ttt.printMainMenu();

        // Initialize a scanner for user input
        final Scanner consoleScanner = new Scanner(System.in);
        String userInput = "";

        // After printing the main menu, prompt the user for choice.
        // Always get input as String and sanatize later
        userInput = consoleScanner.nextLine();

        // TODO: implement main menu logic
        // Parse user choice, exit on a 0, printGameMenu on a 1

    }

    /**
     * Prints the main game menu prompting the user to play or quit
     */
    public void printMainMenu() {

        System.out.println("\n\t Welcome to the game!");

        this.printMenuDivider();

        System.out.println("\n\t 1. Play new game");
        System.out.println("\t 0. Quit\n");
        System.out.print("\t Choice?: "); // No new line for user input
    }

    /**
     * Prints the gameplay sub menu prompting the user for the players
     */
    public void printGameMenu() {

        this.printMenuDivider();        
        System.out.println("\n\t How many players?");
        System.out.println("\n\t 0: AI vs AI");
        System.out.println("\t 1: AI vs Human");
        System.out.println("\t 2: Human vs Human");
    }

    /**
     * A helper method for printing divider lines between game menus
     */
    public void printMenuDivider() {
        System.out.println("\t----------------------");
    }
}