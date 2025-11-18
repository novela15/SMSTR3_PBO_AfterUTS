/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum11_2;

/**
 *
 * @author lenovo
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Kelas Klub. Ini adalah 'induk' dalam Agregasi.
 * Memiliki daftar anggota (agregasi)[cite: 92].
 */
public class Klub {
    private String namaKlub; // Menyimpan nama klub [cite: 103]
    // Hubungan Agregasi: Klub memiliki daftar Anggota [cite: 92, 104]
    private List<Anggota> anggotaList; 

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub; // Inisialisasi nama klub [cite: 109]
        // Inisialisasi daftar anggota [cite: 110]
        this.anggotaList = new ArrayList<>(); 
    }

    public void tambahAnggota(Anggota anggota) {
        // Menambahkan Anggota ke daftar [cite: 112]
        anggotaList.add(anggota); 
    }
    
    // Metode untuk mensimulasikan penghapusan/pembubaran klub
    public void bubarkanKlub() {
        System.out.println("\n[Aksi] Klub '" + this.namaKlub + "' dibubarkan.");
        // Dalam Agregasi, AnggotaList dibersihkan, tetapi objek Anggota 
        // yang direferensikan (misalnya Budi dan Siti) TIDAK ikut hilang.
        this.anggotaList.clear();
        System.out.println("Daftar anggota di klub dihapus, tetapi objek Anggota masih eksis (Prinsip Agregasi).");
    }

    public void infoKlub() {
        System.out.println("Nama Klub: " + namaKlub); // Menampilkan nama klub [cite: 115]
        System.out.println("Daftar Anggota Klub:");
        for (Anggota anggota : anggotaList) {
            anggota.infoAnggota(); // Memanggil info setiap anggota [cite: 119]
        }
    }
}
