import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boomplayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boomplayer1 extends Props
{
    /**
     * Act - do whatever the Boomplayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int jeda = 5;
    
    public void act()
    {
        if(jeda > 0)jeda--;
        else getWorld().removeObject(this);
    }
}
