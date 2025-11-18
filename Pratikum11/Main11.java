/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum11;

/**
 *
 * @author Novela
 */
public class Main11 {
    public static void main(String[] args) {
        // --- 1. Demonstrasi Agregasi (Pengarang dan Buku) ---
        // Membuat objek Pengarang secara independen (bisa eksis sendiri)
        Pengarang novela = new Pengarang("Novela");
        Pengarang ela = new Pengarang("Elaeni");
        
        System.out.println("--- Demonstrasi Agregasi ---");
        novela.infoPengarang(); // Pengarang bisa dipanggil terpisah
        ela.infoPengarang();
        System.out.println("Pengarang tetap ada meskipun belum terikat ke Buku manapun.");
        System.out.println("\n");
        
        // --- 2. Demonstrasi Komposisi (Perpustakaan dan Buku) ---
        // Membuat objek Perpustakaan (Induk Komposisi)
        Perpustakaan perpustakaanKota = new Perpustakaan();

        // Membuat objek Buku (Bagian Komposisi), dan menghubungkannya dengan Pengarang (Agregasi)
        Buku buku1 = new Buku("Hidup Untuk Semangkuk Rawon", novela);
        Buku buku2 = new Buku("Datang Mengambil Luka, Pergi Meninggalkan Bahagia", ela);
        Buku buku3 = new Buku("Bulan Mengikat Matahari", novela); // Pengarang yang sama digunakan di Buku lain
        
        // Menambahkan buku ke perpustakaan (Komposisi)
        perpustakaanKota.tambahBuku(buku1);
        perpustakaanKota.tambahBuku(buku2);
        perpustakaanKota.tambahBuku(buku3);

        System.out.println("--- Demonstrasi Komposisi dan Agregasi ---");
        perpustakaanKota.infoPerpustakaan();
        
        // --- 3. Simulasikan Penghapusan Perpustakaan (Komposisi) ---
        perpustakaanKota.hapusPerpustakaan();
        
        // --- 4. Cek Keberadaan Objek Pengarang (Agregasi) ---
        System.out.println("\n[Cek] Apakah Pengarang masih eksis setelah Perpustakaan dihapus?");
        novela.infoPengarang(); 
        System.out.println("Pengarang 'Andrea Hirata' masih eksis karena dia adalah objek independen (Agregasi).");
    }
}