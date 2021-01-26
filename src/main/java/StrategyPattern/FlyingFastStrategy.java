package StrategyPattern;

public class FlyingFastStrategy implements FlyingStrategy{
    @Override
    public void fly() {
        System.out.println("Flying fast..");
    }
}
