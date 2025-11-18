/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum11_2;

/**
 *
 * @author lenovo
 */
public class Main11_2 {
    public static void main(String[] args) {
        
        // 1. Membuat objek Anggota secara independen (Bagian)
        // Objek Budi dan Siti memiliki kehidupannya sendiri.
        Anggota nopel = new Anggota("Nopel"); 
        Anggota cocoa = new Anggota("cocoa");

        System.out.println("--- 1. Keberadaan Anggota Independen ---");
        nopel.infoAnggota(); // Anggota bisa eksis tanpa klub
        cocoa.infoAnggota();
        
        // 2. Membuat objek Klub (Induk Agregasi)
        Klub klubCoding = new Klub("Klub Coding Java"); 

        // 3. Menambahkan anggota ke klub
        klubCoding.tambahAnggota(nopel);
        klubCoding.tambahAnggota(cocoa);

        System.out.println("\n--- 2. Informasi Klub dan Anggota ---");
        klubCoding.infoKlub();
        
        // 4. Mensimulasikan penghapusan Klub (Induk)
        klubCoding.bubarkanKlub();
        
        // 5. Mengecek kembali keberadaan Anggota (Bagian)
        System.out.println("\n--- 3. Cek Keberadaan Anggota Setelah Klub Dibubarkan ---");
        // Meskipun klub sudah bubar, Anggota (Budi dan Siti) tetap ada.
        nopel.infoAnggota(); 
        cocoa.infoAnggota(); 
        System.out.println("Anggota tetap eksis karena mereka adalah objek independen (prinsip Agregasi).");
    }
}
