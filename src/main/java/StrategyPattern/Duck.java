package StrategyPattern;

import com.google.inject.name.Named;

import javax.inject.Inject;

public class Duck {

    EatingStrategy eatingStrategy;
    FlyingStrategy flyingStrategy;
    QuackingStrategy quackingStrategy;

    @Inject
    public Duck(@Named("FastEat") EatingStrategy eatingStrategy, @Named("FastFly") FlyingStrategy flyingStrategy, @Named("QuackSlow") QuackingStrategy quackingStrategy) {
        this.eatingStrategy = eatingStrategy;
        this.flyingStrategy = flyingStrategy;
        this.quackingStrategy = quackingStrategy;
    }

    public void quack(){
        quackingStrategy.quack();
    }
    public void fly(){
        flyingStrategy.fly();
    }
    public void eat(){
        eatingStrategy.eat();
    }

}
