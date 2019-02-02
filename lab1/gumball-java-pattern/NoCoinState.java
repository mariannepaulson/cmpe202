
public class NoCoinState implements State {
    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        System.out.println("You inserted a Coin");
        gumballMachine.setTotalValueInserted(coin);

        if (gumballMachine.getTotalValueInserted() >= gumballMachine.getPrice()) {
            gumballMachine.setTotalValueInserted(0);
            gumballMachine.setState(gumballMachine.getHasSufficientCoinState());
        }
        else {
                
            gumballMachine.setState(gumballMachine.getHasInSufficientCoinState());
        }
    }

    public void ejectCoin() {
        System.out.println("You haven't inserted a Coin");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no Coin");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    } 

    public String toString() {
        return "waiting for Coin";
    }
}
