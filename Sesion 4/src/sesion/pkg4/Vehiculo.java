/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion.pkg4;

import newpackage.Chasis;
import newpackage.Llanta;
import newpackage.Motor;

/**
 *
 * @author BETTY
 */
public class Vehiculo {

    
    private String marca;
    private float velocidad;
    private String modelo;
    private Llanta tamanio;
    private Llanta llan1;
    private Llanta llan2;
    private Llanta llan3;
    private Llanta llan4;
    private Motor potencia;
    private Motor cilindros;
    private Chasis resistencia;

    public Vehiculo(String marca, float velocidad, String modelo, Llanta tamanio, Llanta llan1, Llanta llan2, Llanta llan3, Llanta llan4, Motor potencia, Motor cilindros, Chasis resistencia) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.tamanio = tamanio;
        this.llan1 = llan1;
        this.llan2 = llan2;
        this.llan3 = llan3;
        this.llan4 = llan4;
        this.potencia = potencia;
        this.cilindros = cilindros;
        this.resistencia = resistencia;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Llanta getTamanio() {
        return tamanio;
    }

    public void setTamanio(Llanta tamanio) {
        this.tamanio = tamanio;
    }

    public Llanta getLlan1() {
        return llan1;
    }

    public void setLlan1(Llanta llan1) {
        this.llan1 = llan1;
    }

    public Llanta getLlan2() {
        return llan2;
    }

    public void setLlan2(Llanta llan2) {
        this.llan2 = llan2;
    }

    public Llanta getLlan3() {
        return llan3;
    }

    public void setLlan3(Llanta llan3) {
        this.llan3 = llan3;
    }

    public Llanta getLlan4() {
        return llan4;
    }

    public void setLlan4(Llanta llan4) {
        this.llan4 = llan4;
    }

    public Motor getPotencia() {
        return potencia;
    }

    public void setPotencia(Motor potencia) {
        this.potencia = potencia;
    }

    public Motor getCilindros() {
        return cilindros;
    }

    public void setCilindros(Motor cilindros) {
        this.cilindros = cilindros;
    }

    public Chasis getResistencia() {
        return resistencia;
    }

    public void setResistencia(Chasis resistencia) {
        this.resistencia = resistencia;
    }

    public void getLlan1(String lanta1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getModelo(String x4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
