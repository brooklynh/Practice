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
public class Rose extends Plant {
    private static final int AMOUNT_TO_GROW = 1;
    private boolean isFlowering = false;
    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW);
    }
    public void doSpring(){
        grow();
        addYearToAge();
        isFlowering = false;
        System.out.println("Spring: \n The rose bush starts growing branches, leaves, and buds");
        System.out.println("\t Current Age:" + getAge() + " " + "Current Height: " + getHeight() + "Flowering: " + isFlowering);
    }
    public void doSummer(){
        grow();
        isFlowering = true;
        System.out.println("Summer: \n The rose bush continues to grow and produces roses");
        System.out.println("\t Current Age:" + getAge() + " " + "Current Height: " + getHeight() + "Flowering: " + isFlowering);
    }
    public void doFall(){
        isFlowering = false;
        System.out.println("Fall: \n The rose bush stops growing and begins to lose its flowers and leaves");
        System.out.println("\t Current Age:" + getAge() + " " + "Current Height: " + getHeight() + "Flowering: " + isFlowering);
    }
    public void doWinter() {
        isFlowering = false;
        System.out.println("Winter: \n The rose bush is dormant");
        System.out.println("\t Current Age:" + getAge() + " " + "Current Height: " + getHeight() + "Flowering: " + isFlowering);
    }
}
