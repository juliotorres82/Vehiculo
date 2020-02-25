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
public class Llanta {
    
    private int tamanio;
    private String modelo;
    private String marca;

    public Llanta(int tamanio, String modelo, String marca) {
        this.tamanio = tamanio;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void girar (){
        System.out.println("girando llanta");
    }
    public void detener() {
        System.out.println("deteniendo llanta");
    }
}
