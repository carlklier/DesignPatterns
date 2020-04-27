package Singleton;

public class StreamingAccountTest {
    public static void main(String[] args){
        Runnable movieWatcher1 = new MovieWatcher();
        Runnable movieWatcher2 = new MovieWatcher();

        new Thread(movieWatcher1).start();
        new Thread(movieWatcher2).start();
    }
}