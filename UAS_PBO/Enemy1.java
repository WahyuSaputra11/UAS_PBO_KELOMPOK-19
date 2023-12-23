import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Karakter
{
    /**
     * Act - do whatever the Musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int tahan = 30;
    private int jeda = 0;
    
    public void serang()
    {
        setLocation(getX(), getY() + 1);
        if(getY()>500){
             setLocation(Greenfoot.getRandomNumber(500),
             Greenfoot.getRandomNumber(50));
        }
    }
    
    public void act()
    {
        serang();
        if(tahan == 0){
            tahan = 30;
        }
        if(jeda > 0)jeda--;
        if(jeda == 1)getWorld().addObject(new LaserEnemy1(), getX(),
        getY() + 50);
        if(jeda == 0)jeda = 120;
    }
}
