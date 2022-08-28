package com.example.demodrawing.color;

import org.springframework.stereotype.Service;

@Service
public interface FillWithColorInterface {
    void defineParameter();
    void doColoring();
    void doColoring(String colorName);

}


