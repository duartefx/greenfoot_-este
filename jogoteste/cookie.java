import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cookie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cookie extends Actor
{
    public int speed = 10;
    private int sTimer =10;
     public int vida= 0;
    /**
     * Act - do whatever the cookie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    public void movimento(){
        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("g") && (sTimer == 0)){
            sTimer++;
            getWorld().addObject(new biscoito(),getX() -100, getY() + 30);
        }
        else {
            if(!Greenfoot.isKeyDown("g")){
                sTimer = 0;
            }
        }
    }
    public void acertarAlvo(){
        
    Actor b = getOneIntersectingObject(garibaldo.class);   
         
    if (b != null){
        Counter counter= (Counter)getWorld().getObjects(Counter.class).get(0);
        counter.add(1);
        vida++;
    }
    else if (vida==10){
        getWorld().removeObject(b);
        getWorld().removeObject(this);
        
    }
    }
}
