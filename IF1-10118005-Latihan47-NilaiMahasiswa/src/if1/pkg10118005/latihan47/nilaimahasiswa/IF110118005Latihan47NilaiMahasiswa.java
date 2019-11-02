/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan nilai mahasiswa beserta keterangan dan juga indexnya
 */
public class IF110118005Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nilai nilai = new Nilai();
        nilai.setQuiz(75);
        nilai.setUts(45);
        nilai.setUas(34);
        System.out.println("QUIZ     = " + nilai.getQuiz());
        System.out.println("UTS      = " + nilai.getUts());
        System.out.println("UAS     = " + nilai.getUas() + "\n");
        System.out.println("Nilai Akhir = " + nilai.NilaiAkhir()+ "\n");
        System.out.println("Index     = " + nilai.NilaiIndex(nilai.NilaiAkhir()));
        System.out.println("Keterangan = " + nilai.IndexKeterangan(nilai.NilaiIndex(nilai.NilaiAkhir())));
        System.out.println("==============================================");
        
        nilai.setQuiz(60);
        nilai.setUts(80);
        nilai.setUas(75);
        System.out.println("QUIZ     = " + nilai.getQuiz());
        System.out.println("UTS      = " + nilai.getUts());
        System.out.println("UAS     = " + nilai.getUas() + "\n");
        System.out.println("Nilai Akhir = " + nilai.NilaiAkhir()+ "\n");
        System.out.println("Index     = " + nilai.NilaiIndex(nilai.NilaiAkhir()));
        System.out.println("Keterangan = " + nilai.IndexKeterangan(nilai.NilaiIndex(nilai.NilaiAkhir())));
        System.out.println("==============================================");
        
        nilai.setQuiz(30);
        nilai.setUts(80);
        nilai.setUas(40);
        System.out.println("QUIZ     = " + nilai.getQuiz());
        System.out.println("UTS      = " + nilai.getUts());
        System.out.println("UAS     = " + nilai.getUas() + "\n");
        System.out.println("Nilai Akhir = " + nilai.NilaiAkhir()+ "\n");
        System.out.println("Index     = " + nilai.NilaiIndex(nilai.NilaiAkhir()));
        System.out.println("Keterangan = " + nilai.IndexKeterangan(nilai.NilaiIndex(nilai.NilaiAkhir())));
        
        
    }
    
}
