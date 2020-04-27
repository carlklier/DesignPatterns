package Command;

public class OrderPizzaCommand implements Command{
    public Restaurant restaurant;

    public OrderPizzaCommand(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    @Override
    public void execute() {
        restaurant.cookPizza();
    }

}