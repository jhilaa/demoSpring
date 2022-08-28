package com.example.demodrawing.drawing;

import com.example.demodrawing.color.FillWithColorInterface;
import com.example.demodrawing.shape.DrawShapeInterface;

public interface DrawSomethingInterface {
    public void drawShapeWithColor();

    public void drawShapeWithColor(FillWithColorInterface fillWithColorInterface);

    public void drawShapeWithColor(DrawShapeInterface drawShapeInterface);

    public void drawShapeWithColor(DrawShapeInterface drawShapeInterface, FillWithColorInterface fillWithColorInterface);
}