package com.mutabilidad;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList de String
        ArrayList<String> list = new ArrayList<>();

        // Agregar un elemento "backend" al final de la lista
        list.add("Backend");

        // Agregar un elemento "Fundamentos" en la posición 0 de la lista
        list.add(0, "Fundamentos");

        // Obtener el elemento en la posición 0 de la lista y almacenarlo en 'elemento'
        String elemento = list.get(0);
        //Imprimir el elemento obtenido (Output: Fundamentos)
        System.out.println(elemento);

        // Reemplazar el elemento en la posición 0 por "Programacion web"
        list.set(0, "Programacion web");

        // Eliminar el elemento en la posicion 1 y almacenarlo en 'eliminado'
        String eliminado = list.remove(1);
        // Imprimir el elemento eliminado (Output: Backend)
        System.out.println(eliminado);

        // Agregar un elemento "Pasteleria" al final de la lista
        list.add("Pasteleria");

        // eliminar el primer elemento que coincida con "Pasteleria" y almacenarlo en 'result'
        boolean result = list.remove("Pasteleria");
        // Imprimir el resultado de la eliminación (Output: true)
        System.out.println(result);

        // Imprimir el contenido actual de la lista (Output: [Programacion web])
        System.out.println(list);

        // Obtener el número de elementos de la lsita y almacenarlos en 'size'
        int size = list.size();
        // Imprimir el tamaño de la lista (Output: 1)
        System.out.println(size);

        // Verificar si la lsita está vacia y almacenar el resultado en 'isEmpty'
        boolean isEmpty = list.isEmpty();
        // Imprimir si la lista está vacia (Output: false)
        System.out.println(isEmpty);

        // Verificar si la lista contiene el elemento "Mysql" y almacenar el resultado en 'contains'
        boolean contains = list.contains("Mysql");
        // Imprimir si la lista contiene "Mysql" (Output: false)
        System.out.println(contains);

        // Obtener el índice del elemento que coincida con "Postgres" y almacenarlo en 'index'
        int index = list.indexOf("Postgres");
        // Imprimir el índice de "Postgres" en la lista (Output: -1, porque no se encuentra)
        System.out.println(index);

        // Agregar un elemento "Mysql" al final de la lista
        list.add("Mysql");

        // Obtener el índice del elemento que coincida con "Mysql" y almacenarlo en 'lastIndex'
        int lastIndex = list.lastIndexOf("Mysql");
        // Imprimir el último indice de "Mysql" (Output: 1)
        System.out.println(lastIndex);

        // Convertir la lista a un array y almacenarlo en 'Skills'
        Object[] skills = list.toArray();
        // Imprimir el array resultante (Output: [Programacion web, Mysql])
        System.out.println(Arrays.toString(skills));

        //-----------------------

        // Crear otra lista con elementos "Python" y "Pseint"
        ArrayList<String> otraLista = new ArrayList<>(Arrays.asList("Python", "Pseint"));

        // Agregar todos los elementos de 'otraLista' al final de 'List'
        list.addAll(otraLista);
        // Imprimir la lista resultante (Output: [Programacion web, Mysql, Python, Pseint])
        System.out.println(list);

        // Agregar todos los elementos de 'otraLista' al principio de 'List'
        list.addAll(0, otraLista);
        // Imprimir la lista resultante (Output: [Python, Pseint, Programacion web, Mysql])
        System.out.println(list);

        // Agregar todos los elementos de 'otraLista' en la posición 2 de 'List'
        list.addAll(2, otraLista);
        // Imprimir la lista resultante (Output: [Python, Pseint, Programacion web, Mysql, Python, Pseint])
        System.out.println(list);
    }
}