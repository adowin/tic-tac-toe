/*
* Copyright 2018 cdowin
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
 * Holds the 2D gameboard for the Tic Tac Toe game.
 */
public class GameBoard {

    private static final int BOARD_SIZE = 3;
    private final char[][] board;

    /**
     * Constructor
     */
    GameBoard() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
    }

    public char[][] getGameBoard() {
        // TODO: Should we return a copy of the board to prevent an outside class from modification?
        return board;
    }

    public boolean takeMove(final boolean isX, final int xCoord, final int yCoord) {
        boolean isValidMove = false;

        // TODO: Perform logic for taking a move and checking validity

        return isValidMove;
    }

    /**
     * Print the current gameboard representation to the system's standard out
     */
    public void printGameBoard() {
        // TODO: implement
    }
}