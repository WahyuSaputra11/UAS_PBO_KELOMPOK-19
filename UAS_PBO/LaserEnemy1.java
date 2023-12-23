import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LaserEnemy1 extends Props
{
    private int nyawa;
    
    public void serang(){
        setLocation(getX(), getY() + 4);
        if(getY() > 590){
            getWorld().removeObject(this);
        }else{
            cek_sasaran();
        }
    }
    
    public void cek_sasaran(){
        if(isTouching(Player1.class)){
            getWorld().addObject(new Boomplayer1(), getX(), getY());
            Map1 t = (Map1)getWorld();
            t.updatenyawa(-1);
            getWorld().removeObject(this);
            Greenfoot.playSound("LaserEnemy.wav");
        }
    }
    
    public void act(){
        serang();
    }
}
