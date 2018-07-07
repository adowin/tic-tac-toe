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

    /**
     * The size of a standard Tic Tac Toe board - 3x3
     */
    private static final int BOARD_SIZE = 3;

    /**
     * The game board representation
     */
    private final char[][] board;

    /**
     * The number of turns taken in this game. X starts first (0).
     */
    private int turnNumber;

    /**
     * Constructor
     */
    GameBoard() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        turnNumber = 0;
    }

    /**
     * Gets the current game board. This method only returns a COPY of the game board.
     * Modifications to the current board must be made through the @takeMove() method.
     * 
     * @return a copy of the current game board
     */
    public char[][] getGameBoard() {

        final char[][] copiedBoard = new char[BOARD_SIZE][BOARD_SIZE];

        // Copy the other board into this board
        for(int i = 0; i < GameBoard.BOARD_SIZE; i++) {
            for(int j = 0; j < GameBoard.BOARD_SIZE; j++) {
                copiedBoard[i][j] = this.board[i][j];
            }
        }

        return copiedBoard;
    }

    /**
     * A method for allowing a player to take a move on the current board.
     * 
     * @param xCoord The X position (in x,y) where the player would like to take a move
     * @param yCoord the Y position (in x,y) where the player would like to take a move
     * 
     * @return whether or not the move was successful
     */
    public boolean takeMove(final int xCoord, final int yCoord) {
        boolean isValidMove = false;

        // TODO: Perform logic for taking a move and checking validity
        // Check on the turnNumber counter to determine if the move is for X or O

        return isValidMove;
    }

    /**
     * Print the current gameboard representation to the system's standard out
     */
    public void printGameBoard() {
        // TODO: implement
    }
}