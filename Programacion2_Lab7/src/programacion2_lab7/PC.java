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
public class PC implements Serializable{
    //PC’S que tienen una dirección IP, 
//    una máscara, un Gateway (el Gateway debe ser la dirección IP del router asignado a ese switch) y una lista de mensajes.
    private String IP;
    private String mascara;
    private String gateway_ip;
    
    private ArrayList<Mensajes> mensajes=new ArrayList();
private static final long SerialVersionUID=777L;//version
    public PC() {
    }

    public PC(String IP, String mascara, String gateway_ip) {
        this.IP = IP;
        this.mascara = mascara;
        this.gateway_ip = gateway_ip;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getGateway_ip() {
        return gateway_ip;
    }

    public void setGateway_ip(String gateway_ip) {
        this.gateway_ip = gateway_ip;
    }

    public ArrayList<Mensajes> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensajes> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "PC "+IP;
    }
    
    
    
}
