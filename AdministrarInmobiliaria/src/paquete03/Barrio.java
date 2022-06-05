/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Barrio implements Serializable{

    private ArrayList <String> nombreBarrio;
    private ArrayList <String> referencia;

    public Barrio(ArrayList<String> a, ArrayList<String> b) {
        nombreBarrio = a;
        referencia = b;
    }

    public void establecerNombreBarrio(ArrayList<String> a) {
        nombreBarrio = a;
    }

    public void establecerReferencia(ArrayList<String> a) {
        referencia = a;
    }
    //--------------------------------------

    public ArrayList<String> obtenerNombreBarrio() {
        return nombreBarrio;
    }

    public ArrayList<String> obtenerReferencia() {
        return referencia;
    }

    @Override
    public String toString() {
        String cadena = "\t\tLISTA DE BARRIOS\n";
        for (int i = 0; i < nombreBarrio.size(); i++) {
            cadena = String.format("%s%s; %s\n",cadena
                                            , obtenerNombreBarrio().get(i)
                                            , obtenerReferencia().get(i));
        }
        return cadena;
    }
    
}
