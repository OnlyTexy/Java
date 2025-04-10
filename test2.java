/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg27maret;

/**
 *
 * @author BRAVO 15
 */
public class test2 {
    
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.tambahNasabah("Joni", "Bangunan");
        bank.tambahNasabah("Siti", "Kusmini");

        System.out.println("Jumlah Nasabah: " + bank.getJumlahNasabah());

        Tabungan tabungan1 = new Tabungan(1000);
        bank.tambahNasabah("Budi", "Arie", tabungan1);

        Tabungan tabungan2 = new Tabungan(500);
        bank.tambahNasabah("Budi", "Baskara", tabungan2);

        System.out.println("Daftar Nasabah:");
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            Nasabah nasabah = bank.getNasabah(i);
            System.out.println(nasabah);
        }

        int index = bank.searchNasabah("Budi", "Arie");
        if (index != -1) {
            System.out.println("Nasabah ditemukan: " + bank.getNasabah(index));
        } else {
            System.out.println("Nasabah tidak ditemukan.");
        }

        int[] hasilPencarian = bank.searchNasabah("Joni");
        System.out.println("Nasabah dengan nama awal 'Joni':");
        for (int i : hasilPencarian) {
            System.out.println(bank.getNasabah(i));
        }
    }
}

