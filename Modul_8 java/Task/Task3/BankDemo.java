/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

public class BankDemo {
     public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setRasioBunga(7);
        System.out.println(b1.getRasioBunga());
        System.out.println();

        BankPribadi b2 = new BankPribadi();
        b2.setRasioBunga(3);
        System.out.println(b2.getRasioBunga());
        System.out.println();

        BankUmum b3 = new BankUmum();
        b3.setRasioBunga(13);
        System.out.println(b3.getRasioBunga());
        System.out.println();

        BankPasar b4 = new BankPasar();
        b4.setRasioBunga(30);
        System.out.println(b4.getRasioBunga());
        System.out.println();

        BankSyariah b5 = new BankSyariah();
        b5.setRasioBunga(21);
        System.out.println(b5.getRasioBunga());
        System.out.println();
    }
}
