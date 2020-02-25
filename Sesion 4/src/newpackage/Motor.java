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
public class Motor {
    
    private float diametro;
    private float caballosDeFuerza;
    private int cilindros;

    public Motor(float diametro, float caballosDeFuerza, int cilindros) {
        this.diametro = diametro;
        this.caballosDeFuerza = caballosDeFuerza;
        this.cilindros = cilindros;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(float caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }
    public void encender () {
        System.out.println("encendiendo Motor");
    }
    public void acelerar ()
    {
        System.out.println("acelerando Motor");
    }
}
