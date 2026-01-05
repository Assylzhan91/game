package com.java.assyl.tictactoe.component;

import com.java.assyl.tictactoe.model.Cell;
import java.util.Random;
import com.java.assyl.tictactoe.model.GameTable;

/**
 * @Assylzhan Baimuratov
 **/
public class ComputerMove {
    public void make(final GameTable gameTable) {
        final Random random = new Random();
       while (true) {
           final int row  = random.nextInt(3);
           final int col  = random.nextInt(3);
           final Cell randomCell = new Cell(row, col);
           if (gameTable.isEmpty(randomCell)) {
               gameTable.setSign(randomCell, 'O');
               return;
           }
       }
    }
}
