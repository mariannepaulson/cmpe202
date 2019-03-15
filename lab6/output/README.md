CMPE202 LAB6 Marianne Paulson 3/14/2019

I used the strategy pattern to encapsulate the difference between printing out
a receipt vs a package slip. 

The classes I created for strategy are:

Strategy - interface
Receipt - one algorithm
PackingSlip - another algorithm

I used the composite pattern to encapsulate what varies on an order.
For example, a burger can have many kinds of different toppings.
Therefore, it is wise to keep a composite with an array that can hold
all the "children" that varies dynamically when creating an order.

The classes I created for the composite pattern are:

Component - interface
Leaf - concrete class that implements Component
Composite - concrete class that implements Component

The output is in output.png I print package slip first.
Then the receipt.



