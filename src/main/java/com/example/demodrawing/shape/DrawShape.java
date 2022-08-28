package com.example.demodrawing.shape;

public class DrawShape implements DrawShapeInterface {
    private String shapeName;
    @Override
    public void chooseInstrument() {
        System.out.println("  DrawShape.chooseInstrument");
    }

    @Override
    public void doDrawing() {
        System.out.println("  DrawShape.doDrawing");
    }


    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
