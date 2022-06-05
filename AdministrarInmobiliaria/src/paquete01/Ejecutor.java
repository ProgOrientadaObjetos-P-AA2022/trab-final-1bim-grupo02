/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.*;
import paquete03.*;
import paquete04.*;
import paquete05.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String mensaje;
        String option;
        System.out.println("\t\tVamos a registrar datos inmobiliarios");
        System.out.println("Ingrese un número para registrar datos:\n"
                + "[1]Información de Propietario\n"
                + "[2]Información de Barrios\n"
                + "[3]Información de Ciudad\n"
                + "[4]Información de Constructora\n"
                + "[5]Información de Casa\n"
                + "[6]Información de Departamento\n");
        option = a.nextLine();
        switch (option) {
            case "1":
                mensaje = propietario();
                System.out.println(mensaje);
                break;
            case "2":
                mensaje = barrios();
                System.out.println(mensaje);
                break;
            case "3":
                mensaje = ciudad();
                System.out.println(mensaje);
                break;
            case "4":
                mensaje = constructora();
                System.out.println(mensaje);
                break;
            case "5":
                mensaje = casa();
                System.out.println(mensaje);
                break;
            case "6":
                mensaje = departamento();
                System.out.println(mensaje);
                break;

        }
    }

    public static String propietario() {
        Scanner a = new Scanner(System.in);
        String name = "C:\\Users\\ronni\\OneDrive\\Escritorio\\Escritorio2.0"
                + "\\POO\\trab-final-1bim-grupo02\\ArchivosInmobiliaria\\"
                + "propietarios.dat";
        String cadena;
        String[] nombre;
        String[] apellido;
        String[] id;
        int respuesta;

        System.out.println("¿De cuántos Propietarios desea Ingresar información?");
        respuesta = a.nextInt();
        a.nextLine();

        nombre = new String[respuesta];
        apellido = new String[respuesta];
        id = new String[respuesta];
        Propietario p;
        for (int i = 0; i < respuesta; i++) {
            System.out.println("---------------------------------------------");
            System.out.println("Ingresar nombre del Propietario:");
            nombre[i] = a.nextLine();
            System.out.println("Ingresar apellido el Propietario:");
            apellido[i] = a.nextLine();
            System.out.println("Ingresar identificación del Propietario:");
            id[i] = a.nextLine();
            System.out.println("---------------------------------------------");
        }
        p = new Propietario(nombre, apellido, id);

        cadena = String.format("%s", p);
        Escritura e = new Escritura(name, cadena);

        return cadena;
    }

    public static String barrios() {
        Scanner a = new Scanner(System.in);
        String cadena;
        String[] barrio;
        String[] referencia;
        int respuesta;

        System.out.println("¿De cuántos Propietarios desea Ingresar información?");

        respuesta = a.nextInt();
        a.nextLine();

        barrio = new String[respuesta];
        referencia = new String[respuesta];

        Barrio b;
        for (int i = 0; i < respuesta; i++) {
            System.out.println("---------------------------------------------");
            System.out.printf("Ingresar el nombre del barrio %d:", i + 1);
            barrio[i] = a.nextLine();
            System.out.printf("Ingresar referencia del barrio %d:", i + 1);
            referencia[i] = a.nextLine();

        }
        b = new Barrio(barrio, referencia);
        cadena = String.format("%s", b);
        return cadena;
    }

    public static String ciudad() {
        Scanner a = new Scanner(System.in);
        String cadena;
        String[] ciudad;
        String[] provincia;
        int respuesta;

        System.out.println("¿De cuántos Propietarios desea Ingresar información?");
        respuesta = a.nextInt();
        a.nextLine();
        ciudad = new String[respuesta];
        provincia = new String[respuesta];

        Ciudad c;
        for (int i = 0; i < respuesta; i++) {
            System.out.println("---------------------------------------------");
            System.out.printf("Ingresar el nombre de la Ciudad %d:", i + 1);
            ciudad[i] = a.nextLine();
            System.out.printf("Ingresar el nombre de la Provincia %d:", i + 1);
            provincia[i] = a.nextLine();

        }
        c = new Ciudad(ciudad, provincia);
        cadena = String.format("%s", c);
        return cadena;
    }

    public static String constructora() {
        Scanner a = new Scanner(System.in);
        String cadena;
        String[] nombreConstructora;
        String[] id;
        int respuesta;

        System.out.println("¿De cuántos Propietarios desea Ingresar información?");
        respuesta = a.nextInt();
        a.nextLine();

        nombreConstructora = new String[respuesta];
        id = new String[respuesta];

        Constructora c;
        for (int i = 0; i < respuesta; i++) {
            System.out.println("---------------------------------------------");
            System.out.printf("Ingresar el nombre de la Ciudad %d:", i + 1);
            nombreConstructora[i] = a.nextLine();
            System.out.printf("Ingresar la ID de la empresa %s: ",
                     nombreConstructora[i]);
            id[i] = a.nextLine();

        }
        c = new Constructora(nombreConstructora, id);
        cadena = String.format("%s", c);
        return cadena;
    }

    public static String casa() {
        Scanner a = new Scanner(System.in);
        String cadena = "";

        return cadena;
    }

    public static String departamento() {
        Scanner a = new Scanner(System.in);
        String cadena = "";

        return cadena;
    }
}
