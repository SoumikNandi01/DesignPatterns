package StrategyPattern;

public class QuackingLoudStrategy implements QuackingStrategy{
    @Override
    public void quack() {
        System.out.println("Quacking loudly..");
    }
}
