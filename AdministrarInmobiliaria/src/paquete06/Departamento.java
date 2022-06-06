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
public class Departamento implements Serializable {

    private Propietario propietario;
    private double PrecioMetro;
    private double numeroMetros;
    private double alicuotaMensual;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private String nombreEdificio;
    private String ubicacionDepartamento;
    private Constructora constructora;

    public Departamento(double pm, double nMetros,
            String nombre, String ubi) {
        PrecioMetro = pm;
        numeroMetros = nMetros;
        nombreEdificio = nombre;
        ubicacionDepartamento = ubi;
    }

    public void establecerPropietario(Propietario n) {
        propietario = n;
    }

    public void establecerPrecioMetro(double n) {
        PrecioMetro = n;
    }

    public void establecerNumeroMetro(double n) {
        numeroMetros = n;
    }

    public void establecerAlicuotaMensual() {
        alicuotaMensual = 0.18;
    }

    public void establecerCostoFinal() {
        costoFinal = (numeroMetros * PrecioMetro) + (alicuotaMensual * 12);
    }

    public void establecerBarrio(Barrio n) {
        barrio = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public void establecerNombreEdificio(String n) {
        nombreEdificio = n;
    }

    public void establecerUbicacionEdificio(String n) {
        ubicacionDepartamento = n;
    }

    public void establecerConstructora(Constructora n) {
        constructora = n;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public double obtenerPrecioMetro() {
        return PrecioMetro;
    }

    public double obtenerNumeroMetros() {
        return numeroMetros;
    }

    public double obtenerAlicuotaMensual() {
        return alicuotaMensual;
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

    public String obtenerNombreEdificio() {
        return nombreEdificio;
    }

    public String obtenerUbicacionEdificio() {
        return ubicacionDepartamento;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

    @Override
    public String toString() {
        String cadena = "\n\t\tREPORTE DEPARTAMENTO\n";
        cadena = String.format("%s\nNombre del Edificio: %s\n"
                + "Ubicación del Edificio: %s\n"
                + "Precio del Metro Cuadrado: %.2f\n"
                + "Número de metros Cuadrados: %.2f\n" 
                + "Valor de la Alícuota mensual: %.2f\n"
                + "Costo Final del Departamento: %.2f\n",cadena,
                obtenerNombreEdificio(),
                obtenerUbicacionEdificio(),
                obtenerPrecioMetro(),
                obtenerNumeroMetros(),
                obtenerAlicuotaMensual(),
                obtenerCostoFinal());
        cadena = String.format("%s\n----------------------------------------"
                + "----------------\n",cadena);
        return cadena;
    }
}
