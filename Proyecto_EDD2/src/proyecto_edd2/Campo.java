/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_edd2;

/**
 *
 * @author usuario
 */
public class Campo {
    
    private String nombre;
    private String tipo;
    private int longitud;
    private boolean llave;

    public Campo(String nombre, String tipo, int longitud, boolean llave) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
        this.llave = llave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isLlave() {
        return llave;
    }

    public void setLlave(boolean llave) {
        this.llave = llave;
    }

    @Override
    public String toString() {
        String numero_llave = "";
        if (llave) {
            numero_llave = "0";
        } else {
            numero_llave = "1"; 
        }
        return nombre + ";" + tipo + ";" + longitud + ";" + numero_llave + ";";
    }
    
}