import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("som.mp3");
    public void started()
    {
        bgMusic.playLoop();
    }
    public void stopped(){
        bgMusic.pause();
    }
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        cookie cookie = new cookie();
        addObject(cookie,187,324);
        garibaldo garibaldo = new garibaldo();
        addObject(garibaldo,582,310);
        Counter counter = new Counter();
        addObject(counter,409,25);
        Counter2 counter2 = new Counter2();
        addObject(counter2,400,573);
    }
    
}