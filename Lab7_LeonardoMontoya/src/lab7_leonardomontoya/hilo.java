/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_leonardomontoya;

/**
 *
 * @author Inspiron
 */
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class hilo extends Thread {

    private JTable tabla;
    private boolean avanzar;
    private boolean vive;
    Carro c;
    ArrayList<pieza> lista = new ArrayList();
    tabla t = new tabla();
    
    public hilo(Carro c) {
        this.c = c;
        avanzar = true;
        vive = true;

    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public Carro getC() {
        return c;
    }

    public void setC(Carro c) {
        this.c = c;
    }

    public ArrayList<pieza> getLista() {
        return lista;
    }

    public void setLista(ArrayList<pieza> lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        ordenar(c, lista);
        t.setVisible(true);
        for (pieza object : lista) {
            try {
                Thread.sleep(object.getTiempo() * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Object[] newrow = {
                c.getNombre(),
                object.getNombre(),
                object.getTiempo(),};
            DefaultTableModel modelo = (DefaultTableModel) t.jTable1.getModel();
            modelo.addRow(newrow);
            t.jTable1.setModel(modelo);
        }
    }

    public void ordenar(Object praiz, ArrayList<pieza> piezasordenadas) {
        try {
            if (praiz instanceof Carro) {
                for (pieza p : ((Carro) praiz).getPiezas()) {
                    if (p.getHijos().isEmpty()) {
                        piezasordenadas.add(p);
                    } else {
                        ordenar(p, piezasordenadas);
                        piezasordenadas.add(p);
                    }
                }
            } else {

                for (pieza p2 : ((pieza) praiz).getHijos()) {
                    if (p2.getHijos().isEmpty()) {
                        piezasordenadas.add(p2);
                    } else {

                        ordenar(p2, piezasordenadas);
                        piezasordenadas.add(p2);
                    }

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
