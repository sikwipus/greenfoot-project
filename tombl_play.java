import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombl_play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tombl_play extends Actor
{
    /**
     * Act - do whatever the tombl_play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new layerplay());
    }   
}}
