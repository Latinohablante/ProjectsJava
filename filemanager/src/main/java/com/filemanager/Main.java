package com.filemanager;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path, rutaPaquete;
        // String paquete = "src/main/java/com/filemanager/data";
        String file = "contenido.txt";

        try {
            path = Paths.get(Main.classgetProtectionDomain().getCodeSource().getLocation().toURI()).getParent();

            // Mover hacia el directorio del proyecto (asumimos que la estructura del proyecto es estándar)

            Path projectDir = path.getParent();
            rutaPaquete = projectDir.resolve(Paths.get("src","main", "java","com","filemanager","data"));
            File carpeta = rutaPaquete.toFile();
            File archivo = new File(carpeta, file);

            try {
                if(archivo.createNewFile()) {
                    System.out.println("Archivo creado: "+ archivo.getName());
                } else {
                    System.out.println("El archivo ya existe.");
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error.");
                e.printStackTrace();

            } 
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}