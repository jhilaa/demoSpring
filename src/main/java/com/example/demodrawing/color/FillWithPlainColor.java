package com.example.demodrawing.color;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier("FillWithPlainColor")
public class FillWithPlainColor extends FillWithColor {

    @Override
    public void defineParameter() {
        System.out.println("  FillWithPlainColor.defineParameter");
    }

    @Override
    public void doColoring() {
        // check shape outline
        // apply color
        // ...
        System.out.println("  FillWithPlainColor.doColoring");
    }
}
