/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable{
    private String [] nombreCiudad;
    private String [] nombreProvincia;

    public Ciudad(String [] a, String [] b) {
        nombreCiudad = a;
        nombreProvincia = b;
    }

    public void establecernombreCiudad(String []  a) {
        nombreCiudad = a;
    }

    public void establecerNombreProvincia(String [] a) {
        nombreProvincia = a;
    }
    //-----------------------------------------------------------

    public String [] obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String [] obtenerNombreProvincia() {
        return nombreProvincia;
    }
    @Override
    public String toString(){
        String cadena = "\t\tLISTA DE CIUDADES\n";
        for (int i = 0; i < nombreCiudad.length; i++) {
            cadena = String.format("%s%s; %s\n",cadena
                                            , obtenerNombreCiudad()[i]
                                            , obtenerNombreProvincia()[i]);
        }
    return cadena;
    }
}
