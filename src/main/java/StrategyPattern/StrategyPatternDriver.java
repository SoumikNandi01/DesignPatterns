package StrategyPattern;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class StrategyPatternDriver {
    public static void main(String args[]){
        Injector injector = Guice.createInjector(new MyModule());
        Duck rubberDuck  = injector.getInstance(Duck.class);
        rubberDuck.eat();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}
