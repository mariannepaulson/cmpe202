public class BuildOrder {

    public static void getOrder()
    {
        
      
    {
        int orderNumber = 0;
        Order order = new Order( ++orderNumber ) ;
        //Burger
        Burgers burger = new Burgers("LBB", 1);
        Toppings bacon = new Toppings("{{{{BACON}}}}",Placement.ONBOTTOMBUN);
        Toppings lettuce = new Toppings("LETTUCE",Placement.ONTOPBUN);
        Toppings tomato = new Toppings("TOMATO",Placement.ONTOPBUN);
        Toppings gOnion = new Toppings("G ONION",Placement.ONMEAT);
        Toppings jGrilled = new Toppings("JALA Grilled",Placement.ONMEAT);
        burger.addChild(bacon);
        burger.addChild(lettuce);
        burger.addChild(tomato);
        burger.addChild(gOnion);
        burger.addChild(jGrilled);
             
        Fries fries = new Fries("LTL CAJ", 1, 1);

        order.addChild(burger);

        order.addChild(fries);
        
        PackingSlip packingSlip = new PackingSlip();
        packingSlip.print(order);
        
        Receipt receipt = new Receipt();
        receipt.print(order);
        
        
    }

}
        
      
        
    }
    
