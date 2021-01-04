package com.gazzali.design.composite;

public class Main {

    public static void createHouse()
    {
        Shape triForRoof = new Triangle("Roof");
        Shape sqrForHouseBody = new Square("House Body");
        Shape smallsqrForWindows = new Square("Windows");

        System.out.println("\nx-x--x-xx--x-x-x-x-x-x-x-x-x-x-x--x-x-x--x-x--x");
        System.out.println("|chopping--planking--hammering---almost done--|");
        System.out.println("x-x--x-xx--x-x-x-x-x-x-x-x-x-x-x--x-x-x--x-x--x\n");

        Drawing houseDrawing = new Drawing();
        houseDrawing.add(triForRoof);
        houseDrawing.add(sqrForHouseBody);
        houseDrawing.add(smallsqrForWindows);

        houseDrawing.draw("House");

        //drawing.clear();

        endOFOneCreation();

    }

    public static void createTree()
    {
        Shape recForTrunk = new Rectangle("Trunk");
        Shape cirForCrown = new Circle("Crown");
        Shape triForLeaves = new Triangle("Leaves");

        System.out.println("\nx-x--x-xx--x-x-x-x-x-x-x-x-x-x-x--x-x-x--x-x--x");
        System.out.println("|seeding--planting--watering---almost grown--|");
        System.out.println("x-x--x-xx--x-x-x-x-x-x-x-x-x-x-x--x-x-x--x-x--x\n");

        Drawing treeDrawing = new Drawing();
        treeDrawing.add(recForTrunk);
        treeDrawing.add(cirForCrown);
        treeDrawing.add(triForLeaves);

        treeDrawing.draw("Tree");

        endOFOneCreation();
    }

    public static void createWaterSource()
    {
        Shape recForPipe = new Rectangle("Pipe");
        Shape cirForFarEnd = new Circle("Far-end pipe mouth");
        Shape cirForNearEnd = new Circle("Near-end pipe mouth");

        System.out.println("\nx-x--x-xx--x-x-x-x-x-x-x-x-x-x-x--x-x-x--x-x--xx-x---xx--x--x-");
        System.out.println("|rod cutting--joining pipe mouths--swelling---almost flowing--|");
        System.out.println("x-x--x-xx--x-x-x-x-x-x-x-x-x-x-x--x-x-x--x-x-x-x-x-x-x-x--x--x-\n");

        Drawing waterSourceDrawing = new Drawing();
        waterSourceDrawing.add(recForPipe);
        waterSourceDrawing.add((cirForFarEnd));
        waterSourceDrawing.add(cirForNearEnd);

        waterSourceDrawing.draw("Water Source Pipe");

        endOFOneCreation();
    }

    public static void endOFOneCreation()
    {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        createHouse();
        createTree();
        createWaterSource();
    }
}
