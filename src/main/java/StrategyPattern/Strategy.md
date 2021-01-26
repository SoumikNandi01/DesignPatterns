This pattern states that we must always rely on abstractions rather than 
concrete implementation



1. In the context class, identify an algorithm that’s prone to frequent changes. It may also be a massive conditional that selects and executes a variant of the same algorithm at runtime. 
In this example, it's the eat(), fly() and quack() methods that change frequently.

2. Declare the strategy interface common to all variants of the algorithm. Look out for the interface of Eating, Flying and Quacking Strategies.

3. One by one, extract all algorithms into their own classes. They should all implement the strategy interface. Here, EatingSlowStrategy is an implementation of the EatingStrategy.

4. In the context class, add a field for storing a reference to a strategy object. Provide a setter for replacing values of that field. The context should work with the strategy object only via the strategy interface. The context may define an interface which lets the strategy access its data. This also allows dependency injection (Look inside StrategyPatternDriver.java)
