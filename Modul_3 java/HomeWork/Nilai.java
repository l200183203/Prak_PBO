/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localvariable;

public class Nilai {
    double nilaiUTS;
    double nilaiUAS;
    double nilaiTugas;
    double nilaiTotal;

    public void setNilai(int nilaiUTS, int nilaiUAS, int nilaiTugas){
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiTugas = nilaiTugas;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public double getNilaiUAS() {
        return nilaiUAS;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public double getNilaiTotal() {
        nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas) / 3;
        return nilaiTotal;
    }

    public static void main(String[] args){
        Nilai nilai = new Nilai();
        nilai.setNilai(95,90,100);
        System.out.println("Nilai UTS : " + nilai.getNilaiUTS() + "\n" +
                            "Nilai UAS : " + nilai.getNilaiUAS() + "\n" +
                            "Nilai Tugas : " + nilai.getNilaiTugas() + "\n" +
                            "\n" +
                            "Nilai Total : " + nilai.getNilaiTotal());
    }
}
