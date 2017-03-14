/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Brooklyn
 */
public class Goat implements Describable {
    private String description;
    public Goat(String name){
        description = "A goat named " + name;
    }
    public String getDescription(){
        return description;
    }
}
