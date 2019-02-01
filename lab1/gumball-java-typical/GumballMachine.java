import java.util.ArrayList;
public class GumballMachine
{

    private int num_gumballs;
    private int price;
    protected ArrayList<Integer> acceptedCoins;
    private int total = 0;
    private boolean insertedEnoughMoney;


    public GumballMachine( int size, int price, ArrayList<Integer> acceptedCoins)

    {
        // initialise instance variables
        this.num_gumballs = size;
        this.price = price;
        this.acceptedCoins = new ArrayList<Integer>(acceptedCoins);
        this.total = 0;
        this.insertedEnoughMoney = false;
        
    }

    public void insertCoin(int coin)
    {
        if(acceptedCoins.contains(coin)) {
            total += coin;
            if ( total >= price )
                this.insertedEnoughMoney = true ;
            else 
                this.insertedEnoughMoney = false ;
        }
        else 
            System.out.println("Invalid coin");
    }

    public void turnCrank()
    {
        if ( this.insertedEnoughMoney )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.insertedEnoughMoney = false ;
                System.out.println( "Thanks.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
            }
        }
        else 
        if (total > 0) {
            System.out.print("Price of gumball is: " + price + ". Please insert more money");
        }
        else
        {
            System.out.println( "You have not inserted any coins. Please insert money" ) ;
        }        
    }
}
