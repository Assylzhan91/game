package com.java.assyl.tictactoe.component;

import com.java.assyl.tictactoe.model.Cell;
import com.java.assyl.tictactoe.model.GameTable;

/**
 * @Assylzhan Baimuratov
 **/
public class CellVerifier {

    public boolean allCellsField(final GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                Cell cell = new Cell(i, j);
                if (gameTable.isEmpty(cell)) {
                    return false;
                }
             }
        }
        return true;
    }
}
