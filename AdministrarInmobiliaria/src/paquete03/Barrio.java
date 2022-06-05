/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {

    private String [] nombreBarrio;
    private String [] referencia;

    public Barrio(String [] a, String [] b) {
        nombreBarrio = a;
        referencia = b;
    }

    public void establecerNombreBarrio(String [] a) {
        nombreBarrio = a;
    }

    public void establecerReferencia(String [] a) {
        referencia = a;
    }
    //--------------------------------------

    public String [] obtenerNombreBarrio() {
        return nombreBarrio;
    }

    public String [] obtenerReferencia() {
        return referencia;
    }

    @Override
    public String toString() {
        String cadena = "\t\tLISTA DE BARRIOS\n";
        for (int i = 0; i < nombreBarrio.length; i++) {
            cadena = String.format("%s%s; %s\n",cadena
                                            , obtenerNombreBarrio()[i]
                                            , obtenerReferencia()[i]);
        }
        return cadena;
    }
    
}
