/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg17april;

public class testKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("=== Uji Class Kendaraan ===");
        Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.setNama("Sepeda");
        kendaraan1.setTahunProduksi(2010);
        kendaraan1.cetak();

        Kendaraan kendaraan = new Kendaraan("Motor", 2015);
        System.out.println("Nama: " + kendaraan.getNama());
        System.out.println("Tahun Produksi: " + kendaraan.getTahunProduksi());
        kendaraan.cetak();


        System.out.println("\n=== Uji Class Udara ===");
        Udara udara1 = new Udara();
        udara1.setNama("Paralayang");
        udara1.setTahunProduksi(2005);
        udara1.setMesin(false);
        udara1.cetak();

        Udara udara = new Udara("Helikopter", 2018, true);
        System.out.println("Nama: " + udara.getNama());
        System.out.println("Tahun Produksi: " + udara.getTahunProduksi());
        System.out.println("Mesin: " + (udara.getMesin() ? "Ya" : "Tidak"));
        udara.cetak();

    
        System.out.println("\n=== Uji Class Pesawat ===");
        Pesawat pesawat2 = new Pesawat();   
        pesawat2.reset("Pesawat Kecil", 2012, true, 30);
        pesawat2.cetak();

        Pesawat pesawat = new Pesawat("Lion Air 535", 2022, true, 500);
        System.out.println("Nama: " + pesawat.getNama());
        System.out.println("Tahun Produksi: " + pesawat.getTahunProduksi());
        System.out.println("Mesin: " + (pesawat.getMesin() ? "Ya" : "Tidak"));
        System.out.println("Muatan: " + pesawat.getMuatan());
        System.out.println("Kategori: " + pesawat.kategori(pesawat2.getMuatan()));
        pesawat.cetak();
    }


}