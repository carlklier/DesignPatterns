package Proxy;

public class StoreVault implements Vault {
    private double balance;

    public StoreVault(double balance){
        this.balance = balance;
    }

    @Override
    public String withdrawMoney(Employee vaultOpener, double ammount) {
        balance = balance - ammount;
        return "Took out " + ammount;
    }

    @Override
    public String depositMoney(Employee vaultOpener, double ammount) {
        balance = balance + ammount;
        return "Put in " + ammount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

}