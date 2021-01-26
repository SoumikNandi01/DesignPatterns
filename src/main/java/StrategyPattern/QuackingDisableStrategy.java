package StrategyPattern;

public class QuackingDisableStrategy implements QuackingStrategy{
    @Override
    public void quack() {
        System.out.println("Cannot quack..");
    }
}
