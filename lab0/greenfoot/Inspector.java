import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
            // RandomPicker randompicker = new RandomPicker();
            // GreenPicker greenpicker = new GreenPicker();
            // pickers.add(randompicker);
            // pickers.add(greenpicker);
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
                    green.pick();
                } else {
                    RandomPicker random = (RandomPicker) pickerChosen;
                    random.pick();

                }
            }
        }
    }
}
