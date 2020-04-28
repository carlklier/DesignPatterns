package Observer;

import java.util.ArrayList;

public class Child implements Subject {
    private ArrayList<Observer> observers;
    private String name;
    private String healthStatus;

    public Child(String name){
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        System.out.println("An observer has been added to the observers list.");
        observers.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        int index = observers.indexOf(observer);
        System.out.println("An observer has been removed from the observers list.");
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this.name, this.healthStatus);
        }

    }

}