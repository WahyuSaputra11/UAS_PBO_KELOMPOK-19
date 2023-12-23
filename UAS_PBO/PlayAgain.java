import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgain extends World
{

    /**
     * Constructor for objects of class PlayAgain.
     * 
     */
    public PlayAgain()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 700, 1);
        if (this.getClass().getName().equalsIgnoreCase("PlayAgain"))
        {
            ButtonMainlagi mainlagi = new ButtonMainlagi();
            addObject(mainlagi, 375, 580);
            ButtonKeluar keluar = new ButtonKeluar();
            addObject(keluar, 55, 35);
        }
    }
}
