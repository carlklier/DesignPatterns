package Singleton;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StreamingAccount {
    private static StreamingAccount account = null;
    private List<String> watchList;

    private StreamingAccount() {
        watchList = new CopyOnWriteArrayList<String>();
    }

    public static StreamingAccount getInstance() {
        if (account == null) {
            synchronized(StreamingAccount.class){
                if(account == null){
                    account = new StreamingAccount();
                }
            }
        }
        return account;
    }

    public List<String> getWatchList(){
        return watchList;
    }

    public void addToWatchList(String video){
        watchList.add(video);
    }
}