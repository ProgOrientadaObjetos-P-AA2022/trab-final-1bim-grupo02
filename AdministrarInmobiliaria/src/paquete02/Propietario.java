/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Propietario implements Serializable{

    private String[] nombre;
    private String[] apellido;
    private String[] identificacion;
    private String identificador;
    private Propietario propBuscar;

    public Propietario(String[] a, String[] b, String[] c, String d, Propietario e) {
        nombre = a;
        apellido = b;
        identificacion = c;
        identificador = d;
        propBuscar = e;
    }

    public void establecerNombre(String[] a) {
        nombre = a;
    }

    public void establecerApellido(String[] b) {
        apellido = b;
    }

    public void establecerIdentificacion(String[] c) {
        identificacion = c;
    }

    // ------------------------------------
    public String[] obtenerNombre() {
        return nombre;
    }

    public String[] obtenerApellido() {
        return apellido;
    }

    public String[] obtenerIdentificacion() {
        return identificacion;
    }

    @Override
    public String toString() {
        String cadena = "\t\tLISTA DE PROPIETARIOS\n";
        for (int i = 0; i < nombre.length; i++) {
            cadena = String.format("%s%s; %s; %s\n",cadena
                                            , obtenerNombre()[i]
                                            , obtenerApellido()[i]
                                            , obtenerIdentificacion()[i]);
        }
        return cadena;
    }
}
