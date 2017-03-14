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
public class MapleTree extends Plant {
    private static final int AMOUNT_TO_GROW = 2;
    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW);
    }
    public void doSpring(){
        grow();
        addYearToAge();
        System.out.println("Spring: \n The maple tree is starting to grow leaves and new branches");
        System.out.println("\t Current Age:" + getAge() + " " + "Current Height: " + getHeight());
    }
    public void doSummer(){
        grow();
        System.out.println("Summer: \n The maple tree is continuing to grow");
        System.out.println("\t Current Age: " + getAge() + " " + "Current Height: " + getHeight());
    }
    public void doFall(){
        System.out.println("Fall: \n The maple tree has stopped growing and is losing its leaves");
        System.out.println("\t Current Age: " + getAge()+ "Current Height: " + getHeight());
    }
    public void doWinter() {
        System.out.println("Winter: \n The maple tree is dormant");
        System.out.println("\t Current Age: " + getAge()+ "Current Height: " + getHeight());
    }
}
