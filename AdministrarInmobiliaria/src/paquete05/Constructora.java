/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Constructora implements Serializable{

    private String [] nombreConstructora;
    private String [] idEmpresa;

    public Constructora(String [] a, String [] b) {
        nombreConstructora = a;
        idEmpresa = b;
    }

    public void establecerNombreConstructora(String [] a) {
        nombreConstructora = a;
    }

    public void establecerIdConstructora(String [] a) {
        idEmpresa = a;
    }
    //--------------------------------------

    public String [] obtenerNombreConstructora() {
        return nombreConstructora;
    }

    public String [] obtenerIdConstructora() {
        return idEmpresa;
    }
    @Override
    public String toString(){
        String cadena = "\t\tLISTA DE BARRIOS\n";
        for (int i = 0; i < nombreConstructora.length; i++) {
            cadena = String.format("%s%s; %s\n",cadena
                                            , obtenerNombreConstructora()[i]
                                            , obtenerIdConstructora()[i]);
        }
        return cadena;
    }

}
