/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

public class TestPolymorphism {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("TOM");
        System.out.println(c1.getName());
        System.out.println(c1.food());
        System.out.println(c1.behavior());

        System.out.println();

        Dog d1 = new Dog();
        d1.setName("BULL");
        System.out.println(d1.getName());
        System.out.println(d1.food());
        System.out.println(d1.behavior());
    }
}
