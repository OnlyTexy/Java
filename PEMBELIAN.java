/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12maret;


import java.util.Scanner;

public class PEMBELIAN {
    public static void main(String[] args) {
        int nX, nY, nZ;
        double totalX, totalY, totalZ, diskonX = 0, diskonY = 0 , diskonZ = 0;
        final int hargaX = 40000, hargaY = 50000, hargaZ = 60000;
        Scanner inn = new Scanner(System.in);

        System.out.println("-- Pembelian Kotak Susu --");
        System.out.print("Jumlah Merk X: ");
        nX = inn.nextInt();
        System.out.print("Jumlah Merk Y: ");
        nY = inn.nextInt();
        System.out.print("Jumlah Merk Z: ");
        nZ = inn.nextInt();

        totalX = nX * hargaX;
        totalY = nY * hargaY;
        totalZ = nZ * hargaZ;

        if (nX >= 3)
            diskonX = totalX * 0.10;
        if (nY > 3)
            diskonY = totalY * 0.12;
        if (nZ > 1)
            diskonZ = (nZ - 1) * hargaZ * 0.15;
        
        double totalDiskon = diskonX + diskonY + diskonZ;
        double totalPembelian = totalX + totalY + totalZ;
        double totalBayar = totalPembelian - totalDiskon;
        
        System.out.println("Total pembelian : Rp. " + totalPembelian);
        System.out.println("Total diskon    : Rp. " + totalDiskon);
        System.out.println("Total pembayaran: Rp. " + totalBayar);
    }
}

