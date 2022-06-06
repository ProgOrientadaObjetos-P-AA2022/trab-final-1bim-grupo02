/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

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
public class LecturaPropietario {

    private ObjectInputStream entrada;
    private ArrayList<Propietario> propietario;
    private String nombreArchivo;
    private String identificador;
    private Propietario PropietarioBuscado;

    public LecturaPropietario(String n) {
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

    public void establecerListaPropietario() {
        // 
        propietario = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Propietario registro = (Propietario) entrada.readObject();
                    propietario.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo

                } catch (IOException e) {
                    System.err.println("Error al leer el archivo: " + e);
                } catch (ClassNotFoundException e) {
                    System.err.println("No se pudo crear el objeto: " + e);
                } catch (Exception e) {
                    System.err.println("No hay datos en el archivo: " + e);
                    break;
                }
            }
        }

    }

    public void establecerIdentificador(String a) {
        identificador = a;
    }

    public void establecerPropietarioBuscado() {
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Propietario registro = (Propietario) entrada.readObject();

                    if (registro.obtenerIdentificacion().equals(identificador)) {
                        PropietarioBuscado = registro;
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

    public ArrayList<Propietario> obtenerListaPropietario() {
        return propietario;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerIdentificador() {
        return identificador;
    }

    public Propietario obtenerPropietarioBuscado() {
        return PropietarioBuscado;
    }

    @Override
    public String toString() {
        String cadena = "\t\tLISTA DE PROPIETARIOS\n";
        for (int i = 0; i < obtenerListaPropietario().size(); i++) {
            System.out.println(i);
            cadena = String.format("%s%s; %s; %s\n", cadena,
                    obtenerListaPropietario().get(i).obtenerNombre()[i],
                    obtenerListaPropietario().get(i).obtenerApellido()[i],
                    obtenerListaPropietario().get(i).obtenerIdentificacion()[i]);
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
