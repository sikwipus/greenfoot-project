import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol_back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tombol_back extends Actor
{
    /**
     * Act - do whatever the tombol_back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new layermenu());
    }// Add your action code here.
    }    
}
