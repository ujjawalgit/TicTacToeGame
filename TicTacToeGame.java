package com.game;

public class TicTacToeGame {
    public static char[] board;

    /*creating board  with empty spaces*/
    private static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToeGame");
        /*createBoard method will create board with empty spaces*/
        board = createBoard();
    }
}