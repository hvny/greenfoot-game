import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private int cnt = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mouse mouse = new mouse();
        addObject(mouse,300,383);
        
        mouse.setLocation(267,563);
        
        cat cat1 = new cat();
        addObject(cat1,50,383);
        cat1.setLocation(30,400);
        
        cat cat2 = new cat();
        addObject(cat2,50,383);
        cat2.setLocation(570,260);
        
        
        pizza piz1 = new pizza();
        addObject(piz1,50,383);
        piz1.setLocation(200,340);
        
        pizza piz2 = new pizza();
        addObject(piz2,50,383);
        piz2.setLocation(100,560);
        
        pizza piz3 = new pizza();
        addObject(piz3,50,383);
        piz3.setLocation(450,150);
        
        pizza piz4 = new pizza();
        addObject(piz4,50,383);
        piz4.setLocation(540,520);
        
        pizza piz5 = new pizza();
        addObject(piz5,50,383);
        piz5.setLocation(140,60);
        
        for (int i = 100; i < 200; i+=50) {
            cactus cactus1 = new cactus();
            addObject(cactus1,170, getHeight()-i+60);
        }
        
        for (int i = 100; i < 250; i+=50) {
            cactus cactus1 = new cactus();
            addObject(cactus1,400, getHeight()-i+60);
        }
        
        for (int i = 50; i < 250; i+=50) {
            cactus cactus1 = new cactus();
            addObject(cactus1,i-20, 200);
        }
        
        for (int i = 50; i < 250; i+=50) {
            cactus cactus1 = new cactus();
            addObject(cactus1,380,getHeight()-360-i );
        }
    }
    
    public void gameOver() {
        Greenfoot.stop();
    }
    
    public void addScore(){
        cnt++;
        if (cnt == 5){
            showText(" ",500, 30);
            showText("YOU WON",300, 300);
            Greenfoot.stop();
        }
    }
    public void act(){
        showText("count="+cnt,500, 30);
        
    }
    
    
}
