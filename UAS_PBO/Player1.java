import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player1 extends Karakter
{
    /**
     * Act - do whatever the Pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int tahan = 10;
    public int jeda = 0;
    public int nyawa;
    
    public void button()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
        }
        if (tahan == 0)
        {
            if(Greenfoot.isKeyDown("Space"))
            {
                getWorld().addObject(new LaserPlayer1(), getX(), getY());
                //Greenfoot.playSound("bullet.wav");
            }
            tahan = 10;
        }
    }
    
    public void act()
    {
        tahan --;
        button();
        if(jeda > 0) jeda --;
        if(jeda == 1)
        if(jeda == 0) jeda = 20;
        
    }
}
