package org.example.consumer;
import org.example.service.Convert;
import java.util.ServiceLoader;


public class Consumer {
public static void main(String[] args){


    ServiceLoader<Convert> converts = ServiceLoader.load(Convert.class);
    System.out.println("Skriv vikten i kilogram");
        for(var convert:converts){
        System.out.println(convert.convert());
        System.out.println("Skriv längden i meter");
            }


    }
    }



