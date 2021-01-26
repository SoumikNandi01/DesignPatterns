package StrategyPattern;

public class EatingDisableStrategy implements EatingStrategy{
    @Override
    public void eat() {
        System.out.println("Cannot eat..");
    }
}
