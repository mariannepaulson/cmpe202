/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

		num.wrapDecorator(new CreditCardNumDecorator());
        exp.wrapDecorator(new CreditCardExpDecorator());

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	if(ch.matches("1|2|3|4|5|6|7|8|9|0")) {
    		count += count>=23?0:1;
    		screen.key(ch, count);
    	}
    	System.out.println("\nCount = " + count);
        if(ch.toUpperCase().matches("X|DELETE") && count>0) {
        	screen.key(ch, count);
        	count--;
        }
    }

}

