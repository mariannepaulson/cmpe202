import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Inspector here.
 * 
 * @author Marianne Paulson
 * @version 1/27/2019
 */
public class Inspector extends Alien
{

    private ArrayList<Picker> pickers = new ArrayList<Picker>();

    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   

    public void inspectCoin(Coin coin) {

        System.out.println("Inspecting");
        System.out.println("Coin: " + coin.getClass() );
        if (coin.getClass() == Quarter.class) {
            
            World world = getWorld();
            if(world != null) {
                for (Object object : world.getObjects(RandomPicker.class))
                {
                    pickers.add((RandomPicker) object); 
                }

                for (Object object : world.getObjects(GreenPicker.class))
                {
                    pickers.add((GreenPicker) object);
                }

                int whichPicker = Greenfoot.getRandomNumber(pickers.size());
                Picker pickerChosen = pickers.get(whichPicker);
                System.out.println("Picker: " + pickerChosen.getClass());

                if (pickerChosen.getClass() == GreenPicker.class){
                    GreenPicker green = (GreenPicker) pickerChosen;
                    green.pick(Greenfoot.getRandomNumber(500));
                } else {
                    RandomPicker random = (RandomPicker) pickerChosen;
                    random.pick(Greenfoot.getRandomNumber(500));

                }
            }
        }
    }
}
