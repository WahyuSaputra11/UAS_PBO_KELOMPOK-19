import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LaserPlayer2 extends Props
{
    public void serang2(){
        setLocation(getX(), getY()-5);
        if(getY() < 20){
            getWorld().removeObject(this);
        }
        else{
            cek_sasaran2();
        }
    }
    
    public void cek_sasaran2(){
        if(isTouching(Enemy2.class)){
            getWorld().addObject(new Boomenemy2(), getX(), getY());
            Map2 t = (Map2)getWorld();
            t.addscore(20);
            Greenfoot.playSound("LaserPlayer.wav");
            removeTouching(Enemy2.class);
        }
    }
    
    public void act(){
        serang2();
    }
}
