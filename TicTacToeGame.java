package com.game;

import java.util.Scanner;

public class TicTacToeGame {
    public static char[] board;
    public static char playerLetter;
    public static char computerLetter;

    /*creating board to play game with empty spaces*/
    private static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
    /* method to select letter of your choice*/
    private static char chooseYourLetter() {
        Scanner scanner = new Scanner(System.in);
        char playerLetter = scanner.next().toUpperCase().charAt(0);
        if( playerLetter!='X' && playerLetter!='O') {
            System.out.print("Invalid Input Please enter O or X:");
            playerLetter = scanner.next().toUpperCase().charAt(0);
        }
        return playerLetter;
    }

    public static void main(String[] args) {
        char[] board = createBoard(); /*createBoard method will create board with empty spaces*/
        System.out.print("choose your letter(X or O):");
        playerLetter = chooseYourLetter(); /* selecting letter for player*/
        computerLetter = playerLetter == 'X' ? 'O' : 'X';/*if player has got X then computer will get O & vice-versa*/
    }
}