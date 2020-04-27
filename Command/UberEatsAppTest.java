package Command;

public class UberEatsAppTest {
    public static void main(String[] args){
        UberEatsApp app = new UberEatsApp();
        CheapChainRestaurant cheapos = new CheapChainRestaurant();
        FancyItalianRestaurant primos = new FancyItalianRestaurant();

        app.order();

        app.setCommand(new OrderPastaCommand(cheapos));
        app.order();
        app.setCommand(new OrderPastaCommand(primos));
        app.order();
        app.setCommand(new OrderPizzaCommand(cheapos));
        app.order();
        app.setCommand(new OrderPizzaCommand(primos));
        app.order();
    }
}