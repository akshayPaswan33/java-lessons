package com.tackwit;

import com.tackwit.composition.*;

public class Application {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 440));

        MotherBoard motherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");

        PC pc = new PC(theCase,theMonitor,motherBoard);
        pc.getMonitor().drawPixelAt(1500,1200,"red");
        pc.getMotherBoard().loadProgram("Windows 1.0");
        pc.getTheCase().pressPowerButton();
    }
}
