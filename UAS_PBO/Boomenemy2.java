import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boomenemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boomenemy2 extends Props
{
    /**
     * Act - do whatever the Boomenemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int jeda = 3;
    
    public void act()
    {
        if(jeda > 0)jeda--;
        else getWorld().removeObject(this);
    }
}
