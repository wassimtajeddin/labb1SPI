package org.example.consumer;
import org.example.service.ConvertKgToG;
import org.example.service.ConvertMToFeet;

import java.util.ServiceLoader;


public class Consumer {
public static void main(String[] args){


    ServiceLoader<ConvertKgToG> convertsKg = ServiceLoader.load(ConvertKgToG.class);
    System.out.println("Skriv vikten i kg!");
        for(var convert:convertsKg){
        System.out.println(convert.kgToG());
            }
    ServiceLoader<ConvertMToFeet> convertsM = ServiceLoader.load(ConvertMToFeet.class);
    System.out.println("Skriv längden i meter!");
    for(var convert:convertsM){
        System.out.println(convert.mToFeet());
    }
    }
    }



