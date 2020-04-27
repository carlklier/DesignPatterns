package Command;

public class OrderPastaCommand implements Command {
    Restaurant restaurant;

    public OrderPastaCommand(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    @Override
    public void execute() {
        restaurant.cookPasta();
    }

}