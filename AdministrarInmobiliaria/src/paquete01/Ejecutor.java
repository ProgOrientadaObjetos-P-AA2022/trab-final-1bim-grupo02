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
        String datosVivienda;
        String option;
        boolean bandera = true;

        System.out.println("\t\tVamos a registrar datos inmobiliarios");
        while(bandera){
                System.out.println("Ingrese un número para registrar datos:\n"
                + "[1]Información de Propietario\n"
                + "[2]Información de Barrios\n"
                + "[3]Información de Ciudad\n"
                + "[4]Información de Constructora");
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

            default:
                System.out.println("Ingrese un valor Correcto por favor...");
        }
            System.out.println("¿Desea registrar más datos?[Si][No]");
            String banderin = a.nextLine().toLowerCase();
            if(banderin.equals("si")){
            bandera = true;
            }else{
                bandera = false;
            }
        }

        System.out.println("\t\tDatos Vivienda");
        System.out.println("Ingrese el número correspondiente para comprobar "
                + "datos:\n"
                + "[1]Datos de Casa\n"
                + "[2]Datos de Departamento");
        String rta = a.nextLine();
        switch (rta) {
            case "1":
                datosVivienda = casa();
                System.out.println(datosVivienda);
                break;
            case "2":
                datosVivienda = departamento();
                System.out.println(datosVivienda);
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
        cadena = String.format("%s", l.obtenerListaPropietario());
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
        cadena = String.format("%s", l.obtenerListaBarrio());
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
        cadena = String.format("%s", l.obtenerListaCiudad());
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
            System.out.printf("Ingresar la ID de la Constructora %s: "
                    , nombreConstructora[i]);
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
        cadena = String.format("%s", l.obtenerListaConstructora());
        // cadena = String.format("%s\n\t\tLectura del Archivo: %s:", p,l);
        return cadena;
    }

    public static String casa() {
        Scanner a = new Scanner(System.in);
        String cadena;
        String name = "C:\\Users\\ronni\\OneDrive\\Escritorio\\Escritorio2.0"
                + "\\POO\\trab-final-1bim-grupo02\\ArchivosInmobiliaria\\"
                + "casa.dat";
        System.out.println("\t\t INFORMACIÓN CASA");
        
        System.out.print("Ingrese la identificación del Propietario: ");
        String buscarPropietario = a.nextLine();
        String mensaje1 = comprobarPropietario(buscarPropietario);
        System.out.print("Ingresar nombre Barrio: ");
        String buscarBarrio = a.nextLine();
        String mensaje2 = comprobarBarrio(buscarBarrio);
        System.out.print("Ingresar nombre Ciudad: ");
        String buscarCiudad = a.nextLine();
        String mensaje3 = comprobarCiudad(buscarCiudad);

        System.out.print("Ingrese el ID de la Empresa: ");
        String buscarEmpresa = a.nextLine();
        String mensaje4 = comprobarConstructora(buscarEmpresa);

        System.out.print("Cotización de los Metros Cuadrados: ");
        double precioMetro = a.nextDouble();

        System.out.print("Numero de Metros de la Casa: ");
        double numMetro = a.nextDouble();
        System.out.print("Numero de Cuartos de la Casa: ");
        int numCuartos = a.nextInt();

        Casa c = new Casa(precioMetro, numMetro, numCuartos);
        c.establecerCostoFinal();
        cadena = String.format("%s\n%s - %s - %s - %s", c,
                mensaje1,
                mensaje2,
                mensaje3,
                mensaje4);

        EscrituraCasa e = new EscrituraCasa(name, c);
        e.establecerSalida();
        e.cerrarArchivo();

        return cadena;
    }

    public static String departamento() {
        Scanner a = new Scanner(System.in);
        String name = "C:\\Users\\ronni\\OneDrive\\Escritorio\\Escritorio2.0"
                + "\\POO\\trab-final-1bim-grupo02\\ArchivosInmobiliaria\\"
                + "departamento.dat";
        System.out.println("\t\tINFORMACIÓN DEPARTAMENTO");

        System.out.print("Ingrese la identificacion del Propietario: ");
        String buscarPropietario = a.nextLine();
        String mensaje1 = comprobarPropietario(buscarPropietario);

        System.out.print("Ingrese el Nombre del Barrio: ");
        String buscarBarrio = a.nextLine();
        String mensaje2 = comprobarBarrio(buscarBarrio);

        System.out.print("Ingrese el Nombre de la Ciudad: ");
        String buscarCiudad = a.nextLine();
        String mensaje3 = comprobarCiudad(buscarCiudad);

        System.out.print("Ingrese el ID de la Constructora: ");
        String buscarEmpresa = a.nextLine();
        String mensaje4 = comprobarConstructora(buscarEmpresa);

        System.out.print("Cotización de los Metro Cuadrados del Departamento: ");
        double valorMetro = a.nextDouble();
        System.out.print("Numero de Metros del Departamento: ");

        double numMetro = a.nextDouble();
        a.nextLine();
        System.out.print("Ingrese el nombre del Edifico: ");
        String nombreEdificio = a.nextLine();

        System.out.print("Ingrese la Ubicación del Edificio: ");
        String ubi = a.nextLine();

        Departamento dep = new Departamento(valorMetro, numMetro, nombreEdificio, ubi);
        dep.establecerCostoFinal();
        String cadena = String.format("%s\n%s - %s - %s - %s", dep,
                mensaje1,
                mensaje2,
                mensaje3,
                mensaje4);

        EscrituraDepartamento e = new EscrituraDepartamento(name, dep);
        e.establecerSalida();
        e.cerrarArchivo();

        return cadena;
    }

    public static String comprobarPropietario(String a) {
        String name = "C:\\Users\\ronni\\OneDrive\\Escritorio\\Escritorio2.0"
                + "\\POO\\trab-final-1bim-grupo02\\ArchivosInmobiliaria\\"
                + "propietario.dat";

        String cadena = "";
        try {

            LecturaPropietario p = new LecturaPropietario(name);
            p.establecerIdentificador(a);
            p.establecerPropietarioBuscado();
            for (int i = 0; i < p.obtenerPropietarioBuscado()
                    .obtenerNombre().length; i++) {
                a = p.obtenerPropietarioBuscado().obtenerNombre()[i];
                if (a != null) {
                    cadena = (a);
                }
            }
        } catch (Exception e) {
            cadena = ("Propietario no encontrado");
        }

        return cadena;
    }

    public static String comprobarBarrio(String a) {
        String name = "C:\\Users\\ronni\\OneDrive\\Escritorio\\Escritorio2.0"
                + "\\POO\\trab-final-1bim-grupo02\\ArchivosInmobiliaria\\"
                + "barrio.dat";
        String cadena = "";
        try {

            LecturaBarrio p = new LecturaBarrio(name);
            p.establecerIdentificador(a);
            p.establecerBarrioBuscado();
            System.out.println(p.obtenerBarrioBuscado().obtenerNombreBarrio().size());
            for (int i = 0; i < p.obtenerBarrioBuscado().obtenerNombreBarrio().size(); i++) {
                a = p.obtenerBarrioBuscado().obtenerNombreBarrio().get(i);
                if (a != null) {
                    cadena = (a);
                }

            }
        } catch (Exception e) {
            cadena = "Barrio no encontrado";

        }
        return cadena;
    }

    public static String comprobarCiudad(String a) {
        String name = "C:\\Users\\ronni\\OneDrive\\Escritorio\\Escritorio2.0"
                + "\\POO\\trab-final-1bim-grupo02\\ArchivosInmobiliaria\\"
                + "ciudad.dat";
        String cadena = "";
        try {

            LecturaCiudad p = new LecturaCiudad(name);
            p.establecerIdentificador(a);
            p.establecerCiudadBuscar();
            for (int i = 0; i < p.obtenerCiudadBuscar()
                    .obtenerNombreCiudad().length; i++) {
                a = p.obtenerCiudadBuscar().obtenerNombreCiudad()[i];
                if (a != null) {
                    // System.out.println("aaaaaa");
                    cadena = (a);
                }
            }
        } catch (Exception e) {
            cadena = ("Ciudad no encontrado");
        }

        return cadena;
    }

    public static String comprobarConstructora(String a) {
        String name = "C:\\Users\\ronni\\OneDrive\\Escritorio\\Escritorio2.0"
                + "\\POO\\trab-final-1bim-grupo02\\ArchivosInmobiliaria\\"
                + "constructora.dat";
        String cadena = "";
        try {

            LecturaConstructora p = new LecturaConstructora(name);
            p.establecerIdentificador(a);
            p.establecerBuscarConstructora();
            for (int i = 0; i < p.obtenerBuscarConstructora().obtenerIdConstructora().length; i++) {
                a = p.obtenerBuscarConstructora().obtenerIdConstructora()[i];
                if (a != null) {
                    cadena = (a);
                }
            }
        } catch (Exception e) {
            cadena = ("Constructora no encontrada.\n");
        }

        return cadena;
    }
}
