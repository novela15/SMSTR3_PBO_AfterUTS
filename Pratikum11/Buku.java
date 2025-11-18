/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum11;

/**
 *
 * @author Novela
 */
public class Buku {
    private String judul;
    // Hubungan Agregasi: Buku memiliki Pengarang
    // Objek Pengarang diinisialisasi di luar dan dilewatkan ke Buku
    private Pengarang pengarang; 

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang; // Agregasi
    }

    public void infoBuku() {
        System.out.println("   Judul Buku: " + judul);
        // Menampilkan info Pengarang yang diagregasi
        if (pengarang != null) {
            pengarang.infoPengarang(); 
        } else {
            System.out.println("   Pengarang: Tidak diketahui");
        }
    }
}
