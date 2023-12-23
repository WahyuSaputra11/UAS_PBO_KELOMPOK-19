import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends World
{
    
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 700, 1);
        if (this.getClass().getName().equalsIgnoreCase("MenuAwal"))
        {
            ButtonBantuan bantuan = new ButtonBantuan();
            addObject(bantuan, 361, 600);
            ButtonAbout about = new ButtonAbout();
            addObject(about, 440, 33);
            ButtonMulai mulai = new ButtonMulai();
            addObject(mulai, 141, 600);
        }
        else
        {
            addObject(new ButtonBack(), 45, 33);
        }
    }
}