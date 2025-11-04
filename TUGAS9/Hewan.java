/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS9;

/**
 *
 * @author Novela
 */
abstract class Hewan {
    // Metode abstrak, wajib diimplementasikan oleh subclass
    abstract void suara();
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara: Meong"); // Output yang diharapkan [cite: 95]
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara: Guk Guk"); // Output yang diharapkan [cite: 96]
    }
}
