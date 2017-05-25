package com.Juanlu.FlujoByte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by juanl on 25/05/2017.
 */
public class AccesoArchivoBinario {
    public static void main(String[] args) {
        int bytesImagen[] = new int[644497];

        try {
            FileInputStream archivoLectura = new FileInputStream("Venom.png");
            boolean end = false;
            int contador = 0;
            while (!end) {
                int chunk = archivoLectura.read();
                if (chunk == -1) {
                    end = true;
                } else {
                    System.out.println(chunk);
                    bytesImagen[contador] = chunk;
                    contador++;
                }
            }
            System.out.println("Bytes: " + contador);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream archivoEscritura = new FileOutputStream("copia_Venom.png");
            for (int i = 0; i <bytesImagen.length ; i++) {
                archivoEscritura.write(bytesImagen[i]);

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        copiarArchivo();
    }


    private static void leerArchivo() {

    }

    private static void copiarArchivo() {
    }
}
