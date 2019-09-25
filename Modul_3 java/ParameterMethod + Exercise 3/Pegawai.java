/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localvariable;

public class Pegawai {
  String nama;
    int nip;
    double gaji;
    public void setPegawai(String nama, int nip, double gaji) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
        System.out.println("Nama : " + nama + "\n" +
                            "NIP : " + nip + "\n" +
                            "Gaji : " + gaji + "\n");
    }
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();
        pegawai1.setPegawai("Ainayah",123456,9000000);
        pegawai2.setPegawai("Syifa",78901,1300000);
        pegawai3.setPegawai("Hendri",121309,5000000);
        pegawai4.setPegawai("Latan",147042,7200000);
        pegawai5.setPegawai("Sala",321098,4000000);
    }  
}
