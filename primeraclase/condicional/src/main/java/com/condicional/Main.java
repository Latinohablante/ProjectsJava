package com.condicional;

import java.util.Scanner;

public class Main {
    @SuppressWarnings({"resource"})
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Persona mayor de edad");
        } else if (edad < 0){
            System.out.println("la persona no ha nacido");
        } else {
            System.out.println("La persona es menor de edad");
        }  
    }
    
}