import java.util.ArrayList;
public class GumballMachine {
    State soldOutState;
    State noCoinState;
    State hasSufficientCoinState;
    State soldState;
    State hasInSufficientCoinState;
    State state = soldOutState;
    int count = 0;

    // MP-2/1/2019 Added instance variables to accomodate different machines
    private int price;
    protected ArrayList<Integer> acceptedCoins;
    private int totalValueInserted = 0;
   

    public GumballMachine( int numberGumballs, int price, ArrayList<Integer> acceptedCoins) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasSufficientCoinState = new HasSufficientCoinState(this);
        hasInSufficientCoinState = new HasInSufficientCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;

        // MP-2/1/2019 Setting new instance variables to accomodate different machines
        this.price = price;
        this.acceptedCoins = new ArrayList<Integer>(acceptedCoins);
        this.totalValueInserted = 0;

        if (numberGumballs > 0) {
            state = noCoinState;
        } 
    }

    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasSufficientCoinState() {
        return hasSufficientCoinState;
    }
    
    public State getHasInSufficientCoinState() {
        return hasInSufficientCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nTotal Value Inserted so far: " + getTotalValueInserted());
        result.append("\nPrice: " + getPrice());
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Integer> getAcceptedCoints() {
        return acceptedCoins;
    }

    public int getTotalValueInserted() {
        return totalValueInserted;
    }
    
    public void setTotalValueInserted(int coin) {
        this.totalValueInserted += coin;
    }
    
    
}

