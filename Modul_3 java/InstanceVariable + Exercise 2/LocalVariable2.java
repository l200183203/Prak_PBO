/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localvariable;

public class LocalVariable2 {
    int usia = 0;

    public void hitungUsia() {
        int usia = 0;
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + usia);
    }
    public void beratBadan() {
        int beratBadan = 0;
        int beratLahir = 4;

        beratBadan = beratLahir + (usia / 2);

        System.out.println("Berat badan : " + beratBadan);
    }
    public static void main(String[] args) {
        LocalVariable2 localvariable2 = new LocalVariable2();
        localvariable2.hitungUsia();
        localvariable2.beratBadan();
    }
}

/*
Answer No. 3
Right now we can call "usia" variable, because the variabel is instance variable that take place outside any method.
 */
