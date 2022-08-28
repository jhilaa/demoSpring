package com.example.demodrawing.shape;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("DrawTriangle")
public class DrawTriangle extends DrawShape {
    @Override
    public void chooseInstrument() {
        // prepare ruler
        // prepare set square
        // ...
        System.out.println("  drawTriangle.chooseInstrument");
    }

    @Override
    public void doDrawing() {
        // check the line position consistency
        // draw 1st line
        // draw 2nd line
        // draw 3rd line
        // ...
        System.out.println("  drawTriangle.doDrawing");
    }
}
