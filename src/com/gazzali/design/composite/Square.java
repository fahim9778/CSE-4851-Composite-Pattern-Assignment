package com.gazzali.design.composite;

public class Square implements Shape{
    public String structurePart;

    public Square (String structurePart)
    {
        this.structurePart = structurePart;
        System.out.println("gathering Square for " + structurePart + ".");
    }

    @Override
    public void draw(String creatingStructure) {
        System.out.println("created "+ structurePart + " with Square for "+ creatingStructure);
    }
}
