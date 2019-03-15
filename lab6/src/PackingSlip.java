import java.text.DecimalFormat;
/**
 * Write a description of class PackingSlip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PackingSlip implements Strategy
{

    public PackingSlip()
    {

    }

    public void print(Order order){
 
        
        System.out.println("Order Number: " + order.getOrderNumber());
               System.out.println("\n          FIVE GUYS\n");
        for(Component item : order.getOrderItems()) {
            System.out.println(item.printDescription());
        }
        //System.out.println("-------------------------------------");
    }
}
