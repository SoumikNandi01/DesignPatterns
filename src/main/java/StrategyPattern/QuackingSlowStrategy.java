package StrategyPattern;

public class QuackingSlowStrategy implements QuackingStrategy{
    @Override
    public void quack() {
        System.out.println("Quacking slow..");
    }
}
