
import java.util.Random;
public class HasInSufficientCoinState implements State {
    GumballMachine gumballMachine;

    public HasInSufficientCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        gumballMachine.setTotalValueInserted(coin);
        System.out.println("Another coin inserted");
        if (gumballMachine.getTotalValueInserted() >= gumballMachine.getPrice()) 
            gumballMachine.setState(gumballMachine.getHasSufficientCoinState());
        
    }

    public void ejectCoin() {
        System.out.println("Coin returned");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    public void turnCrank() {

        System.out.println("You need to insert more coins");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
