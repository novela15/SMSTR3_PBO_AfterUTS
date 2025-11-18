/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum11;

/**
 *
 * @author Novela
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Kelas Perpustakaan. 
 * Ini adalah 'induk' dalam Komposisi dengan Buku. 
 * Objek Buku dikelola (biasanya dibuat dan dihancurkan) oleh Perpustakaan.
 */
public class Perpustakaan {
    private List<Buku> bukuList; // Atribut daftar buku

    // Dalam Komposisi, objek bagian (Buku) sering dibuat/dikelola 
    // di dalam objek induk (Perpustakaan) atau melalui metode-metodenya.
    public Perpustakaan() {
        // Inisialisasi daftar buku. Objek Buku baru akan disimpan di sini.
        this.bukuList = new ArrayList<>(); 
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku); // Menambahkan buku ke perpustakaan
    }

    public void infoPerpustakaan() {
        System.out.println("=== Informasi Perpustakaan ===");
        if (bukuList.isEmpty()) {
            System.out.println("Perpustakaan ini kosong.");
            return;
        }

        System.out.println("Daftar Buku:");
        for (Buku buku : bukuList) {
            buku.infoBuku();
            System.out.println("-------------------------");
        }
    }
    
    // Metode untuk mensimulasikan penghapusan Perpustakaan
    public void hapusPerpustakaan() {
        System.out.println("\n[Aksi] Perpustakaan dihapus.");
        // Karena komposisi, Buku juga "dihancurkan" (dibuat tidak dapat diakses)
        this.bukuList = null; 
        System.out.println("Semua Buku dalam perpustakaan juga ikut hilang/dihapus (Prinsip Komposisi).");
    }
}