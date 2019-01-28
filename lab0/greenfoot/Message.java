import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Message will display messages on the screen
 * 
 * @author Marianne Paulson
 * @version 1/12/2019 version 1
 */
public class Message extends Actor
{

    GreenfootImage gi;

    public Message() 
    {
        gi = new GreenfootImage(100,100);
        setImage(gi);  

    }

    public void setText(String msg)
    {
        gi.clear();
        gi.setColor(Color.ORANGE);
        gi.fill();
        gi.setColor(Color.BLACK);
        gi.drawString(msg, 0, 25);

        if(Greenfoot.mouseClicked(this)) {
            World world = getWorld();
            world.removeObject(this);
        }
    }

    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            World world = getWorld();
            world.removeObject(this);

        }  
    }
}
