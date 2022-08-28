package com.example.demodrawing.color;

public class FillWithColor implements FillWithColorInterface {
    private String colorName;

    public String getColorName() {
        return colorName;
    }
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public void defineParameter() {
        System.out.println("  FillWithColor.defineParameter");
    }
    @Override
    public void doColoring() {
        System.out.println("  FillWithColor.doColoring");
    }

    @Override
    public void doColoring(String colorName) {
        System.out.println("  FillWithColor.doColoring with personnal  : " + colorName);
    }

}
