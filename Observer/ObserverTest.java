package Observer;

public class ObserverTest {
    public static void main(String[] args){
        Child child1 = new Child("Son");

        Parent parent1 = new Parent("Mom");
        parent1.registerKid(child1);

        child1.setHealthStatus("I am healthy.");

        Parent parent2 = new Parent("Dad");
        parent2.registerKid(child1);
        child1.setHealthStatus("I am still healthy.");

        parent1.unregisterKid(child1);

        child1.setHealthStatus("I am badly injured.");

    }
}