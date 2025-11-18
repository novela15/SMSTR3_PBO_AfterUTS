/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPratikum10;

/**
 *
 * @author Novela
 */

import java.text.DecimalFormat;

public class Main10 {
    public static void main(String[] args) {

        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();
        
        DecimalFormat df = new DecimalFormat("#,###");

        // Elektronik
        double hargaLaptop = 10000000;
        double hargaTV = 20000000;

        double pajakLaptop = elektronik.hitungPajak(hargaLaptop);
        double pajakTV = elektronik.hitungPajak(hargaTV);

        double akhirLaptop = hargaLaptop + pajakLaptop;
        double akhirTV = hargaTV + pajakTV;

        System.out.println("Elektronik");
        System.out.println("Laptop");
        System.out.println("Harga       : " + hargaLaptop);
        System.out.println("Pajak       : " + pajakLaptop + " (10%)");
        System.out.println("Harga Akhir : " + akhirLaptop + "\n");

        System.out.println("TV");
        System.out.println("Harga       : " + hargaTV);
        System.out.println("Pajak       : " + pajakTV + " (10%)");
        System.out.println("Harga Akhir : " + akhirTV + "\n");

        // Makanan
        double hargaBuah = 10000;
        double hargaSayur = 5000;

        double pajakBuah = makanan.hitungPajak(hargaBuah);
        double pajakSayur = makanan.hitungPajak(hargaSayur);

        double akhirBuah = hargaBuah + pajakBuah;
        double akhirSayur = hargaSayur + pajakSayur;

        System.out.println("Makanan");
        System.out.println("Buah");
        System.out.println("Harga       : " + hargaBuah);
        System.out.println("Pajak       : " + pajakBuah + " (10%)");
        System.out.println("Harga Akhir : " + akhirBuah + "\n");

        System.out.println("Sayur");
        System.out.println("Harga       : " + hargaSayur);
        System.out.println("Pajak       : " + pajakSayur + " (10%)");
        System.out.println("Harga Akhir : " + akhirSayur);
    }
}