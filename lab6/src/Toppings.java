
/**
 * Write a description of class Toppings here.
 *
 * @author Marianne Paulson
 * @version (a version number or a date)
 */

    // instance variables - replace the example below with your own
    public class Toppings extends Leaf
{
    private Placement place;
    public Toppings(String description, Placement place) {
        super(description);
        this.place = place;
    }
    /**
     * Return component's contents
     * @return component contents
     */
    @Override
    public String printDescription() {
        if(place == Placement.ONMEAT){
            return "  ->|" + description;
        } else {
            return "  " + description;
        }
    }
    /**
     * Return component's placement
     * @return component placment
     */
    @Override
    public Placement getPlacement(){
        return place;
    }
}

