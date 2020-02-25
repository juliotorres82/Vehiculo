/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphone;

import static java.time.Clock.system;

/**
 *
 * @author BETTY
 */
public class smartphone1 {
    
    private String tamanio;
    private float almacenamiento;
    private String volumen;

    public smartphone1(String tamanio, float almacenamiento, String volumen) {
        this.tamanio = tamanio;
        this.almacenamiento = almacenamiento;
        this.volumen = volumen;
    }

    public smartphone1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getProcesador() {
        return volumen;
    }

    public void setProcesador(String volumen) {
        this.volumen = volumen;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    
    public void mostrarVolumen() {
        system.out.println (this.volumen + "El volumen es:");
        
                
    
    } 
           
   public void mostrarTamanio() {
       system.out.println (this.tamanio + "El tamaño es:");
       
       
   }
    
    public void mostrarAlmacenamiento {
        system.out.println (this.almacenamiento + "El almacenamiento es de:");
   
    
    
    
}
    
    
}
