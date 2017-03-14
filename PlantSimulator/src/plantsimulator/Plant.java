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
public abstract class Plant {
    private int age=0;     
    private int height=0;     
    public int getAge(){         
        return age;       
    }     
    public void addYearToAge(){         
        age++;       
    }     
    public int getHeight(){         
        return height;       
    }     
    public void setHeight(int height){         
        this.height = height;       
    }     
    abstract public void doSpring();     
    abstract public void doSummer();     
    abstract public void doFall();     
    abstract public void doWinter();
}
