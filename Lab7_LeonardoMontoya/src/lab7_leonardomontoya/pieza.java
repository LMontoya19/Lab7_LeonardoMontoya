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
public class pieza {

    Object padre;
    ArrayList<pieza> hijos = new ArrayList();
    String nombre;
    String material;
    int tiempo;

    public pieza(Object padre, String nombre, String material, int tiempo) {
        this.padre = padre;
        this.nombre = nombre;
        this.material = material;
        this.tiempo = tiempo;
    }

    public Object getPadre() {
        return padre;
    }

    public void setPadre(Object padre) {
        this.padre = padre;
    }

    public ArrayList<pieza> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<pieza> hijos) {
        this.hijos = hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
