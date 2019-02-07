#cmpe202 - LAB1

#part 1 - gumball-java-typical

I added 3 instance variables to the GumballMachine class to
satisfy the requirement for each Gumball Machine:

- price
- an array to hold accepted coins
- a placeholder to store the value of inserted coins

I then added logic to the insert coin method and turn crank method.

I also added some tests for each Gumball Machine in main.

#part 2 - gumball-java-pattern

By using the state pattern, we allow the gumball machine to
change its behavior when its internal state changes.

I added one additional state to the existing set of states:

NoCoinState
HasInSufficientCoinState	//new state
HasSufficientCoinState
SoldState
SoldOutState

The gumball machine (Context) maintains an instance of each
of the five mentioned subclasses above. (ConcreateState subclass)

State noCoinState
State hasInSufficientCoinState
State hasSufficientCoinState
State soldState
State soldOutState
State state;		//to set the state

It also Defines 3 new instance variables to accomodate all three machines

Finally, it defines all the actions as methods (behaviors).

State interfaces encapsulates the behavior associated with a particular state of the context.

Our behaviors are:

-	Insert coin
-	Eject coin
-	Turn crank
-	Dispense ball

All the concrete states implement their own behavior associated with its state


The modified Asta diagrams are included.

Thanks for grading!
