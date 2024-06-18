package com.ejemploclases;

public class Main {
    public static void main(String[] args) {
        Estudiante myStudent = new Estudiante();
        myStudent.setNombre("Juanito");
        myStudent.setApellido("Perez");
        myStudent.setEdad(13);

        System.out.println(myStudent.getNombre());
    }
    
}
