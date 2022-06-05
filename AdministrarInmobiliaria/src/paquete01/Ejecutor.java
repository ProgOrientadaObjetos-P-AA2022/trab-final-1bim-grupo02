/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.*;
import paquete03.*;
import paquete04.*;
import paquete05.*;
import paquete06.*;

/**
 *
 * @author ronni
 */
class Ejecutor {
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

            default:
                System.out.println("Ingrese un valor Correcto por favor...");
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
        System.out.println("\t\tINFORMACIÓN PROPIETARIOS");
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
        }
        p = new Propietario(nombre, apellido, id);
        cadena = String.format("%s", p);

        EscrituraPropietario e = new EscrituraPropietario(name, cadena, p);
        e.establecerSalida();
        e.cerrarArchivo();

        LecturaPropietario l = new LecturaPropietario(name);
        l.establecerListaPropietario();
        // System.out.println(l);
        cadena = String.format("%s", l);
        // cadena = String.format("%s\n\t\tLectura del Archivo: %s:", p,l);

        return cadena;
    }

    public static String barrios() {
        Scanner a = new Scanner(System.in);
        String name = "C:\\Users\\ronni\\OneDrive\\Escritorio\\Escritorio2.0"
                + "\\POO\\trab-final-1bim-grupo02\\ArchivosInmobiliaria\\"
                + "barrios.dat";
        String cadena;
        ArrayList<String> barrio;
        ArrayList<String> referencia;
        int respuesta;
        System.out.println("\t\tINFORMACIÓN BARRIOS");
        System.out.println("¿De cuántos Barrios desea Ingresar información?");

        respuesta = a.nextInt();
        a.nextLine();

        barrio = new ArrayList<>();
        referencia = new ArrayList<>();

        Barrio b;
        for (int i = 0; i < respuesta; i++) {
            System.out.println("---------------------------------------------");
            System.out.printf("Ingresar el nombre del barrio %d: ", i + 1);
            barrio.add(a.nextLine());
            System.out.printf("Ingresar referencia del barrio %d: ", i + 1);
            referencia.add(a.nextLine());

        }
        b = new Barrio(barrio, referencia);
        cadena = String.format("%s", b);

        EscrituraBarrio e = new EscrituraBarrio(name, b);
        e.establecerSalida();
        e.cerrarArchivo();

        LecturaBarrio l = new LecturaBarrio(name);
        l.establecerListaBarrio();
        // System.out.println(l);
        cadena = String.format("%s", l);
        // cadena = String.format("%s\n\t\tLectura del Archivo: %s:", p,l);

        return cadena;
    }

    public static String ciudad() {
        Scanner a = new Scanner(System.in);
        String name = "C:\\Users\\ronni\\OneDrive\\Escritorio\\Escritorio2.0"
                + "\\POO\\trab-final-1bim-grupo02\\ArchivosInmobiliaria\\"
                + "ciudad.dat";
        String cadena;
        String[] ciudad;
        String[] provincia;
        int respuesta;
        System.out.println("\t\tINFORMACIÓN CIUDADES");
        System.out.println("¿De cuantas Ciudades desea Ingresar información?");
        respuesta = a.nextInt();
        a.nextLine();
        ciudad = new String[respuesta];
        provincia = new String[respuesta];

        Ciudad c;
        for (int i = 0; i < respuesta; i++) {
            System.out.println("---------------------------------------------");
            System.out.printf("Ingresar el nombre de la Ciudad %d: ", i + 1);
            ciudad[i] = a.nextLine();
            System.out.printf("Ingresar el nombre de la Provincia %d: ", i + 1);
            provincia[i] = a.nextLine();

        }
        c = new Ciudad(ciudad, provincia);
        cadena = String.format("%s", c);

        EscrituraCiudad e = new EscrituraCiudad(name, c);
        e.establecerSalida();
        e.cerrarArchivo();

        LecturaCiudad l = new LecturaCiudad(name);
        l.establecerListaCiudad();
        // System.out.println(l);
        cadena = String.format("%s", l);
        // cadena = String.format("%s\n\t\tLectura del Archivo: %s:", p,l);
        return cadena;
    }

    public static String constructora() {
        Scanner a = new Scanner(System.in);
        String name = "C:\\Users\\ronni\\OneDrive\\Escritorio\\Escritorio2.0"
                + "\\POO\\trab-final-1bim-grupo02\\ArchivosInmobiliaria\\"
                + "constructora.dat";
        String cadena;
        String[] nombreConstructora;
        String[] id;
        int respuesta;
        System.out.println("\t\tINFORMACIÓN CONSTRUCTORA");
        System.out.println("¿De cuántas Constructora/as desea Ingresar información?");
        respuesta = a.nextInt();
        a.nextLine();

        nombreConstructora = new String[respuesta];
        id = new String[respuesta];

        Constructora c;
        for (int i = 0; i < respuesta; i++) {
            System.out.println("---------------------------------------------");
            System.out.printf("Ingresar el nombre de la Constructora %d: ", i + 1);
            nombreConstructora[i] = a.nextLine();
            System.out.printf("Ingresar la ID de la empresa %s: ", nombreConstructora[i]);
            id[i] = a.nextLine();

        }
        c = new Constructora(nombreConstructora, id);
        cadena = String.format("%s", c);

        EscrituraConstructora e = new EscrituraConstructora(name, c);
        e.establecerSalida();
        e.cerrarArchivo();

        LecturaConstructora l = new LecturaConstructora(name);
        l.establecerListaConstructora();
        // System.out.println(l);
        cadena = String.format("%s", l);
        // cadena = String.format("%s\n\t\tLectura del Archivo: %s:", p,l);
        return cadena;
    }

    public static String casa() {
        Scanner a = new Scanner(System.in);
        System.out.println("\nCASA");
                            System.out.println("--------------");
                            System.out.print("Ingrese la identificacion del Propietario: ");
                            a.nextLine();
                            String buscarCasa = a.nextLine();
                            System.out.print("Ingresar nombre Barrio: ");
                            String buscarBarrio = a.nextLine();
                            System.out.print("Ingresar nombre Ciudad: ");
                            String buscarCiudad = a.nextLine();
                            System.out.print("Ingrese el ID de la Empresa: ");
                            String buscarEmpresa = a.nextLine();
                            System.out.print("Cotización de los m2: ");
                            double precioMetro = a.nextDouble();
                            System.out.print("Numero de Metros de la Casa: ");
                            double numMetro = a.nextDouble();
                            System.out.print("Numero de Cuartos de la Casa: ");
                            int numCuartos = a.nextInt();
                            
                            Casa c = new Casa(precioMetro, numMetro, numCuartos);
                            c.establecerCostoFinal();
        String cadena = "";

        return cadena;
    }

    public static String departamento() {
        Scanner a = new Scanner(System.in);
        String cadena = "";

        return cadena;
    }
    }

