package Strategy;

public class SituationTester {
    public static void main(String[] args){
        Situation fightOrFlight = new Situation();
        fightOrFlight.executeStrategy();
        fightOrFlight.setStrategy(new HideStrategy());
        fightOrFlight.executeStrategy();
        fightOrFlight.setStrategy(new AttackStrategy());
        fightOrFlight.executeStrategy();
    }
}