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
public class PlantSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Creating a maple tree, tulip, and rose");
        MapleTree mapleTree = new MapleTree();
        Tulip tulip = new Tulip();
        Rose rose = new Rose();
        System.out.println("Entering a loop to simulate 5 years");
        for (int i = 0; i < 3; i++) {
            mapleTree.doSpring();
            tulip.doSpring();
            rose.doSpring();
            mapleTree.doSummer();
            tulip.doSummer();
            rose.doSummer();
            mapleTree.doFall();
            tulip.doFall();
            rose.doFall();
            mapleTree.doWinter();
            tulip.doWinter();
            rose.doWinter();
        }
    }
    
}
