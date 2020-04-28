package Decorator;

public class Dresser {
    public static void main(String[] args){
        Layerable layer = new NakedTorso();
        System.out.println("Current Layers: " + layer.getLayers());
        layer = new SweatshirtDecorator(layer);
        System.out.println("Current Layers: "+ layer.getLayers());
        layer = new JacketDecorator(layer);
        System.out.println("Current Layers: "+ layer.getLayers());
        
    }
}