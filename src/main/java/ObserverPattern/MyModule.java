package ObserverPattern;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(User.class).to(Subscriber.class).in(Singleton.class);
        bind(VideoPlatform.class).to(Youtube.class).in(Singleton.class);
        bind(String.class).annotatedWith(Names.named("userName")).toInstance("Ally");
    }
}
