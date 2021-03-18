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
        checkKeyPress();
        
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
            Greenfoot.playSound("slurp.wav"); 
        }
    }
    
    /*
     * Chech wether a key is pressed. If so, turn the crab 
     */
    public void checkKeyPress()
    {
                if( Greenfoot.isKeyDown("left") ) 
        {
            turn(-4); 
        }
        if( Greenfoot.isKeyDown("right") ) 
        {
            turn(4); 
        }
    }
}


