package Decorator;

public class JacketDecorator extends ClothingDecorator {

    public JacketDecorator(Layerable layer) {
        super(layer);
        System.out.println("Adding Jacket Layer.");
    }

    @Override
    public String getLayers() {
        return layer.getLayers() + ", Jacket";
    }

}