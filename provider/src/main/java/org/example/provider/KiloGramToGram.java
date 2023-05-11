package org.example.provider;

import org.example.service.ConvertKgToG;
import java.util.Scanner;

public class KiloGramToGram implements ConvertKgToG {
    Scanner scanner = new Scanner(System.in);
    double kilogram = scanner.nextDouble();
    double gram = kilogram * 1000;

    @Override
    public String kgToG() {
        return "Vikten i gram är: "+gram;
    }
}
