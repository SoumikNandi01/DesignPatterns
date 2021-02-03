package ObserverPattern;

import java.util.List;

public interface VideoPlatform {
    void subscribe(User user);
    void unsubscribe(User user);
    void notifyUsers(String name);
    List getVideos();
    void addVideo(String name);
    void removeVideo(String name);
    void displaySubscriberList();
    void displayVideoList();
}
