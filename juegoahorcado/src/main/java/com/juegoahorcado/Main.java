package com.juegoahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] palabras = {"elefante", "amor", "casa"};
        // Ecuación para elegir número random:  Math.random() * (max - min) + min;
        int posicionAleatoria = (int) Math.floor(Math.random() * palabras.length);
        // Aquí elijo una palabra aleatoria del Array de palabras
        String palabra = palabras[posicionAleatoria];
        int vidas = 6;
        int cuentaletra = 0;

        System.out.println(palabra);

        char [] letras = palabra.toCharArray();
        char [] letrasConGuiones = new char[letras.length]; 

        for (int i=0; i<letras.length; i++) {
            letrasConGuiones[i] = '_';
        }

        System.out.println(letrasConGuiones);

        boolean hemosGanado = false;

        while (hemosGanado == false) {

            System.out.println("Introduce una letra: ");
            Scanner lector = new Scanner(System.in);
            char letraIntroducida = lector.next().charAt(0);

            for (int i = 0; i<letras.length; i++) {
                if (letras[i] == letraIntroducida) {
                    letrasConGuiones[i] = letraIntroducida;
                    cuentaletra++;
                }
            }
            if (cuentaletra >= 1) {
                System.out.println("Felicitaciones la letra está en la palabra");
                cuentaletra = 0;
            } else {
                vidas--;
                System.out.println("Lo sentimos. Letra no encontrada, tienes "+ vidas +" vidas.");
            }

            if (Arrays.equals(letrasConGuiones, letras)) {
                hemosGanado = true;
                System.out.println("Ganaste");
            } else if (vidas == 0) {
                System.out.println("Perdiste");
            }
            System.out.println(letrasConGuiones);
        }
    }
}