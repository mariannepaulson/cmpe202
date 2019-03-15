

import java.util.ArrayList;

public class Composite implements Component
{
    // instance variables - replace the example below with your own
    protected ArrayList<Component> components = new ArrayList<Component>();
    protected String description;

    /**
     * Constructor for objects of class Composite
     */
    public Composite( String d )
    {
        // initialise instance variables
        description = d ;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String printDescription() {
        String printDescr = "\n" + description;
        for (Component obj  : components)
        {
            printDescr += " " + obj.printDescription() + "\n";
        }
        return printDescr;
    }
    public void addChild(Component c) {
        components.add( c ) ;
	}
	 
	public void removeChild(Component c) {
        components.remove(c) ;
	}
	 
	public Component getChild(int i) {
	    return components.get( i ) ;
	}
	public double getPrice() {
	    return 0;
	   }
	   public Placement getPlacement() {
	       return null;
	   }
	 
}