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
public class admi_router {
     private ArrayList<Router> lista_router=new ArrayList();
    private File archivo=null;

    public admi_router() {
    }
    
     public admi_router(String path) {
        archivo=new File(path);
    }

    public ArrayList<Router> getLista_router() {
        return lista_router;
    }

    public void setLista_router(ArrayList<Router> lista_router) {
        this.lista_router = lista_router;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
      public void setRouter(Router rou){
        lista_router.add(rou);
    }
      public void cargarArchivo(){
        try {
         lista_router=new ArrayList();
         Router temp;
         if(archivo.exists()){
             FileInputStream entrada
                     =new FileInputStream(archivo);
             ObjectInputStream objeto=new ObjectInputStream(entrada);
             try {
                 System.out.println("hola");
                 while((temp=(Router)objeto.readObject())!=null){
                     System.out.println("holaaaaaaaaaaaaa");
                     lista_router.add(temp);
                     
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
         for (Router t : lista_router) {
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
