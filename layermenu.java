import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class layermenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class layermenu extends World
{

    /**
     * Constructor for objects of class layermenu.
     * 
     */
    public layermenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new tombl_play(), 92,144);
        addObject(new tombol_about(), 92,232);
        addObject(new tombol_home(), 92,320);
    }
}
