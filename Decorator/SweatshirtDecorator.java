package Decorator;

public class SweatshirtDecorator extends ClothingDecorator{

    public SweatshirtDecorator(Layerable layer) {
        super(layer);
        System.out.println("Adding Sweatshirt Layer.");
    }

    @Override
    public String getLayers() {
        return layer.getLayers() + ", Sweatshirt";
    }

}