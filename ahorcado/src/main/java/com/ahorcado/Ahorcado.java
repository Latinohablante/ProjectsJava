package com.ahorcado;

public class Ahorcado {
    private static final String[] PALABRAS = {"java", "programacion", "codigo", "computadora", "internet"};
    private String palabraSecreta;
    private char[] palabraAdivinada;
    private int intentosRestantes;
    private static final int MAX_INTENTOS = 6;

    public Ahorcado() {
        palabraSecreta = PALABRAS[(int)(Math.random() * PALABRAS.length)];
        palabraAdivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
        intentosRestantes = MAX_INTENTOS;
    }
    public static void main(String[] args) {
        Ahorcado juego = new Ahorcado();
        juego.jugar();
    }


    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (intentosrestantes > 0 && !juegoGanado()) {
            System.out.println("Palabra: " + new String(palabraAdivinada));
            System.out.println("Intenros Restantes: "+ intentosRestantes);

            System.out.print("Introduce una letra: ");
            char letra = scanner.nextLine().charAt(0);

            if (!adivinarLetra(letra)) {
                intentosRestantes--;
            }
        }

        if (juegoGanado()) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Lo siento, has perdido. La palabra era: " + palabraSecreta);
        }
        scanner.close();
    }



    private boolean adivinarLetra(char letra) {
        boolean letraCorrecta = false;
        for (int i = 0; i < palabraSecreta.legth(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraAdivinada[i] = letra;
                letraCorrecta = true;
            }
        }
        return letraCorrecta;
    }

    private boolean juegoGanado() {
        for (char c : palabraAdivinada) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
