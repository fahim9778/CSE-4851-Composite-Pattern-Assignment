package com.gazzali.design.composite;

public class Triangle implements Shape {
    public String structurePart;

    public Triangle (String structurePart)
    {
        this.structurePart = structurePart;
        System.out.println("gathering Triangle for " + structurePart + ".");
    }

    @Override
    public void draw(String creatingStructure) {
        System.out.println("created "+ structurePart + " with Triangle for "+ creatingStructure);
    }

}
