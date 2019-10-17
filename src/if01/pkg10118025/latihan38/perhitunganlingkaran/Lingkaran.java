/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01estu
 */
public class Lingkaran {
    public double diameter;
    public double jariJari;

    Scanner scan = new Scanner(System.in);

    public void validasi() {
        String dmt;
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            dmt = scan.nextLine();
            System.out.println((!dmt.matches("[0-9]*")) ? "Nilai Diameter Tidak Sesuai" : "");
        } while (!dmt.matches("[0-9]*"));
        diameter = Double.parseDouble(dmt);
    }

    public double hitungJariJari(double parDiameter) {
        return parDiameter / 2;
    }

    public double luasLingkaran(double parJariJari) {
        return Math.PI * parJariJari * parJariJari;
    }

    public double kelilingLingkaran(double parJariJari) {
        return 2 * Math.PI * parJariJari;
    }

    public void tampil(double parDiameter) {
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-Jari Lingkaran: %.2f", hitungJariJari(parDiameter));
        System.out.printf("%nLuas Lingkaran: %.2f", luasLingkaran(hitungJariJari(parDiameter)));
        System.out.printf("%nKeliling Lingkaran: %.2f%n", kelilingLingkaran(hitungJariJari(parDiameter)));
    }
}
