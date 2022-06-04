/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Casa {

    double precioMetro;
    double numMetros;
    double costoFinal;
    int numCuartos;

    Barrio barrio;
    Ciudad ciudad;
    Propietario prop;
    Constructora constructora;

    public Casa(double a, double b) {
        precioMetro = a;
        numMetros = b;
    }

    public void establecerPrecioMetro(double a) {
        precioMetro = a;
    }

    public void establecerNumeroMetros(double a) {
        numMetros = a;
    }

    public void establecerCostoFinal() {
        costoFinal = precioMetro * numMetros;
    }

    public void establecerBarrio(Barrio a) {
        barrio = a;
    }

    public void establecerCiudad(Ciudad a) {
        ciudad = a;
    }

    public void establecerPropietario(Propietario a) {
        prop = a;
    }

    public void establecerConstructora(Constructora a) {
        constructora = a;
    }
    // ------------------------------------------------------

    public double establecerPrecioMetro() {
        return precioMetro;
    }

    public double establecerNumeroMetros() {
        return numMetros;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public Barrio establecerBarrio() {
        return barrio;
    }

    public Ciudad establecerCiudad() {
        return ciudad;
    }

    public Propietario establecerPropietario() {
        return prop;
    }

    public Constructora establecerConstructora() {
        return constructora;
    }
}
