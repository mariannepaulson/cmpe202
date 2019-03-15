import java.text.DecimalFormat;
/**
 * Write a description of class Receipt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Receipt implements Strategy
{
    private double subTotal = 0;
    private double taxRate = 0.09;
    private double tax = 0;
    private double total = 0;
    
    public Receipt()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void print(Order order){
        DecimalFormat fmt = new DecimalFormat("$0.00");
        System.out.println("\n\n\n          FIVE GUYS\n");       
        System.out.println("Order Number: " + order.getOrderNumber());
        for(int i=0; i<order.getOrderItems().size(); i++) {
            Component obj = order.getOrderItems().get(i);
            if(obj instanceof Burgers){
                Burgers b = (Burgers)order.getOrderItems().get(i);
                System.out.println(b.printPriceDescription());
            } else if (obj instanceof Fries) {
                Fries f = (Fries)order.getOrderItems().get(i);
                System.out.println(f.printPriceDescription());
            }
        }
        subTotal = order.getPrice();
        tax = (subTotal * taxRate);
        total = (subTotal + tax);
       
        System.out.println("\n");   
        System.out.println("  Sub. Total:\t\t" + fmt.format(subTotal));        
        System.out.println("  Tax:       \t\t" + fmt.format(tax));        
        System.out.println("  Total:     \t\t" + fmt.format(total));
    }
}
