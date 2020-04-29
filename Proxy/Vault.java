package Proxy;

public interface Vault {
    public String withdrawMoney(Employee vaultOpener, double ammount);
    public String depositMoney(Employee vaultOpener, double ammount);
    public double getBalance();
}