import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //prompts for which Machine

        int machine = 0;

        System.out.println("Please select a number between 1 and 3");

        Scanner input = new Scanner (System.in);
        machine = input.nextInt();

        switch (machine) {
            case 1:
            testing1();
            break;
            case 2:
            testing2();
            break;
            case 3:
            testing3();
            break;
            default:
            System.out.println("Not found");
        }
/*
        GumballMachine gumballMachine = new GumballMachine(5, 50, new ArrayList<Integer>(Arrays.asList(5, 10, 25)));
        System.out.println(gumballMachine);
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 2 );
        gumballMachine.insertCoin(5);

        gumballMachine.turnCrank();
        */

    }

    public static void testing1() {
        System.out.println("You selected Gumball machine #1. Please insert a quarter");
        GumballMachine gumballMachine = new GumballMachine(5, 25, new ArrayList<Integer>(Arrays.asList(25)));
        int coin;
        Scanner input = new Scanner (System.in);
        coin = input.nextInt();
        gumballMachine.insertCoin(coin);
        gumballMachine.turnCrank();
    }

    public static void testing2() {
        System.out.println("You selected Gumball machine #2. Please insert two quarters");
        GumballMachine gumballMachine = new GumballMachine(5, 50, new ArrayList<Integer>(Arrays.asList(25)));
        int coin;
        Scanner input = new Scanner (System.in);
        coin = input.nextInt();
        gumballMachine.insertCoin(coin);
        gumballMachine.insertCoin(coin);
        gumballMachine.turnCrank();
    }

    public static void testing3() {
        System.out.println("You selected Gumball machine #3. Please insert 50 cents");
        GumballMachine gumballMachine = new GumballMachine(5, 50, new ArrayList<Integer>(Arrays.asList(5,10,25)));
        int coin;
        Scanner input = new Scanner (System.in);
        coin = input.nextInt();
        gumballMachine.insertCoin(coin);
        gumballMachine.insertCoin(10);
        gumballMachine.insertCoin(5);
        gumballMachine.insertCoin(10);
        gumballMachine.turnCrank();
    }

}
