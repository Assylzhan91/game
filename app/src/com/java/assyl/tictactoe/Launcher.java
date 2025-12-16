package com.java.assyl.tictactoe;

import com.java.assyl.tictactoe.component.*;

/**
 * @Assylzhan Baimuratov
 **/
public final class Launcher {
    public  static void main(final String[] args) {
        final Game game = new Game(
                new DataPrinter(),
                new ComputerMove(),
                new UserMove(),
                new WinnerVerifier(),
                new DrawVerifier()
        );
        game.play();
    }
}
