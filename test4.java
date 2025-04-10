/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg27maret;

/**
 *
 * @author BRAVO 15
 */
public class test4 {
    
    public static void main(String[] args) {
        Tabungan tabungan1 = new Tabungan(1000);
        Tabungan tabungan2 = new Tabungan(500);

        System.out.println("Saldo Awal:");
        System.out.println("Tabungan 1: " + tabungan1);
        System.out.println("Tabungan 2: " + tabungan2);

        tabungan1.simpanUang(500);
        System.out.println("\nSetelah Menyimpan Uang 500 ke Tabungan 1:");
        System.out.println("Tabungan 1: " + tabungan1);

        boolean ambilBerhasil = tabungan1.ambilUang(300);
        System.out.println("\nMengambil Uang 300 dari Tabungan 1: " + (ambilBerhasil ? "Berhasil" : "Gagal"));
        System.out.println("Tabungan 1: " + tabungan1);

        boolean transferBerhasil = tabungan1.transfer(tabungan2, 200);
        System.out.println("\nTransfer 200 dari Tabungan 1 ke Tabungan 2: " + (transferBerhasil ? "Berhasil" : "Gagal"));
        System.out.println("Tabungan 1: " + tabungan1);
        System.out.println("Tabungan 2: " + tabungan2);

        boolean ambilGagal = tabungan2.ambilUang(1000);
        System.out.println("\nMengambil Uang 1000 dari Tabungan 2: " + (ambilGagal ? "Berhasil" : "Gagal"));
        System.out.println("Tabungan 2: " + tabungan2);
    }
}

