/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12maret;

import java.util.Scanner;

public class MUTKOMB {
    public static void main(String[] args) {
        int n, r, i;
        int mutasi=1, kombi=1, x=1;

        Scanner inn = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.print("Maasukkan nilai n: ");
        n = inn.nextInt();
        System.out.print("Maasukkan nilai r: ");
        r = inn.nextInt();
        System.out.println("===================");

        for (i=n; i>(n-r); i--) {
            mutasi *= i;
        }
        for (i=r; i>1; i--) {
            x *= i;
        }

        kombi = mutasi / x;

        System.out.println("Nilai Permutasi: "+mutasi);
        System.out.println("Nilai Kombinasi: "+kombi);
        System.out.println("--------------------");
    }
}
