/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author BETTY
 */
public class Chasis {
    
    private float peso;
    private float resistencia;
    private int tamanio;

    public Chasis(float peso, float resistencia, int tamanio) {
        this.peso = peso;
        this.resistencia = resistencia;
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getResistencia() {
        return resistencia;
    }

    public void setResistencia(float resistencia) {
        this.resistencia = resistencia;
    }
    
    public void sostener(){
        System.out.println("Sosteniendo");
    }
           
    
}
