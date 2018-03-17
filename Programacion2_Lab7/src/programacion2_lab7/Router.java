/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_lab7;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class Router implements Serializable{

    //que tienen una dirección IP, una máscara, un switch al que está asignado,
//    un protocolo, una velocidad de transmisión, velocidad de recepción y una lista de routers a los que están conectados.4
    private String ip_router;
    private String mascara;
   private  LAN lan;
   private int v_trans;
   private int v_recep;
   private Router rou;
   private ArrayList<Router> routers=new ArrayList();
private static final long SerialVersionUID=777L;//version
    public Router() {
    }

    public Router(String ip_router, String mascara, LAN lan, int v_trans, int v_recep) {
        this.ip_router = ip_router;
        this.mascara = mascara;
        this.lan = lan;
        this.v_trans = v_trans;
        this.v_recep = v_recep;
    }

    public Router getRou() {
        return rou;
    }

    public void setRou(Router rou) {
        this.rou = rou;
    }

   

    public String getIp_router() {
        return ip_router;
    }

    public void setIp_router(String ip_router) {
        this.ip_router = ip_router;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public LAN getLan() {
        return lan;
    }

    public void setLan(LAN lan) {
        this.lan = lan;
    }

   

    public int getV_trans() {
        return v_trans;
    }

    public void setV_trans(int v_trans) {
        this.v_trans = v_trans;
    }

    public int getV_recep() {
        return v_recep;
    }

    public void setV_recep(int v_recep) {
        this.v_recep = v_recep;
    }

    public ArrayList<Router> getRouters() {
        return routers;
    }

    public void setRouters(ArrayList<Router> routers) {
        this.routers = routers;
    }

    @Override
    public String toString() {
        return "Router";
    }
   
   
    
}
