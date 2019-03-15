import java.text.DecimalFormat;
public class Burgers extends Composite
{
    private double price;
    private int quantity;
    public Burgers ( String d, int quantity )
    {
        super(d) ;
        this.quantity = quantity;
        setDetails();
    }
    
    private void setDetails(){
        switch(description){
            case"HB":
                this.price = 6.39;
                break;
            case"CB":
                this.price = 7.19;
                break;
            case"BB":
                this.price = 7.19;
                break;
            case"BCB":
                this.price = 7.79;
                break;
            case"LHB":
                this.price = 4.59;
                break;
            case"LCB":
                this.price = 5.29;
                break;
            case"LBB":
                this.price = 5.59;
                break;
            case"LBCB":
                this.price = 6.19;
                break;
            default:
                this.price = 0.00;
        }
    }
    
    public String printPriceDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        String printDesc = "\n" + quantity + " " + description + "        		 " + fmt.format(getPrice());
        for (Component obj : components)
        {
            printDesc += "\n  " + obj.printDescription();
        }
        return printDesc;
    }
    
    @Override
    public String printDescription() {
        String printDesc = "\n" + quantity + " " + description;
        StringBuffer topBunComponents = new StringBuffer();
        StringBuffer bottomBunComponents = new StringBuffer();
        StringBuffer onMeatComponents = new StringBuffer();
        for (int i=0; i<components.size(); i++)
        {
            Toppings obj = (Toppings)components.get(i);
            if(obj.getPlacement() == Placement.ONTOPBUN)
                topBunComponents.append("\n  " + obj.printDescription());
            else if(obj.getPlacement() == Placement.ONMEAT)
                onMeatComponents.append("\n  " + obj.printDescription());
            else
                bottomBunComponents.append("\n  " + obj.printDescription());
        }
        printDesc += topBunComponents.toString();
        printDesc += onMeatComponents.toString();
        printDesc += bottomBunComponents.toString();
        return printDesc;
    }
    
    /**
     * Return burger price
     * @return burger price
     */
    @Override
    public double getPrice() {
        return this.quantity*this.price;
    }
}
