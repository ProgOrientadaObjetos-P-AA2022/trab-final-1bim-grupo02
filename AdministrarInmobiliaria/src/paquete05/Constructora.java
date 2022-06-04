/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Constructora {

    private String nombreConstructora;
    private String idEmpresa;

    public Constructora(String a, String b) {
        nombreConstructora = a;
        idEmpresa = b;
    }

    public void establecernombreCiudad(String a) {
        nombreConstructora = a;
    }

    public void establecerNombreProvincia(String a) {
        idEmpresa = a;
    }
    //--------------------------------------

    public String obtenernombreCiudad() {
        return nombreConstructora;
    }

    public String obtenerNombreProvincia() {
        return idEmpresa;
    }

}
