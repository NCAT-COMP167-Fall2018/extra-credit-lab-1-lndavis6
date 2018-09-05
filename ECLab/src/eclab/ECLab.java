/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclab;

import java.util.Random;

/**
 *
 * @author lndavis6
 */
public class ECLab {
    private static char[][] gameBoard;
    char currentPlayer;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        gameBoard = createBoard('b');
        playGame(gameBoard);
        printBoard();

    }
    private static char[][] createBoard(char startingCharacter){
        char [][] board = new char[6][7];
        for (int j = 0; j < board.length; j++){
            for (int o = 0; o < board[j].length; o++){
                board[j][o] = startingCharacter;
            }
        }
        return board;
    }
    private static void printBoard(){
        for(int i = 0; i < gameBoard.length; i++){
            System.out.print(" | ");
            for(int n = 0; n < gameBoard[i].length; n++){
                
                System.out.print(gameBoard[i][n]+" | ");
        }
            System.out.println("");
        }
    }
    private static void takeTurn(char currentPlayer){
        Random rand = new Random();
        int spot = rand.nextInt(7);
        int row = 5;
        while (gameBoard[row][spot] != 'b'){
            row = row - 1;
        }
        gameBoard[row][spot] = currentPlayer;
    }
    private static char playGame(char[][] gameBoard){
        char outcome = 't';
        int r = 0;
        char turn;
        while(r < 10){
            turn = 'y';
            takeTurn(turn);
            printBoard();
            System.out.println("");
            System.out.println("");
            turn = 'r';
            takeTurn(turn);
            printBoard();
            System.out.println("");
            System.out.println("");
            r++;
    }
        return outcome;
    }

}


