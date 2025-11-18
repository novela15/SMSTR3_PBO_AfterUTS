/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum10;

/**
 *
 * @author Novela
 */
public class Main10 {
    public static void main(String[] args) {
        // Objek Penjumlahan
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " +
                           penjumlahan.hitung(10, 5)); 

        // Objek Pengurangan
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan: " +
                           pengurangan.hitung(10, 5)); 
    }
}
