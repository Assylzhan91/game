package com.java.assyl.tictactoe;

import java.util.Random;
import java.util.Scanner;

/**
 * @Assylzhan Baimuratov
 **/
public class Game {
    void play() {
        System.out.println("Use following mapping table to specify a cell using numbers from 1 to 9");
        dataPrinter.printMappingTable();
        final GameTable gameTable = new GameTable();
        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
        }
        while (true) {
            userMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isUserWin()) {
                System.out.println("Congratulations! You won!");
                break;
            }
            if (drawVerifier.isDraw()) {
                System.out.println("Draw!");
                break;
            }

            computerMove.make();
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isComputerWin) {
                System.out.println("Computer won!");
                break;
            }
            if (drawVerifier.isDraw()) {
                System.out.println("Draw!");
                break;
            }
        }
        System.out.println("Game over!");
    }
}
