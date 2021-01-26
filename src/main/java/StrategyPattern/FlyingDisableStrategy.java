package StrategyPattern;

public class FlyingDisableStrategy implements FlyingStrategy{
    @Override
    public void fly() {
        System.out.println("Cannot fly..");
    }
}
