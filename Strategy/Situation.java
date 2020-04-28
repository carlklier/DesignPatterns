package Strategy;

public class Situation {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        if(strategy == null){
            System.out.println("You couldn't decide on a strategy and the enemy cought you in the open.");
        } else {
            strategy.execute();
        }
        
    }

}