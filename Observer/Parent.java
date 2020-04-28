package Observer;

import java.util.ArrayList;

public class Parent implements Observer {
    String name;
    ArrayList<Child> kids;

    public Parent(String name){
        this.name = name;
        kids = new ArrayList<Child>();
    }

    public void registerKid(Child kid){
        kids.add(kid);
        kid.register(this);
    }

    public void unregisterKid(Child kid){
        int index = kids.indexOf(kid);
        kids.remove(index);
        kid.unregister(this);
    }

    @Override
    public void update(String name, String healthStatus) {
        System.out.println(name + " has notified " + this.name + " of his current health status: " + healthStatus);

    }

}