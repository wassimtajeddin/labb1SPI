package org.example.provider;

import org.example.service.Convert;
import java.util.Scanner;

public class KiloGramToGram implements Convert {
    Scanner scanner = new Scanner(System.in);
    double kilogram = scanner.nextDouble();
    double gram = kilogram * 1000;
    @Override
    public String convert(){
        return "Vikten i gram är: "+gram ;
    }
}
