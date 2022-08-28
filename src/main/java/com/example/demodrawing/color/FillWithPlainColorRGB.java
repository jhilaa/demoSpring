package com.example.demodrawing.color;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("FillWithPlainColorRGB")
public class FillWithPlainColorRGB extends FillWithColor {
    private Integer redComponent;
    private Integer greenComponent;
    private Integer blueComponent;

    @Override
    public void defineParameter() {
        System.out.println("  FillWithPlainColorRGB.defineParameter");
    }

    @Override
    public void doColoring() {
        // check shape outline
        // apply color
        // ...
        System.out.println("  FillWithPlainColorRGB.doColoring");
    }

    public Integer getRedComponent() {
        return redComponent;
    }

    public void setRedComponent(Integer redComponent) {
        this.redComponent = redComponent;
    }

    public Integer getGreenComponent() {
        return greenComponent;
    }

    public void setGreenComponent(Integer greenComponent) {
        this.greenComponent = greenComponent;
    }

    public Integer getBlueComponent() {
        return blueComponent;
    }

    public void setBlueComponent(Integer blueComponent) {
        this.blueComponent = blueComponent;
    }
}
