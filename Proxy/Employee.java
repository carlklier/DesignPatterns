package Proxy;

public class Employee {
    private String name;
    private boolean depositAuthorized;
    private boolean withdrawlAuthorized;

    public Employee(String name, boolean depositAuthorized, boolean withdrawlAuthorized){
        this.name = name;
        this.depositAuthorized = depositAuthorized;
        this.withdrawlAuthorized = withdrawlAuthorized;
    }

}