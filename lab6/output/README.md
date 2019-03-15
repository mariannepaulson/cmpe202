CMPE202 LAB6 Marianne Paulson 3/14/2019

I used the strategy pattern to encapsulate the difference between printing out
a receipt vs a package slip.

I used the composite pattern to encapsulate what varies on an order.
For example, a burger can have many kinds of different toppings.
Therefore, it is wise to keep a composite with an array that can hold
all the "children" that varies dynamically when creating an order.

Below is the output from the program. I print package slip first.
Then the receipt.

Order Number: 1

          FIVE GUYS


1 LBB
    LETTUCE
    TOMATO
    ->|G ONION
    ->|JALA Grilled
    {{{{BACON}}}}

1 LTL CAJ



          FIVE GUYS

Order Number: 1

1 LBB        		 5.59
    {{{{BACON}}}}
    LETTUCE
    TOMATO
    ->|G ONION
    ->|JALA Grilled

1 LTL CAJ    		 2.79


  Sub. Total:		$8.38
  Tax:       		$0.75
  Total:     		$9.13