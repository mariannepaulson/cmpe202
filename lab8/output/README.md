## Lab 8 Marianne Paulson

I am using decorator pattern to add the spaces between the card number
and to add the slash between year and month.

Using decorators leaves open the option of using different input masks in the 
future for different card types.

For example, Amex, Visa, and M/C cards have different Card Number Display Formats.

Visa and M/C have groups of 4-digits. Amex has 4-6-6.

The Decorator "encapsulate" this variation. 

This is a more elegant solution that to just expand upon the 
existing composite pattern which I did originally. 
Designing a composite of 4-blocks of 4 digits essentially "hard codes" the format
for Visa & M/C.



