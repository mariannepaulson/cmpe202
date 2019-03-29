/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNumDecorator implements IDisplayComponent, IDisplayDecorator
{

	private String space;

    public CreditCardNumDecorator() {
    	space = " ";
    }	

	public String display() {
		return space;
	}	

	public String decorate(String number) {
		StringBuilder cardNumber = new StringBuilder();
		for(int i=0;i<number.length();i++) {
			if(i==4 || i==8 || i==12)
				cardNumber.append(space + number.charAt(i));
			else
				cardNumber.append(number.charAt(i));
		}
		return cardNumber.toString();
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}