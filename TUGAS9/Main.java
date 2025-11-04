/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TUGAS9;

/**
 *
 * @author Novela
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Hewan kucingSaya = new Kucing(); 
        Hewan anjingSaya = new Anjing();
        
        // Memanggil metode suara() yang sudah diimplementasikan oleh masing-masing subclass
        kucingSaya.suara(); 
        anjingSaya.suara(); 
    }
}
