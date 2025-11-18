/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum11_2;

/**
 *
 * @author Novela
 */
public class Anggota {
    private String nama; // Menyimpan nama anggota [cite: 94]

    public Anggota(String nama) {
        this.nama = nama; // Konstruktor untuk menginisialisasi nama [cite: 96]
    }

    public void infoAnggota() {
        // Menampilkan nama anggota [cite: 99]
        System.out.println("Nama Anggota: " + nama);
    }
}