This pattern states that we must always rely on abstractions rather than 
concrete implementation

<b> <i> Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. </i> </b>

1. In the context class, identify an algorithm that’s prone to frequent changes. It may also be a massive conditional that selects and executes a variant of the same algorithm at runtime. 
In this example, it's the eat(), fly() and quack() methods that change frequently.

2. Declare the strategy interface common to all variants of the algorithm. Look out for the interface of Eating, Flying and Quacking Strategies.

3. One by one, extract all algorithms into their own classes. They should all implement the strategy interface. Here, EatingSlowStrategy is an implementation of the EatingStrategy.

4. In the context class, add a field for storing a reference to a strategy object. Provide a setter for replacing values of that field. The context should work with the strategy object only via the strategy interface. The context may define an interface which lets the strategy access its data. This also allows dependency injection (Look inside StrategyPatternDriver.java)

This pattern is most applicable when you need to have multiple instances of a particular type of Class 
with variations. This works as an alternative to hierarchical inheritance.  
Here, I've used it to represent different kinds of ducks which has a specific set of behaviour which is common in some and different in other
More specifically, each and every duck differs by some or the other method.


For example each duck eats, quack and fly in a certain way. A probable situation where you want to use the Strategy Pattern is when considering 3 ducks A,B,C with the following configs

A (eat1, quack2, fly1)
B (eat2, quack2, fly2)
C (eat1, quack1, fly2)

where eat#, fly# and quack# represents the different kind of algos of eat(), fly() and quack()

reference: https://refactoring.guru/design-patterns/strategy