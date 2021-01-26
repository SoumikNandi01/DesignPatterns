package ObserverPattern;

public interface VideoPlatform {
    void subscribe();
    void unsubscribe();
    void notifyUsers();
}
