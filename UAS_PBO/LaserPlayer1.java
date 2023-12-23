import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LaserPlayer1 extends Props
{
    public void serang(){
        setLocation(getX(), getY()-5);
        if(getY() < 20){
            getWorld().removeObject(this);
        }
        else{
            cek_sasaran();
        }
    }
    
    public void cek_sasaran(){
        if(isTouching(Enemy1.class)){
            getWorld().addObject(new Boomenemy1(), getX(), getY());
            Map1 l = (Map1)getWorld();
            l.addscore(20);
            Greenfoot.playSound("LaserPlayer.wav");
            removeTouching(Enemy1.class);
        }
    }
    
    public void act(){
        serang();
    }
}
