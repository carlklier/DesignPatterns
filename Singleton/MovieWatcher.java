package Singleton;

import java.util.concurrent.ThreadLocalRandom;

public class MovieWatcher implements Runnable{
    private static String[] favoriteMovies = new String[]{"Dark Knight", "Dark Knight Rises", "Inception", "Memento", "Adaptation", "The Prestige"};
    
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        StreamingAccount accountInstance = StreamingAccount.getInstance();
        System.out.println(currentThread.getId() + " is using Account ID: " + System.identityHashCode(accountInstance));
        
        String randomMovie = favoriteMovies[ThreadLocalRandom.current().nextInt(0, favoriteMovies.length)];

        accountInstance.addToWatchList(randomMovie);
        System.out.println(currentThread.getId() + " Has Watched: " + randomMovie);
        System.out.println(currentThread.getId() + " Has Account Watch History: " + accountInstance.getWatchList());
    }

}