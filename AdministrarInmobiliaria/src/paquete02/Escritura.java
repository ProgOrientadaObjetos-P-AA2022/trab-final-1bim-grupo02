/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import paquete01.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Escritura {

    private String nombreArchivo;
    private ObjectOutputStream salida; // envía los datos a un archivo
    private Propietario registro;
    private ArrayList<Propietario> lista;
    private String mensaje;

    public Escritura(String nombreArc, String men) {
        nombreArchivo = nombreArc;
        mensaje = men;
        establecerLista(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        // System.out.println(obtenerListaProfesores().size());
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }

    public void establecerMensaje(String a) {
        mensaje = a;
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    // agrega registros al archivo
    public void establecerRegistro(Propietario p) {
        registro = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(mensaje); // envía el registro como salida
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerLista() {
        LecturaArchivoSecuencial l = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerListaPropietarioes();
        lista = l.obtenerListaPropietario();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }

    public String obtenerMensaje() {
        return mensaje;
    }
    
    public ArrayList<Propietario> obtenerLista() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 

}
