/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17april;

/**
 *
 * @author BRAVO 15
 */
public class MainHewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan hewanku=new Hewan("Makhluk hidup");
        Kucing kucingku=new Kucing("Shiroko");
        Anjing anjingku=new Anjing("bahlil");
        
        System.out.println("\nTampilkan akses superclass Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        
        System.out.println("\nTampilkan akses subclass kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        System.out.println("\nTampilkan akses subclass Anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
        
    }
    
}
