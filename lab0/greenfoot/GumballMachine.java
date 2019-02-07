import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Gumball Machine accepts coins and disperses gumballs if coin valid
 * 
 * @author Marianne Paulson
 * @version 1/12/2019 version 1
 */
public class GumballMachine extends Actor
{
    Message m = new Message();
    Actor haveCoin;
    Boolean haveCoinFlag = false;
    Actor coin;

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        boolean isTouched = isTouching(Coin.class);

        if (isTouched) 
        {
            if (haveCoinFlag == false){
                setMessage("Have coin");

                haveCoinFlag= true;

                coin = getOneIntersectingObject(Coin.class);
                
                World world = getWorld();
                world.removeObject(coin);

            }

        }
        if (Greenfoot.mousePressed(this))
        {
            if (haveCoinFlag == true) {

                setMessage("Crank turned");

                Inspector inspector = null;

                World world = getWorld();

                for (Object object : world.getObjects(Inspector.class))
                {
                    inspector = (Inspector) object; 
                }

                inspector.inspectCoin((Coin)coin);

                haveCoinFlag = false;
            }

        } 
    }

    private void setMessage(String msg)
    {
        int mouseX, mouseY;

        {

            mouseX=this.getX();
            mouseY=this.getY();
            World world = getWorld();
            if (m.getWorld() != null)
            {
                world.removeObject(m);
            }
            world.addObject(m, mouseX, mouseY);
            m.setText(msg);
        }
    }

}