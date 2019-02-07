By using the state pattern, we allow the gumball machine to 
change its behavior when its internal state changes.

1) Based on a new requirement, I added one additional state:

NoCoinState
HasInSufficientCoinState	//new state
HasSufficientCoinState
SoldState
SoldOutState

2) The gumball machine (Context) maintains an instance of each 
of the five mentioned subclasses above. (ConcreateState subclass)

State noCoinState
State hasInSufficientCoinState
State hasSufficientCoinState
State soldState
State soldOutState
State state;		//to set the state

It also Defines 3 new instance variables to accomodate all three machines

Finally, it defines all the actions as methods (behaviors).

3) State interfaces encapsulates the behavior associated with a particular state of the context.

Our behaviors are:

-	Insert coin
-	Eject coin
-	Turn crank
-	Dispense ball

4) All the concrete states implement their own behavior associated with its state


The modified state diagrams are included.

Thanks for grading!