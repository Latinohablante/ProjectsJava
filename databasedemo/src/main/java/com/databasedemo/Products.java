package com.databasedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Products {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/products";
        String user = "campus2023";
        String password = "campus2023";

        //Una forma de hacerlo con throws SQLException
        try (Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();) {

            // Crear table
            /*
            String createTableSQL = "CREATE TABLE IF NOT EXISTS category (" +
                                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                                    "name VARCHAR(50))";
            statement.execute(createTableSQL);
            System.out.println("¡Tabla creada!");
            */

            // Insertar datos
            /* 
            String insertDataSQL = "INSERT INTO category (name) VALUES "+
                                    "('Pinturas'),"+
                                    "('Herramientas')";
            statement.executeUpdate(insertDataSQL);
            System.out.println("Categorías registradas!");
            */

            // Hacer consulta
            String query = "SELECT id, name FROM category";
            ResultSet resultSet = statement.executeQuery(query);

            // Procesar resultados
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println(MessageFormat.format("Id Categoria {0} - Nombre {1}", id, name));
            }


            // Operación UPDATE
            /* 
            String updateSQL = "UPDATE category SET name = 'Metálicos' where id = 6";
            int rowsUpdated = statement.executeUpdate(updateSQL);
            System.out.println("Numero de filas actualizadas "+ rowsUpdated);
            */


            // Operación DELETE
            String deleteSQL = "DELETE FROM category WHERE id = 6";
            int rowsDeleted = statement.executeUpdate(deleteSQL);
            System.out.println("Numero de filas eliminadas "+ rowsDeleted);



        }
        

        // Segunda forma sin throws SQLException
        /* 
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            // Crear table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS inventario (" +
                                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                                    "name VARCHAR(50))";
            statement.execute(createTableSQL);
            System.out.println("Tabla creada!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    }
}