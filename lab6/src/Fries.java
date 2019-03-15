import java.text.DecimalFormat;
public class Fries extends Leaf
{
    private double price;
    private int quantity;
    private int size;

    public Fries(String description, int size, int quantity)
    {
        super(description);
        this.size = size;
        this.quantity = quantity;
        this.setDetails();
    }

    private void setDetails(){
        switch(this.size){
            case 1:
            this.price = 2.79;
            break;
            case 2:
            this.price = 3.39;
            break;
            case 3:
            this.price = 4.59;
            break;
            default:
            this.price = 0.00;
        }
    }

    public String printPriceDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        String printDesc = "\n" + quantity + " " + description + "    		 " + fmt.format(getPrice());
        return printDesc;
    }

    @Override
    public String printDescription() {
        String printDesc = "\n" + quantity + " " + description;
        return printDesc;
    }

    /**
     * Return fries' price
     * @return fries' price
     */
    @Override
    public double getPrice(){
        return this.price * this.quantity;
    }
}