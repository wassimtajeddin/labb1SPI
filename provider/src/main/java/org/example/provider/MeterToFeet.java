package org.example.provider;

import org.example.service.Convert;

import java.util.Scanner;

public class MeterToFeet implements Convert {
    Scanner scanner = new Scanner(System.in);
    double meter = scanner.nextDouble();
    double feet = 3.28*meter;
    @Override
    public String convert(){
        return "Längden i fot  är: "+feet ;
    }
}
