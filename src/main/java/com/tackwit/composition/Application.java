package com.tackwit.composition;

public class Application {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 440));

        MotherBoard motherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");

        PC pc = new PC(theCase,theMonitor,motherBoard);
        pc.powerUp();
    }
}
