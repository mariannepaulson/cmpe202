import java.util.ArrayList;
import java.text.DecimalFormat;

public class Order extends Composite
{
    private double total;
    private int orderNo;
    public Order ( int orderNo)
    {
        super("Order Number") ;
        this.orderNo = orderNo;
    }
    
    /**
     * Return Order total
     * @return order total
     */
    @Override
    public double getPrice() {
        for (Component obj : components)
        {
            this.total += obj.getPrice();
        }
        return this.total;
    }
    
    /**
     * Return order number
     * @return order number
     */
    public int getOrderNumber() {
        return this.orderNo;
    }
    
    /**
     * Return order items
     * @return order items
     */
    public ArrayList<Component> getOrderItems() {
        return components;
    }
}

       