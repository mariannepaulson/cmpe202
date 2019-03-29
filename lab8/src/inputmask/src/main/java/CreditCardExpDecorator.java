/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExpDecorator implements IDisplayComponent, IDisplayDecorator
{

	private String slash;

	public CreditCardExpDecorator() {
		slash = "/";
	}

	public String display() {
		return slash;
	}	

	public String decorate(String expireDate) {
		StringBuilder date = new StringBuilder();
		for(int i=0;i<expireDate.length();i++) {
			if(i==2)
				date.append(slash + expireDate.charAt(i));
			else
				date.append(expireDate.charAt(i));
		}
		return date.toString();
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}