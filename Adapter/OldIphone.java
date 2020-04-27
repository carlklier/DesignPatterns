package Adapter;

public class OldIphone implements AUXPlayable {
	@Override
	public void playThroughAUX() {
		System.out.println("Playing music through AUX.");
		
	}
}