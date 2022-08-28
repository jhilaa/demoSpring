package com.example.demodrawing.color;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("FillWithPlainColorHex")
public class FillWithPlainColorHex extends FillWithColor {
    private String colorHex;

    @Override
    public void defineParameter() {
        System.out.println("  FillWithPlainColorHex.defineParameter");
    }

    @Override
    public void doColoring() {
        // check shape outline
        // apply color
        // ...
        System.out.println("  FillWithPlainColorHex.doColoring");
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }
}
