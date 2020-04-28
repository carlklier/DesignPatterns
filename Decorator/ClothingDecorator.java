package Decorator;

public abstract class ClothingDecorator implements Layerable{
    protected Layerable layer;

    public ClothingDecorator(Layerable layer){
        this.layer = layer;
    }

    @Override
    public String getLayers() {
        return layer.getLayers();
    }

}