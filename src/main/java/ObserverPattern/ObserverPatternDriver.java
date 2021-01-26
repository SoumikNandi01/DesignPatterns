package ObserverPattern;

public class ObserverPatternDriver {
    public static void main(String[] args) {
        VideoPlatform youtube = new Youtube();

        User soumik = new Subscriber("Soumik", youtube);
        User ally = new Subscriber("Ally", youtube);


        soumik.displayNotificationList();
        soumik.displayPlaylist();


        youtube.addVideo("Video1");
        youtube.addVideo("Video2");
        youtube.displaySubscriberList();
        youtube.displayVideoList();


        youtube.subscribe(soumik);
        youtube.displaySubscriberList();

        soumik.displayNotificationList();
        soumik.displayPlaylist();

        soumik.getUpdatedPlaylist();



    }

}
