package com.intro;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        double precio;
        String nombre;
        try (Scanner sc = new Scanner(System.in)) {
            //Comentario en línea

            /*
             * Comentario
             * en
             * barra
             */
            
            System.out.println("Ingrese la edad :");
            edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre");
            nombre = sc.nextLine();
            sc.close();
        }
        
        System.out.println(nombre+" tiene "+edad+" años");
        System.out.println(MessageFormat.format("{0} tiene {1} años", nombre, edad));
        
    }
}
