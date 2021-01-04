package com.gazzali.design.composite;

public class Rectangle implements Shape{
    public String structurePart;

    public Rectangle (String structurePart)
    {
        this.structurePart = structurePart;
        System.out.println("gathering Rectangle for " + structurePart + ".");
    }

    @Override
    public void draw(String creatingStructure) {
        System.out.println("created "+ structurePart + " with Rectangle for "+ creatingStructure);
    }
}
