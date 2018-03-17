/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_lab7;

import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class LAN {
    private Ventana_LAN ventana_lan;
    private String nombre;
    private int v_transmicion;
    private int v_recepcion;
    private Router router;
    private ArrayList <PC> pc=new ArrayList();

    public LAN() {
    }
    
    
    
            //nombre, velocidad de transmisión, velocidad de recepción, un router al que esta conectado y una lista de PC’s

    public LAN(Ventana_LAN ventana_lan, String nombre, int v_transmicion, int v_recepcion) {
        this.ventana_lan = ventana_lan;
        this.nombre = nombre;
        this.v_transmicion = v_transmicion;
        this.v_recepcion = v_recepcion;
    }

    public Ventana_LAN getVentana_lan() {
        return ventana_lan;
    }

    public void setVentana_lan(Ventana_LAN ventana_lan) {
        this.ventana_lan = ventana_lan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getV_transmicion() {
        return v_transmicion;
    }

    public void setV_transmicion(int v_transmicion) {
        this.v_transmicion = v_transmicion;
    }

    public int getV_recepcion() {
        return v_recepcion;
    }

    public void setV_recepcion(int v_recepcion) {
        this.v_recepcion = v_recepcion;
    }

    public Router getRouter() {
        return router;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    public ArrayList<PC> getPc() {
        return pc;
    }

    public void setPc(PC pc1) {
        this.pc.add(pc1);
    }

    @Override
    public String toString() {
        return nombre+"-"+v_recepcion+"-"+v_transmicion;
    }
            
}
