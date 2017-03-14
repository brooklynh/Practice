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
public class GoatShelter implements Describable{
    private String description;
    private int height;
    private int width;
    private int length;
    public GoatShelter(int height, int width, int length){
        this.height = height;
        this.length = length;
        this.width = width;
        this.description = "A goat shelter that is " + height + " high, " + length + " long and " + width + " wide";
    }
    public String getDescription(){
        return description;
    }
}
