# Lab 10 Marianne Paulson

## Comparison between lab1 and lab10

In Lab1, I was exploring the problem of code maintainability. I looked at what was common between 
the gumball machines and what was different. In Lab1 we needed to modify code for different cost, etc.

I had to create a separate class for implementation of each gumball machine accepting 25 cents, 50 cents, and any coin. Based on the requirement in the assignment I had to make changes in the constructor to accept the right cost and 
type of coints that the machine would accept. If there were any additional features, I would have to make 
code changes in each of the classes and their constructors. 

In this lab, I am using a feature model. Features are modelled using AOP. The configuration is handled separately in a config file. This file is called device.config. When I want a different model, I can change the configuration. 

With the help of features and constraints on them, it is now easy to accomodate new features.

## Screenshots

Below screenshot shows the feature model

![Alt text](Model.png?raw=true "Model")

Below screenshots show how to select and run each of the 4 versions

![Alt text](How_to_run_part1.png?raw=true "How to run part 1")
![Alt text](How_to_run_part2.png?raw=true "How to run part 2")

Below screenshots shows the output from each 

![Alt text](Crank_25cents.png?raw=true "Crank 25 cents")
![Alt text](Crank_50cents.png?raw=true "Crank 50 cents")
![Alt text](Slot_25cents.png?raw=true "Slot 25 cents")
![Alt text](Slot_50cents.png?raw=true "Slot 50 cents")







