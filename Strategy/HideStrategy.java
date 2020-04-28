package Strategy;

public class HideStrategy implements Strategy {

    @Override
    public void execute() {
        System.out.println("You have hidden from the enemy and are safe.");
    }
    
}