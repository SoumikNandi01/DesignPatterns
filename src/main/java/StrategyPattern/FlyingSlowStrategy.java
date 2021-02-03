package StrategyPattern;

public class FlyingSlowStrategy implements FlyingStrategy{
    @Override
    public void fly() {
        System.out.println("Flying slow..");
    }
}
