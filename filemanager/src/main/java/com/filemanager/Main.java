package com.filemanager;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // JFileChooser j = new JFileChooser();
        try {
            File variableArchivo = new File ("data.txt");
            /* 
            j.showOpenDialog(j);

            String path = j.getSelectedFile().getAbsolutePath();
            System.out.println(path);
            */
        } catch (Exception e) {
            System.out.println("No se seleccionó ningún archivo");
        }
    }
}