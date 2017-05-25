package com.Juanlu.Escritura_Archivo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by juanl on 24/05/2017.
 */
public class GuardarArchivoTexto {
    public static void main(String[] args) {
        EscribirArchivoCaracteres escribiendo = new EscribirArchivoCaracteres();
        escribiendo.escribir();
    }
}

class EscribirArchivoCaracteres{
    public void escribir(){
        String texto = "Cuando el grajo vuela bajo y hace frio del....CARAJO";
        try {
            FileWriter fw = new FileWriter("escanfor.txt");

            for (int i = 0; i < texto.length(); i++) {
                fw.write(texto.charAt(i));
            }

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
