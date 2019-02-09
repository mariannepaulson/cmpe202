#cmpe202 - LAB1
Marianne Paulson

**********************************
part 1 - gumball-java-typical
**********************************

To satisfy all three types of GumBall machines, I added 3 instance variables to the GumballMachine class.
Below are their names with descriptions:

price (to hold the price of a gumball)

acceptedCoins (an array to hold the Gumball Machine's required coin types)

totalValueInserted (to hold the value of inserted coins)


I then added logic to the "insert coin" method and "turn crank" method to 
satisfy the requirements for the 3 different gumball machines.

I also renamed all references of "Quarter" to "Coin" to make the 
program more generic since we no longer have only a Gumball Machine that 
handles only Quarters.

I also added some tests for each Gumball Machine in main.

*********************************
part 2 - gumball-java-pattern
*********************************

For Part 2 I did the same changes as listed under part 1.

In addition, I added an additional state class for "partial coin state".
I called this state "hasInSufficientCoinState".

I also renamed the "HasQuarter" state to "HasSufficientCoinState" to make
the program more Generic since not all Gumball Machines only takes Quarters.

By using the state pattern, we allow the gumball machine to
change its behavior when its internal state changes.

The gumball machine maintains an instance of each
of the states. Therefore, I added the new state to the 
Gumball Machine's instance variable collection. I also 
instantiated this new state in the Gumball Machine's constructor.

Finally, I implemented the 4 behaviors:

-	Insert coin
-	Eject coin
-	Turn crank
-	Dispense ball

to my added state class. All the concrete state classes implement their own behavior 
associated with its state.

The modified Asta diagrams are located in the output directory under lab1 directory as 
specified in the instructions.

Thank you!
