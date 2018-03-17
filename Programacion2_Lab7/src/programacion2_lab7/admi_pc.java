/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_lab7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class admi_pc {
    private ArrayList<PC> lista_pc=new ArrayList();
    private File archivo=null;

     public admi_pc(String path) {
        archivo=new File(path);
    }

    public ArrayList<PC> getLista_pc() {
        return lista_pc;
    }

    public void setLista_pc(ArrayList<PC> lista_pc) {
        this.lista_pc = lista_pc;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
      //mutador extra
    public void setPc(PC pc){
        lista_pc.add(pc);
    }
     public void cargarArchivo(){
        try {
         lista_pc=new ArrayList();
         PC temp;
         if(archivo.exists()){
             FileInputStream entrada
                     =new FileInputStream(archivo);
             ObjectInputStream objeto=new ObjectInputStream(entrada);
             try {
                 while((temp=(PC)objeto.readObject())!=null){
                     lista_pc.add(temp);
                 }
             } catch (EOFException e) {
                 //ENCONTRO EL FINAL DEL ARCHIVO
             }
             objeto.close();
             entrada.close();
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
    
}
     public void escribirArchivo(){
         FileOutputStream fw=null;
     ObjectOutputStream bw=null;
     
     try {
         
         fw=new FileOutputStream(archivo,true);
         bw=new ObjectOutputStream(fw);
         for (PC t : lista_pc) {
             bw.writeObject(t);
             
         }
         bw.flush();
         
         
     } catch (Exception ex) {
     }finally{
         try {
             bw.close();
             fw.close();
         } catch (Exception e) {
         }
     }
 }
    }

