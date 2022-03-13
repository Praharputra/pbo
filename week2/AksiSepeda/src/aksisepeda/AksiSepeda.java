/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aksisepeda;

/**
 *
 * @author user
 */
public class AksiSepeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        //membuat objek
    Sepeda sepedaBalap = new Sepeda(); 
 
         //mengakses atribut dan method
    int gearSepeda = sepedaBalap.gear; 
    System.out.println(gearSepeda); 
    sepedaBalap.ngerem();
    }
}
