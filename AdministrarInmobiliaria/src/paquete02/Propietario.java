/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Propietario {

    private String nombre;
    private String apellido;
    private String identificacion;

    public Propietario(String a, String b, String c) {
        nombre = a;
        apellido = b;
        identificacion = c;
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerApellido(String b) {
        apellido = b;
    }

    public void establecerIdentificacion(String c) {
        identificacion = c;
    }

    // ------------------------------------
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }
}
