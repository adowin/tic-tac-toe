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

/**
 * This class provides an entry point for the Tick Tac Toe game.
 */
public class TicTacToe {

    /**
     * Program main
     */
    public static void main(final String[] args){
        System.out.println("Tic Tac Toe!");

        TicTacToe ttt = new TicTacToe();
        ttt.printMenu();
    }

    /**
     * A method that prints the menu
     */
    public void printMenu() {

        System.out.println("\t\t Welcome to the game!");

        System.out.println("\t\t----------------------");

        System.out.println("\n\t\t How many players?");
        System.out.println("\n\t\t 0: AI vs AI");
        System.out.println("\t\t 1: AI vs Human");
        System.out.println("\t\t 2: Human vs Human");
    }
}