import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgain1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends World
{

    /**
     * Constructor for objects of class PlayAgain1.
     * 
     */
    public NextLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 700, 1);
        if (this.getClass().getName().equalsIgnoreCase("NextLevel"))
        {
            ButtonNext next = new ButtonNext();
            addObject(next, 380, 580);
            ButtonKeluar keluar = new ButtonKeluar();
            addObject(keluar, 55, 35);
        }
    }
}