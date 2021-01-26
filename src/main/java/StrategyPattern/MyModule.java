package StrategyPattern;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EatingStrategy.class).annotatedWith(Names.named("SlowEat")).to(EatingSlowStrategy.class);
        bind(EatingStrategy.class).annotatedWith(Names.named("FastEat")).to(EatingFastStrategy.class);
        bind(EatingStrategy.class).annotatedWith(Names.named("DisableEat")).to(EatingDisableStrategy.class);

        bind(FlyingStrategy.class).annotatedWith(Names.named("SlowFly")).to(FlyingSlowStrategy.class);
        bind(FlyingStrategy.class).annotatedWith(Names.named("FastFly")).to(FlyingFastStrategy.class);
        bind(FlyingStrategy.class).annotatedWith(Names.named("DisableFly")).to(FlyingDisableStrategy.class);

        bind(QuackingStrategy.class).annotatedWith(Names.named("QuackSlow")).to(QuackingSlowStrategy.class);
        bind(QuackingStrategy.class).annotatedWith(Names.named("QuackLoud")).to(QuackingLoudStrategy.class);
        bind(QuackingStrategy.class).annotatedWith(Names.named("DisableQuack")).to(QuackingDisableStrategy.class);

    }
}
