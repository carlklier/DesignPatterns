package Adapter;

public class LightningToAUXTest {
    public static void main(String[] args){
        OldIphone oldIphone = new OldIphone();
        oldIphone.playThroughAUX();

        NewIphone newIphone = new NewIphone();
        newIphone.playThroughLightning();

        LightningToAUXAdapter adapter = new LightningToAUXAdapter(newIphone);
        adapter.playThroughAUX();
    }
}