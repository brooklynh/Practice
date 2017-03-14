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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Inheritance();
    }
    public Inheritance(){
        Goat goat = new Goat("Bob");
        GoatShelter goatShelter = new GoatShelter(4, 4, 6);
        Grass grass = new Grass(5);
        System.out.println(description(goat));
        System.out.println(description(goatShelter));
        System.out.println(description(grass));
    }
    private String description(Describable d){
        return d.getDescription();
    }
    
}
