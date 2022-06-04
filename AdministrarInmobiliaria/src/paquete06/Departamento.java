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
}
