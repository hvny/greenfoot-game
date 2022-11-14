import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cat extends Actor
{
    private int speed = 8;
    
    
    public void act()
    {
        moveHor();
    }
    
    public boolean canMove() {
        World myWorld = getWorld();
        int x = getX();
        
        
        if (x >= myWorld.getWidth()) {
            return false;
        }
        else if (x < 0) {
            return false;
        }
        
        return true;
    }
    
    public void moveHor() {
        if (isAtEdge()) {
            speed = -speed;
        }
        setLocation(getX() + 1*speed, getY());
    }
}


