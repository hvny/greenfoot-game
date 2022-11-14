import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mouse extends Actor
{
    private int speed = 3;
    
    private boolean alive;
    private boolean pizTaken;
    
    /**
     * Act - do whatever the mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveOn();
        catDeath();
        pizzaTake();
    }
    public void moveOn(){
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed,getY());
            setRotation(0);
        }
        else if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed,getY());
            
        }
        
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-speed);
        }
        else if (Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+speed);
        }
        
    }
    
    public boolean dead() {
        if ((isTouching(cat.class)) ||(isTouching(cactus.class))){
            return alive = false;
        }
        return alive = true;
    }
    
    public void catDeath() {
        Actor player = getOneObjectAtOffset(0, 0, mouse.class);
        death death = new death();
        if (dead() == false){
            getWorld().removeObject(player);
            getWorld().addObject(death,getX(),getY());
            gameEnd();
        }
        
    }
    public void gameEnd() {
        ((MyWorld)(getWorld())).gameOver();
    }
    
    public void pizzaTake(){
        Actor piz = getOneObjectAtOffset(0,0,pizza.class);

        if (piz != null) {
            getWorld().removeObject(piz);
            ((MyWorld)(getWorld())).addScore();
            pizTaken = true;
        }
        
        
    }
    
}
