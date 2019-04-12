package observer;

public class ObserverTest
{
    public void runTest()
    {
        // Only instantiate subject - not the Pessimist and Optimist as previously
        observer.TheEconomy s = new observer.TheEconomy();
        // Lambda
        s.attach(() -> {
            System.out.print("Pessimist Observer: ");
            if (s.getState().equalsIgnoreCase("The Price of gas is at $5.00/gal"))
            {
                System.out.println("This is the beginning of the end of the world!");
            }
            else if (s.getState().equalsIgnoreCase("The New iPad is out today"))
            {
                System.out.println("Not another iPad!");
            }
            else
            {
                System.out.println(":<");
            }
        });

        s.attach(() -> {
            System.out.print("Optimist Observer: ");
            if (s.getState().equalsIgnoreCase("the Price of gas is at $5.00/gal"))
            {
                System.out.println("Great! It's time to go green.");
            }
            else if (s.getState().equalsIgnoreCase("The New iPad is out today"))
            {
                System.out.println("Apple, take my money!");
            }
            else
            {
                System.out.println(":)");
            }
        });
        s.setState("The New iPad is out today");
        s.setState("Hey, Its Friday!");

    }

    // The main function is the same as before
    public static void main(String [] args)
    {
        ObserverTest t = new ObserverTest() ;
        t.runTest();
    }
}