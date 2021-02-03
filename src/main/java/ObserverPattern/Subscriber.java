package ObserverPattern;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.LinkedList;
import java.util.List;

public class Subscriber implements User{

    private List subscribedList;
    private boolean isSubscribed;
    private List notificationList;

    public String userName;
    private VideoPlatform videoPlatform;


    @Inject
    public Subscriber(@Named("userName") String userName, VideoPlatform videoPlatform) {
        this.subscribedList = new LinkedList();
        this.userName = userName;
        this.videoPlatform = videoPlatform;
        this.isSubscribed = false;
        this.notificationList = new LinkedList();
    }

    @Override
    public void getUpdatedPlaylist() {
        subscribedList = videoPlatform.getVideos();
    }

    @Override
    public void popUp(String message) {
        System.out.println(message);
        notificationList.add(message);
    }

    @Override
    public void displayPlaylist(){
        System.out.println(userName + "'s Subscribed List");
        System.out.println(subscribedList.toString());
    }

    @Override
    public void displayNotificationList(){
        System.out.println(userName + "'s Notification");
        System.out.println(notificationList.toString());
    }

    public String getUserName() {
        return userName;
    }
}
