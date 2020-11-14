/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan47.nilaimahasiswa;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan GNilai mahasiswa
 */


public class PBOIF210119056Latihan47NilaiMahasiswa {

    public static void main(String[] args) {
        Ujian ujian = new Ujian(100,95,34);
        System.out.println("QUIZ\t\t= " + ujian.getQuis());
        System.out.println("UTS\t\t= " + ujian.getUts());
        System.out.println("UAS\t\t= " + ujian.getUas());
        System.out.println();
        System.out.println("Nilai Akhir\t= "+ujian.nilaiAkhir(ujian.getQuis(),ujian.getUts(),ujian.getUas()));
        System.out.println();
        System.out.println("Index = "+ujian.Index());
        System.out.println("Keterangan = "+ujian.keterangan());
        
    }
    
}
