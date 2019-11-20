/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

public class Pet {
    private String name;

    public void setName(String setName) {
        this.name = setName;
    }

    public String getName(){
        return this.name;
    }

    public String behavior() {
        return "Submissive Animals";
    }
}
