package Strategy;

public class AttackStrategy implements Strategy{

    @Override
    public void execute() {
        System.out.println("You have attacked and defeated the enemy.");
    }

}