import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LaserEnemy2 extends Props
{
    private int nyawa;
    
    public void serang2(){
        setLocation(getX(), getY() + 4);
        if(getY() > 590){
            getWorld().removeObject(this);
        }else{
            cek_sasaran2();
        }
    }
    
    public void cek_sasaran2(){
        if(isTouching(Player2.class)){
            getWorld().addObject(new Boomplayer2(), getX(), getY());
            Map2 l = (Map2)getWorld();
            l.updatenyawa(-1);
            getWorld().removeObject(this);
            Greenfoot.playSound("LaserEnemy.wav");
        }
    }
    
    public void act(){
        serang2();
    }
}
