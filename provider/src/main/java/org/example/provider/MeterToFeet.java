package org.example.provider;

import org.example.service.ConvertKgToG;
import org.example.service.ConvertMToFeet;

import java.util.Scanner;

public class MeterToFeet implements ConvertMToFeet {
    Scanner scanner = new Scanner(System.in);
    double meter = scanner.nextDouble();
    double feet = 3.28*meter;
    @Override
    public String mToFeet() {
        return "Längden i fot  är: "+feet;
    }
}
