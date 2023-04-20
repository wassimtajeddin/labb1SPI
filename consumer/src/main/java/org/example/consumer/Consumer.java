package org.example.consumer;

import org.example.service.annotation.Language;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

import java.util.Set;
import java.util.stream.Collectors;

public class Consumer {
public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, IOException, NoSuchMethodException, InstantiationException {

//leta efter klasser i paketet org.example.provider
Set<Class> classes = findAllClasses("org.example.provider");
    for (var c:classes) {
       var annotation = (Language)c.getAnnotation(Language.class);
        if(annotation!=null){
            System.out.println(annotation.value());
            var o = c.getConstructor().newInstance();
            //    anropa klassens metod/metoder ooch skriv ut returvärdet
            var methods = c.getMethods();
            for (var m : methods) {
                if(m.getReturnType().equals(String.class)&&
                        m.getParameterCount()==0&&
                !m.getName().equals("toString")) {
                    var s =(String) m.invoke(o);
                         System.out.println(s);
                }
            }
        }
    }
//    kolla om klassen har annotationen @language


    
//Find all implementations of Greeting
//    ServiceLoader<Greeting> greetings = ServiceLoader.load(Greeting.class);
//    for(var greeting :greetings){
//        System.out.println(greeting.sayHello());
//    }
}

    private static Set<Class> findAllClasses(String packageName) throws IOException {
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replaceAll("[.]", "/"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        return reader.lines()
                .filter(line -> line.endsWith(".class"))
                .map(line -> getClass(line, packageName))
                .collect(Collectors.toSet());
    }

    private static Class getClass(String className, String packageName) {
        try {
            return Class.forName(packageName + "."
                    + className.substring(0, className.lastIndexOf('.')));
        } catch (ClassNotFoundException e) {
            // handle the exception
        }
        return null;
    }
    }

