package ObserverPattern;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ObserverPatternDriver {
    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new MyModule());

        VideoPlatform youtube = injector.getInstance(VideoPlatform.class);
        User ally = injector.getInstance(User.class);


        ally.displayPlaylist();

        youtube.subscribe(ally);
        youtube.addVideo("Video1");

        ally.displayNotificationList();

        youtube.displayVideoList();

        ally.getUpdatedPlaylist();
        ally.displayPlaylist();


    }

}
