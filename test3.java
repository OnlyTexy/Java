/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg27maret;

/**
 *
 * @author BRAVO 15
 */
public class test3 {
 
    public static void main(String[] args) {
        Tabungan tabungan1 = new Tabungan(1500);
        Tabungan tabungan2 = new Tabungan(3000);

        Nasabah diddy = new Nasabah("Diddy", "Conbuzer");
        Nasabah budi = new Nasabah("Budi", "Arie");

        System.out.println("Informasi Nasabah Sebelum Menambahkan Tabungan:");
        System.out.println(diddy);
        System.out.println(budi);

        diddy.setTabungan(tabungan1);
        budi.setTabungan(tabungan2);

        System.out.println("\nInformasi Nasabah Setelah Menambahkan Tabungan:");
        System.out.println(diddy);
        System.out.println(budi);

        System.out.println("\nSaldo Tabungan:");
        System.out.println(diddy.getTabungan().getSaldo());
        System.out.println(budi.getTabungan().getSaldo());
    }
}

