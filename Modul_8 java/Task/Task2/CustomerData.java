/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

public class CustomerData {
    String name;
    String address;
    String dateOfBirth;
    String work;
    double salary;

    public CustomerData() {
        System.out.println(name);
        System.out.println(address);
        System.out.println(dateOfBirth);
        System.out.println(work);
        System.out.println(salary);
    }

    public CustomerData(String name, String address, String dateOfBirth, String work, double salary) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.work = work;
        this.salary = salary;
        System.out.println(name);
        System.out.println(address);
        System.out.println(dateOfBirth);
        System.out.println(work);
        System.out.println(salary);
    }
}
