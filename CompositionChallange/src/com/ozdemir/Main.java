package com.ozdemir;

public class Main {

    public static void main(String[] args) {
	    Wall wall1 = new Wall("West");
	    Wall wall2 = new Wall("East");
	    Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(250, 23);
        Bed bed = new Bed("Modern",2,30,1,4);
        Lamp lamp = new Lamp("Modern",false,5);

        Bedroom bedRoom = new Bedroom("Wintage",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
