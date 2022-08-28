package com.example.demodrawing.color;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("FillWithGradientColor")
public class FillWithGradientColor extends FillWithColor {

    @Override
    public void defineParameter() {
        System.out.println("  FillWithGradientColor.defineParameter");
    }

    @Override
    public void doColoring() {
        // position the instrument at the beginning of the shape
        // follow gradient path
        // ...
        System.out.println("  FillWithGradientColor.doColoring");
    }
}
