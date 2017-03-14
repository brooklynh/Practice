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
public class Grass implements Describable{
    private String description;
    private int height;
    public Grass(int height){
        this.height = height;
        this.description = "The grass is " + height + " feet high.";
    }
    public String getDescription(){
        return description;
    }
}
