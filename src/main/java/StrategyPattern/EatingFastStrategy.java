package StrategyPattern;

public class EatingFastStrategy implements EatingStrategy{
    @Override
    public void eat() {
        System.out.println("Eating fast...");
    }
}
