/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_lab7;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KATHERINE
 */
class Mensajes extends Thread{
    //los mensajes tienen una dirección IP de origen, una dirección IP de destino, un título y un contenido.
    private String ip_origen;
    private String ip_destino;
    private String titulo;
    private String contenido;
    private boolean  avanzar;
    private boolean  vive;
    private JTable tabla;
    private LAN lan;

    public Mensajes(String ip_origen, String ip_destino, String titulo, String contenido,JTable tabla,LAN lan) {
        this.ip_origen = ip_origen;
        this.ip_destino = ip_destino;
        this.titulo = titulo;
        this.contenido = contenido;
        avanzar=true;
        vive=true;
        this.tabla=tabla;
        this.lan=lan;
    }

    public LAN getLan() {
        return lan;
    }

    public void setLan(LAN lan) {
        this.lan = lan;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public String getIp_origen() {
        return ip_origen;
    }

    public void setIp_origen(String ip_origen) {
        this.ip_origen = ip_origen;
    }

    public String getIp_destino() {
        return ip_destino;
    }

    public void setIp_destino(String ip_destino) {
        this.ip_destino = ip_destino;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
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
    

    @Override
    public String toString() {
        return titulo;
    }
    @Override
    public void run(){
        
        String estado1="Entregado";
        String estado2="Error";
        System.out.println(lan.getV_recepcion());
            if(avanzar){
                //recepcion de swicth
                try {
                    Thread.sleep(lan.getV_recepcion()*1000);
                    
                    } catch (InterruptedException e) {
                }
                 
                Object row[] ={titulo,lan.getNombre(),lan.getV_recepcion(),"Entregado"};
//          
                DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
                modelo.addRow(row);
                tabla.setModel(modelo);
                
                
               
//            //transcicion de swicth
               try {
                    Thread.sleep(lan.getV_transmicion()*1000);
                } catch (InterruptedException e) {
                }
               //recepcion receptor
               Object row2[] ={titulo,"PC con IP:"+ip_destino,lan.getV_transmicion(),"Entregado"};
//          
            modelo.addRow(row2);
            tabla.setModel(modelo);
                try {
                    Thread.sleep(300);
                           
                } catch (InterruptedException e) {
                }
//               
            }
    }
}


