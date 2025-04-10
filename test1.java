/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg27maret;

/**
 *
 * @author BRAVO 15
 */
public class test1 {
    
    public static void main(String[] args) {
        // Membuat objek pertama menggunakan konstruktor default
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        System.out.println("Objek 1 -> Panjang: " + pp1.getPanjang() + ", Lebar: " + pp1.getLebar());
        System.out.println("Luas: " + pp1.getLuas() + ", Keliling: " + pp1.getKeliling());

        // Membuat objek kedua menggunakan konstruktor dengan parameter
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(10, 5);
        System.out.println("\nObjek 2 -> Panjang: " + pp2.getPanjang() + ", Lebar: " + pp2.getLebar());
        System.out.println("Luas: " + pp2.getLuas() + ", Keliling: " + pp2.getKeliling());

        // Mengubah nilai panjang dan lebar objek pertama
        pp1.setPanjang(7);
        pp1.setLebar(4);
        System.out.println("\nSetelah diubah:");
        System.out.println("Objek 1 -> Panjang: " + pp1.getPanjang() + ", Lebar: " + pp1.getLebar());
        System.out.println("Luas: " + pp1.getLuas() + ", Keliling: " + pp1.getKeliling());

        // Menampilkan jumlah objek yang dibuat
        System.out.println("\nJumlah objek yang dibuat: " + PersegiPanjangEnkapsulasi.getJumlahObjek());
    }
}

   
    

