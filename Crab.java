import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2; 
    private int wormsEaten; 
    
    /* 
     * Creare a  Crab and initialize two image variables 
     */
    public Crab()
    {
        image1 = new GreenfootImage( "crab.png" );
        image2 = new GreenfootImage( "crab2.png" ); 
        setImage( image1 ); 
        wormsEaten = 0; 
    }
    
    public void act()
    {

        move();
        lookForWorm(); 
        checkKeyPress();
        switchImage();
        
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
            
            wormsEaten = wormsEaten + 1; 
            
            getWorld().showText("Score: " + wormsEaten, 45, 10);
            
            if( wormsEaten == 10 ) 
            {
                Greenfoot.playSound( "fanfare.wav" ); 
                Greenfoot.stop(); 
            }
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
    
    /*
     * Switch the image of the Crab to Animate it 
     */
    public void switchImage()
    {
                if( getImage() == image1) 
        {
            setImage( image2 );
        }
        else
        {
            setImage( image1 );
        }
    }
    
}


