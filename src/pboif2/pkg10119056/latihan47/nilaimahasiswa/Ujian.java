/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan47.nilaimahasiswa;

/**
 *
 * @author ACER
 */
public class Ujian{
    private float quis;
    private float uts;
    private float uas;
    private char index;
    private float nilaiAkhir;
    private String keterangan;
    
    Ujian(float quis, float uts, float uas){
        this.quis=quis;
        this.uas=uas;
        this.uts=uts;
        
    }

    public float getQuis() {
        return quis;
    }

    public float getUts() {
        return uts;
    }

    public float getUas() {
        return uas;
    }
    
    public float nilaiAkhir(float parQuis, float parUts, float parUas){
         nilaiAkhir=(float) (0.2*parQuis+0.3*parUts+0.5*parUas);
         return nilaiAkhir;
     }
    public char Index(){
         if(nilaiAkhir>80 & nilaiAkhir<100){
             index='A';
         }else if(nilaiAkhir>68 & nilaiAkhir<80){
             index='B';
         }else if(nilaiAkhir>56 & nilaiAkhir<68){
             index='C';
         }else if(nilaiAkhir>45 & nilaiAkhir<56){
             index='D';
         }else if(nilaiAkhir>0 & nilaiAkhir<45){
             index='E';
         }

         return index;
     }
     
    public String keterangan(){
        switch (index) {
            case 'A':
                keterangan="Sangat Baik";
                break;
            case 'B':
                keterangan="Baik";
                break;
            case 'C':
                keterangan="Cukup";
                break;
            case 'D':
                keterangan="Kurang";
                break;
            case 'E':
                keterangan="Sangat Kurang";
                break;
            default:
                break;
        }
         return keterangan;
     }

}