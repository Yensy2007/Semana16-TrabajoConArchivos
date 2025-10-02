/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajoconarchivos;

/**
 *
 * @author USER
 */
/*
 Tarea: Trabajo con Archivos de Texto en Java
 Autor: [Tu Nombre]
 Descripción: Programa que escribe un archivo de texto con notas personales,
              luego lo lee línea por línea y muestra el contenido en consola.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TrabajoConArchivos {

    public static void main(String[] args) {
        // Nombre del archivo
        String nombreArchivo = "my_notes.txt";

        // 1. Escritura de Archivo de Texto
        try {
            // FileWriter con true = agregar, false = sobrescribir
            FileWriter escritor = new FileWriter(nombreArchivo, false);

            // Escribimos tres líneas de notas personales
            escritor.write("HOLA MI NOMBRE ES YENSY.\n");
            escritor.write("MI APELLIDO ES CASTILLO MONSERRATE.\n");
            escritor.write("ESTA ES UAN TAREA DE FUNDAMENTOS DE LA PROGRAMACION.\n");

            // Cerramos el archivo de escritura
            escritor.close();
            System.out.println("✅ Escritura completada en " + nombreArchivo);

        } catch (IOException e) {
            System.out.println("❌ Error al escribir en el archivo: " + e.getMessage());
        }

        // 2. Lectura de Archivo de Texto
        try {
            FileReader lector = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(lector);

            String linea;
            System.out.println("\n Contenido del archivo:");
            // Leemos línea por línea hasta que no haya más
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }

            // Cerramos el archivo de lectura
            buffer.close();
            lector.close();

        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}

