import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        
        move();
        lookForWorm(); 
        randomTurn();
        turnAtEdge(); 
        
    }
    
    public void move( )
    {
        move(5);
    }
    /* 
     * If Crab is Hungry it eats
     * It can eat the worm or not eat it at all\
     * Moves freely 
     */
    
    public void lookForWorm()
    {
        if( isTouching(Worm.class) )
        {
            removeTouching( Worm.class );
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


