import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(5, 50, new ArrayList<Integer>(Arrays.asList(5, 10, 25)));

        System.out.println(gumballMachine);

        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 2 );
        gumballMachine.insertCoin(5);
        
        gumballMachine.turnCrank();

    }
}
