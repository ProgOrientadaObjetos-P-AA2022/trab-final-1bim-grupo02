/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Casa implements Serializable{

    private Propietario propietario;
    private double precioMetro;
    private double numMetros;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numCuartos;
    private Constructora constructora;
    
    public Casa(Propietario prop, double pm, double numeroMetros, int nCuartos,
            Barrio ba, Ciudad ciu, Constructora cons){
       propietario = prop;
       precioMetro = pm;
       numMetros = numeroMetros;
       numCuartos = nCuartos;
       barrio = ba;
       ciudad = ciu;
       constructora = cons;
    }
    
    public Casa(double pm, double nMetros, int nCuartos){
       precioMetro = pm;
       numMetros = nMetros;
       numCuartos = nCuartos;
    }
    
    public void establecerPropietario (Propietario n) {
        propietario = n;
    }
    
    public void establecerPrecioMetroCuadrado(double n) {
        precioMetro = n;
    }
    
    public void establecerNumeroMetros(double n) {
        numMetros = n;
    } 
    
    public void establecerCostoFinal() {
        costoFinal = numMetros * precioMetro;
    }
    
    public void establecerBarrio(Barrio n) {
        barrio = n;
    }
    
    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }
    
    public void establecerNumeroCuartos(int n) {
        numCuartos = n;
    }
    
    public void establecerConstructora(Constructora n) {
        constructora = n;
    }
    
    public Propietario obtenerPropietario() {
        return propietario;
    }
    
    public double obtenerPrecioMetroCuadrado() {
        return precioMetro;
    }
    
    public double obtenerNumeroMetros() {
        return numMetros;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public Barrio obtenerBarrio() {
        return barrio;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    public int obtenereNumeroCuartos() {
        return numCuartos;
    }
    
    public Constructora obtenerConstructora() {
        return constructora;
    }
}
