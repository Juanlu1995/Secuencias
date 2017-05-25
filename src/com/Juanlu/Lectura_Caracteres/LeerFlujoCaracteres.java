package com.Juanlu.Lectura_Caracteres;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 * Created by juanl on 24/05/2017.
 */
public class LeerFlujoCaracteres {

    public static void main(String[] args) {
        LeerArchivo la = new LeerArchivo();

        la.leer();
    }
}

class LeerArchivo {
    public void leer(){

        Date inicio = new Date();

        try {
            FileReader fichero = new FileReader("prueba.txt");

            int letra = fichero.read();
            while (letra != -1){
                System.out.print((char)letra);
                letra = fichero.read();
            }
            fichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Date fin = new Date();

        long tiempo = fin.getTime() - inicio.getTime();

        System.out.println(tiempo);

    }
}
