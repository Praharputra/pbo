/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sepeda;

/**
 *
 * @author user
 */
public class Sepeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        private int jumlahRoda;
        private String jenis;
        private String merk;
        
        int gear = 5; 

        Sepeda(int jumlahRoda, String jenis, String merk){
        this.jumlahRoda = jumlahRoda;
        this.jenis = jenis;
        this.merk = merk;
}
 
    public void info(){
     System.out.println("Roda: " + this.jumlahRoda);
     System.out.println("jenis: " + this.jenis);
     System.out.println("merk: " + this.merk);
}

 
//ini adalah tempat method
    void ngerem() { 
    System.out.println("Sepeda direm");
    }

    public class Konstruktor{
public static void main(String[] args){
Sepeda sepedakuku = new Sepeda(2, "lipat", "polygon");
mobilku.info();
}}

}
