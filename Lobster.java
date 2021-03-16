import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author Zachary 
 * @version March 16 version 1
 */
public class Lobster extends Actor
{
    public void act()
    {
        
        move();
        lookForCrab(); 
        randomTurn();
        turnAtEdge(); 
        
    }
    
    public void move( )
    {
        move(5);
    }
    /* 
     * If Lobster is Hungry it eats
     * It can eat the worm or not eat it at all\
     * Moves freely 
     */
    
    public void lookForCrab()
    {
        if( isTouching(Crab.class) )
        {
            removeTouching( Crab.class );
        }
    }
    
    /*
     * Make the Crab randomly turn left or right
     * between 0 and 45 degrees 
     */
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100)<10) 
        {
            turn( Greenfoot.getRandomNumber(91)-45 );
        }
    }
    
    /*
     * Crabs turn at Edge
     */
    public void turnAtEdge()
    {
        if( isAtEdge() ) 
        {
             turn (17);
        }
    }
    
}
