
import java.util.ArrayList;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	    // MP 2/1/2019 Test 1st type of machine - quarters only

		GumballMachine gumballMachine = new GumballMachine(2, 25, new ArrayList<Integer>(Arrays.asList(25)));

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
