package com.java.assyl.tictactoe.component;

import com.java.assyl.tictactoe.model.GameTable;

/**
 * @Assylzhan Baimuratov
 **/
public class DataPrinter implements Printer {

    @Override
    public void printMappingTable() {
        System.out.println("printMappingTable");
    }

    public void printGameTable(final GameTable gameTable) {

    }
}


interface Printer {
    void printMappingTable();
}