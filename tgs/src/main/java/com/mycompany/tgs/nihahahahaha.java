/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tgs;

import java.io.Serializable;

/**
 *
 * @author FADLI
 */
public class nihahahahaha implements Serializable {
    private int asep;
    private transient int subekhi;
    private static int slamet;
    private final int ningsih;
    public nihahahahaha (int asep, int subekhi, int slamet, int ningsih) {
        this.asep = asep;
        this.subekhi = subekhi;
        this.slamet = slamet;
        this.ningsih = ningsih;
    }
    public int getNonStaticVariable() {
        return asep;
    }
    public int getTransientVariable() {
        return subekhi;
    }
    public static int getStaticVariable() {
        return slamet;
    }
    public int getFinalVariable() {
        return ningsih;
    }
    public static void main(String[] args) {
        nihahahahaha obj = new nihahahahaha(1, 2, 3, 4);
        System.out.println("Non-static variable: " + obj.getNonStaticVariable());
        System.out.println("Transient variable: " + obj.getTransientVariable());
        System.out.println("Static variable: " + nihahahahaha.getStaticVariable());
        System.out.println("Final variable: " + obj.getFinalVariable());
        System.out.println("Perbedaan antara data member yang menggunakan dan tidak menggunakan keyword/access modifier tersebut adalah sebagai berikut:\n" +
"\n" +
"Non-static variable:\n" +
"\n" +
"Non-static variable (nonStaticVariable) tidak menggunakan modifier tambahan.\n" +
"Nilainya tidak terpengaruh oleh instance dari kelas. Setiap instance dari kelas akan memiliki salinan variabel yang berbeda.\n" +
"Transient variable:\n" +
"\n" +
"Transient variable (transientVariable) menggunakan modifier transient.\n" +
"Variabel ini tidak akan disertakan dalam proses serialisasi ketika objek di-serialize.\n" +
"Static variable:\n" +
"\n" +
"Static variable (staticVariable) menggunakan modifier static.\n" +
"Nilainya bersifat shared di seluruh instance dari kelas. Artinya, jika nilai diubah di satu instance, akan mempengaruhi nilai di instance lainnya.\n" +
"Final variable:\n" +
"\n" +
"Final variable (finalVariable) menggunakan modifier final.\n" +
"Setelah nilai variabel final diinisialisasi, nilai tersebut tidak dapat diubah lagi. Variabel final perlu diinisialisasi saat deklarasi atau dalam konstruktor, dan setelah itu nilainya tidak dapat diubah.");
        
    }
    
}
