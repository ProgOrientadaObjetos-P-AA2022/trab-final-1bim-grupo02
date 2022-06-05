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
public class Departamento {

    double precioMetro;
    double numMetros;
    double valorMensual;
    double costoTotal;
    int numCuartos;
    String nombreDepa;
    String ubi;

    Barrio barrio;
    Ciudad ciudad;
    Propietario prop;
    Constructora constructora;

    public Departamento(String a, String b, double c, double d, double e,
             double f, int g) {
        nombreDepa = a;
        ubi = b;
        precioMetro = c;
        numMetros = d;
        valorMensual = e;
        costoTotal = f;
        numCuartos = g;
        
    }

    public void establecerPrecioMetro(double a) {
        precioMetro = a;
    }

    public void establecerNumMetros(double a) {
        numMetros = a;
    }

    public void establecerValorMensual(double a) {
        valorMensual = a;
    }

    public void establecerCostoTotal(double a) {
        costoTotal = a;
    }

    public void establecerNumCuartos(int a) {
        numCuartos = a;
    }

    public void establecerNombreDepa(String a) {
        nombreDepa = a;
    }

    public void establecerUbi(String a) {
        ubi = a;
    }

    public void establecerBarrio(Barrio a) {
        barrio = a;
    }

    public void establecerCiudad(Ciudad a) {
        ciudad = a;
    }

    public void establecerProp(Propietario a) {
        prop = a;
    }

    public void establecerConstructora(Constructora a) {
        constructora = a;
    }

    public double obtenerPrecioMetro() {
        return precioMetro;
    }

    public double obtenerNumMetros() {
        return numMetros;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    public double obtenerCostoTotal() {
        return costoTotal;
    }

    public int obtenerNumCuartos() {
        return numCuartos;
    }

    public String obtenerNombreDepa() {
        return nombreDepa;
    }

    public String obtenerUbi() {
        return ubi;
    }

    public Barrio obtenerBarrio() {
        return barrio;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public Propietario obtenerProp() {
        return prop;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

    
    
    
}
