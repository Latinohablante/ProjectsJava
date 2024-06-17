package com.ciclowhile;

public class Main {
    
    public static void main(String[] args) {
        /*
        int edad;
        float precio = 23.5f;
        String nombre;
        int valor = 0;
        int acum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un valor mayor a cero(0) :");
            valor = sc.nextInt();
            sc.nextLine();
            if (valor <0) continue;
            acum += valor;
        }
        */
    @SuppressWarnings({"resource"});
    Scanner sc = new Scanner(System.in);
    int valor = 0;
    int nrosInv = 0;
    int acum = 0;
    int nrosVal = 0;
    for(int i=1;i<=3;i++){
        System.out.println("Ingrese un valor mayor a cero(0) :");
        valor = sc.nextInt();
        sc.nextLine();
        if (valor < 0) {
            nrosInv++;
            continue;
        }
        nrosVal++;
        acum += valor;
        
    }
    }
    }
}