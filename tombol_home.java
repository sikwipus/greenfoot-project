import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol_home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tombol_home extends Actor
{
    /**
     * Act - do whatever the tombol_home wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new layerhome());
    }   // Add your action code here.
    }    
}
