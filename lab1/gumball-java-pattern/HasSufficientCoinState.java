
import java.util.Random;
public class HasSufficientCoinState implements State {
    GumballMachine gumballMachine;

    public HasSufficientCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {

        System.out.println("You cannot insert another coin");
    }

    public void ejectCoin() {
        System.out.println("Coin returned");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    public void turnCrank() {
        
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
