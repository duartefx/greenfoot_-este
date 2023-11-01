import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class garibaldo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class garibaldo extends Actor
{
    public int speed = 20;
    private int sTimer =0;
    /**
     * Act - do whatever the garibaldo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento2();
    }
    public void movimento2(){
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("l") && (sTimer == 0)){
            sTimer++;
            getWorld().addObject(new coracao(),getX() -100, getY() + 30);
        }
        else {
            if (!Greenfoot.isKeyDown("l")){
                sTimer = 0;
            }
        }
    }
}
