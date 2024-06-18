package com.usandoarreglos;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> lstStudents = new ArrayList<>();
        Estudiante student;
        // ----------
        try (Scanner sc =new Scanner(System.in)) {
            while (JOptionPane.showConfirmDialog(null, "Quiere agregar un estduiate", "Informacion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0){
                student =new Estudiante();
                System.out.println("Ingrese el nombre del estudiante");
                student.setNombre(sc.nextLine());
                System.out.println("Ingrese el apellido del estudiante");
                student.setApellido(sc.nextLine());
                System.out.println("Ingrese la edad del estudiante");
                student.setEdad(sc.nextInt());
                sc.nextLine();
            }
        }
        for (Estudiante item: lstStudents) {
            System.out.println(item.getNombre());
        }
    }
}