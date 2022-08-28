package com.example.demodrawing.shape;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier("DrawCircle")
public class DrawCircle extends DrawShape {
    @Override
    public void chooseInstrument() {
        // prepare compass
        // prepare ruler
        // ...
        System.out.println("  DrawCircle.chooseInstrument");
    }

    @Override
    public void doDrawing() {
        // positon the center of the circle
        // use compass
        // ...
        System.out.println("  DrawCircle.doDrawing");
    }
}