/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localvariable;

public class StaticVariable {
    public static char akreditasi;
    public static final String jurusan = "Informatika";

    void firstMethod() {
        System.out.println(jurusan);
    }

    void secondMethod() {
        System.out.println("Akreditasi : " + akreditasi );
    }
}
