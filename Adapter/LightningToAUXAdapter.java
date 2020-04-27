package Adapter;

public class LightningToAUXAdapter implements AUXPlayable {
    NewIphone newIphone;

    public LightningToAUXAdapter(NewIphone newIphone){
        this.newIphone = newIphone;
    }

    @Override
    public void playThroughAUX() {
        newIphone.playThroughLightning();
    }
}