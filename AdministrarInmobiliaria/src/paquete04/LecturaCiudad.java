/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class LecturaCiudad {

    private ObjectInputStream entrada;
    private ArrayList<Ciudad> propietario;
    private String nombreArchivo;
    private String identificador;
    private Ciudad ciudadBuscar;

    public LecturaCiudad(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo.");

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerListaCiudad() {
        // 
        propietario = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();
                    propietario.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    // System.err.println("No hay datos en el archivo: " + ex);
                    break;
                }
            }
        }

    }
        public void establecerIdentificador(String n) {
        identificador = n;
    }
    
    public void establecerCiudadBuscar() {
        
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();
                    
                    if(registro.obtenerNombreCiudad().equals(identificador)){
                        ciudadBuscar = registro;
                        break;
                    }
                    
                } catch (EOFException endOfFileException) {
                    return;

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

    public ArrayList<Ciudad> obtenerListaCiudad() {
        return propietario;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerIdentificador() {
        return identificador;
    }

    public Ciudad obtenerCiudadBuscar() {
        return ciudadBuscar;
    }
    

    @Override
    public String toString() {
        String cadena = "\t\tLISTA DE CIUDADES\n";
        for (int i = 0; i < obtenerListaCiudad().size(); i++) {
            cadena = String.format("%s%s - %s\n",cadena
                    , obtenerListaCiudad().get(i).obtenerNombreCiudad()[i]
                    , obtenerListaCiudad().get(i).obtenerNombreProvincia()[i]);
        }
        return cadena;
    }

    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método cerrarArchivo
}
