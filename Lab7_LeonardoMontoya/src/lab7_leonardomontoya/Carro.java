/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_leonardomontoya;

import java.util.ArrayList;

/**
 *
 * @author Inspiron
 */
public class Carro {
    String nombre;
    ArrayList<pieza> piezas = new ArrayList();

    public Carro(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<pieza> piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
