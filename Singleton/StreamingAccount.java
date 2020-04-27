package Singleton;

import java.util.ArrayList;
import java.util.List;

public class StreamingAccount {
    private static StreamingAccount account = null;
    private List<String> watchList;

    private StreamingAccount() {
        watchList = new ArrayList<String>();
    }

    public static StreamingAccount getInstance() {
        if (account == null) {
            account = new StreamingAccount();
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