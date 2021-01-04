package com.gazzali.design.composite;

public class Circle implements Shape{
    public String structurePart;

    public Circle (String structurePart)
    {
        this.structurePart = structurePart;
        System.out.println("gathering Circle for " + structurePart + ".");
    }

    @Override
    public void draw(String creatingStructure) {
        System.out.println("created "+ structurePart + " with Circle for "+ creatingStructure);
    }
}
