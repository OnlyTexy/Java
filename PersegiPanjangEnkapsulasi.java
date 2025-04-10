/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg27maret;

/**
 *
 * @author BRAVO 15
 */
public class PersegiPanjangEnkapsulasi {
    
  private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
   // Konstruktor default
    public PersegiPanjangEnkapsulasi() {
    this.panjang = 0;
   this.lebar = 0;
    jumlahObjek++;
    }
    
   // Konstruktor dengan parameter
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru){
    this.panjang = panjangBaru;
    this.lebar = lebarBaru;
    jumlahObjek++;
    }
   
   // Setter dan getter untuk panjang
 public void setPanjang(int panjangBaru){
    this.panjang = panjangBaru;
    }
    
   public int getPanjang() {
    return panjang;
    }
    
   // Setter dan getter untuk lebar
    public void setLebar(int lebarBaru){
    this.lebar = lebarBaru;
  }
    
   public int getLebar() {
    return lebar;
    }
    
   // Getter untuk jumlah objek
    public static int getJumlahObjek() {
    return jumlahObjek;
    }
    
   // Method untuk menghitung luas
    public int getLuas() {
    return panjang * lebar;
    }
   
   // Method untuk menghitung keliling
    public int getKeliling() {
   return 2 *(panjang + lebar); 
    }
}
