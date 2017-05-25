package com.Juanlu.Serializando;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by juanl on 25/05/2017.
 */
public class AlumnosADA {
    public static void main(String[] args) {
       ArrayList<Persona> primeroDAM;

        primeroDAM = new ArrayList<>();
//        primeroDAM.add(new Persona("Juanlu", "Romero", "29504920Z",true));
//        primeroDAM.add(new Alumno("JOSE","pepe", "6811441IUGPIY", "2017",true));
//        primeroDAM.add(new Alumno("ASD","peGHJpe", "IVY", "1",false));
//        primeroDAM.add(new Alumno("H","M", "76889", "2",false));
//
//        try {
//            ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("info\\alumnos.dat"));
//            fos.writeObject(primeroDAM);
//            fos.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("info\\alumnos.dat"));
            primeroDAM = (ArrayList<Persona>) ois.readObject();
            for (Persona p : primeroDAM) {
                System.out.println(p);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}


class Persona implements Serializable{
    private static final long serialVersionUID = 6736565796157317651L;


    String nombre;
    String apellido;
    String dni;
    Boolean esAlto;


    //Constructor

    public Persona(String nombre, String apellido, String dni, boolean esAlto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.esAlto = esAlto;
    }


    //Accesores

    public Boolean getEsAlto() {
        return esAlto;
    }

    public void setEsAlto(Boolean esAlto) {
        this.esAlto = esAlto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", esAlto=" + esAlto +
                '}';
    }
}


class Alumno extends Persona{
    String curso;

    public Alumno(String nombre, String apellido, String dni, String curso, boolean esGuapo) {
        super(nombre, apellido, dni,esGuapo);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Alumno{" +
                "curso='" + curso + '\'' +
                '}';
    }
}