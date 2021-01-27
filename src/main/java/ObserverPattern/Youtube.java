package ObserverPattern;

import javax.inject.Inject;
import java.util.LinkedList;
import java.util.List;

public class Youtube implements VideoPlatform{

    private List subscriberList;
    private List videoList;
    public Youtube() {
        this.subscriberList = new LinkedList();
        this.videoList = new LinkedList();
    }

    @Override
    public void subscribe(User user) {
        if (!subscriberList.contains(user)){
            System.out.println("Subscribed");
            subscriberList.add(user);

        }
        else {
            System.out.println("Already Subscribed");
        }
    }

    @Override
    public void unsubscribe(User user) {
        if (!subscriberList.contains(user)){
            System.out.println("Not Registered");
        }
        else {
            System.out.println("Unsubscribed");
            subscriberList.remove(user);
        }
    }

    @Override
    public void notifyUsers(String name) {
        for (Object ob : subscriberList){
            User subscriber = (User)ob;
            subscriber.popUp(name + " Uploaded");
        }
    }

    @Override
    public List getVideos(){
        return videoList;
    }

    @Override
    public void addVideo(String name) {
        videoList.add(name);
        notifyUsers(name);
    }
    @Override
    public void removeVideo(String name) {
        videoList.remove(name);
    }

    @Override
    public void displaySubscriberList(){
        System.out.println("Subscribed to This Channel : ");
        for (Object o : subscriberList){
            Subscriber subscriber = (Subscriber) o;
            System.out.print(subscriber.getUserName() + " ");
        }
        System.out.println();
    }

    @Override
    public void displayVideoList(){
        System.out.println("Videos on this channel");
        System.out.println(videoList.toString());
    }
}
