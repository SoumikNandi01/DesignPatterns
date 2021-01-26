package StrategyPattern;

public class EatingSlowStrategy implements EatingStrategy{
    @Override
    public void eat() {
        System.out.println("Eating slow...");
    }
}
