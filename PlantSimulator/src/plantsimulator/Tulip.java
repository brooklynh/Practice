/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsimulator;

/**
 *
 * @author Brooklyn
 */
public class Tulip extends Plant {
    private static final int AMOUNT_TO_GROW = 1;
    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW);
    }
    private void dieDownForWinter(){
        setHeight(0);
    }
    public void doSpring(){
        grow();
        addYearToAge();
        System.out.println("Spring: \n The tulip is starting to grow up from the ground");
        System.out.println("\t Current Age:" + getAge() + " " + "Current Height: " + getHeight());
    }
    public void doSummer(){
        System.out.println("Summer: \n The tulip has stopped growing and is flowering");
        System.out.println("\t Current Age: " + getAge() + " " + "Current Height: " + getHeight());
    }
    public void doFall(){
        System.out.println("Fall: \n The tulip begins to wilt");
        System.out.println("\t Current Age: " + getAge()+ "Current Height: " + getHeight());
    }
    public void doWinter() {
        dieDownForWinter();
        System.out.println("Winter: \n The tulip is dormant underground");
        System.out.println("\t Current Age: " + getAge()+ "Current Height: " + getHeight());
    }
}
