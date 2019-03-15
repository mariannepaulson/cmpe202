

import java.text.DecimalFormat;

public class Leaf implements Component {
    
    protected String description ;
    public Leaf ( String d )
    {

        description = d ;

    }

    
    public String printDescription() {
        return " " + description ;
    }

    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }

    public double getPrice() {
        /* needs to be implemented by the child class */
        return 0;
    }

    public Placement getPlacement() {
        return null;
    }
}

