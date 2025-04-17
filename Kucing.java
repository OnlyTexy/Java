/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg17april;

/**
 *
 * @author BRAVO 15
 */
public class Kucing extends Hewan {
    
    public Kucing(String nama) {
        super(nama);
    }
    @Override
    public void bersuara(){
        System.out.println(nama+"Nyaw");
    }
    
}
