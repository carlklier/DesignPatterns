package Singleton;

import java.util.concurrent.ThreadLocalRandom;

public class MovieWatcher implements Runnable{
    private static String[] favoriteMovies = new String[]{"Dark Knight", "Dark Knight Rises", "Inception", "Memento", "Adaptation", "The Prestige"};
    
    @Override
    public void run() {
        StreamingAccount accountInstance = StreamingAccount.getInstance();
        System.out.println("Account ID: " + System.identityHashCode(accountInstance));

        System.out.println(accountInstance.getWatchList());
        
        String randomMovie = favoriteMovies[ThreadLocalRandom.current().nextInt(0, favoriteMovies.length)];
        accountInstance.addToWatchList(randomMovie);

        System.out.println("Watched Movie: " + randomMovie);
        System.out.println(accountInstance.getWatchList());
    }

}