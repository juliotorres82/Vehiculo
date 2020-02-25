/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo2;

import static java.lang.System.out;
import sesion.pkg4.Vehiculo;

/**
 *
 * @author BETTY
 */
public class TextVehiculo {

    /**
     *
     * @param Args
     */
    public static void main (String []Args){
       Vehiculo vel1= Vehiculo ();
       
       vel1.setMarca ("Nisan");
       vel1.getLlan1("Lanta1");
       vel1.getModelo("4x4");
        System.out.println(vel1.getCilindros().getCaballosDeFuerza());
   }

    private static Vehiculo Vehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
