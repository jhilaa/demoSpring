package com.example.demodrawing.drawing;

import com.example.demodrawing.color.FillWithColorInterface;
import com.example.demodrawing.shape.DrawCircle;
import com.example.demodrawing.shape.DrawShapeInterface;
import com.example.demodrawing.shape.DrawTriangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class DrawSomething implements DrawSomethingInterface {
    @Autowired
    FillWithColorInterface fillWithColorInterface;
    @Autowired
    DrawShapeInterface drawShapeInterface;
    @Autowired
    DrawCircle drawCircle;
    @Autowired
    DrawTriangle drawTriangle;

    @EventListener(ApplicationReadyEvent.class)
    public void drawShapeWithColor() {
        System.out.println("--------");
        System.out.println("draw default shape (primary shape bean = circle) with default color (primary color bean = plain color)");
        drawShapeInterface.chooseInstrument();
        drawShapeInterface.doDrawing();
        fillWithColorInterface.defineParameter();
        fillWithColorInterface.doColoring();

        System.out.println("--------");
        System.out.println("draw triangle with personnal new color");
        drawTriangle.chooseInstrument();
        drawTriangle.doDrawing();
        fillWithColorInterface.defineParameter();
        fillWithColorInterface.doColoring("new color");
    }

    @Override
    public void drawShapeWithColor(FillWithColorInterface fillWithColorInterface) {
        fillWithColorInterface.doColoring();
    }

    @Override
    public void drawShapeWithColor(DrawShapeInterface drawShapeInterface) {

    }

    @Override
    public void drawShapeWithColor(DrawShapeInterface drawShapeInterface, FillWithColorInterface fillWithColorInterface) {

    }
}
