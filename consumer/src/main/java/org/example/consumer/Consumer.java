package org.example.consumer;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ServiceLoader;

public class Consumer {
public static void main(String[] args) {

    ServiceLoader<Greeting> greetings = ServiceLoader.load(Greeting.class);
    for(var greeting :greetings){
        System.out.println(greeting.sayHello());
    }
}
}
