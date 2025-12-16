package com.java.assyl.tictactoe.component;

import com.java.assyl.tictactoe.model.GameTable;

import java.util.Random;

/**
 * @Assylzhan Baimuratov
 **/
public class Game {
    private final DataPrinter dataPrinter;
    private final ComputerMove computerMove;
    private final UserMove userMove;
    private final WinnerVerifier winnerVerifier;
    private final DrawVerifier drawVerifier;

    public Game(
            final DataPrinter dataPrinter,
            final ComputerMove computerMove,
            final UserMove userMove,
            final WinnerVerifier winnerVerifier,
            final DrawVerifier drawVerifier
    ) {
        this.dataPrinter = dataPrinter;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.winnerVerifier = winnerVerifier;
        this.drawVerifier = drawVerifier;
    }

    public void play() {
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

            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isComputerWin(gameTable)) {
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
