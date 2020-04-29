package Proxy;

public class ProxyVault implements Vault {
    private Vault vault;

    public ProxyVault(Vault vault){
        this.vault = vault;
    }

    @Override
    public String withdrawMoney(Employee vaultOpener, double ammount) {
        if(vaultOpener.isAuthorizedForWithdrawl()){
            return vault.withdrawMoney(vaultOpener, ammount);
        } else {
            return vaultOpener.getName() + " is not authorized for withdraws.";
        }
        

    }

    @Override
    public String depositMoney(Employee vaultOpener, double ammount) {
        if(vaultOpener.isAuthorizedForDeposit()){
            return vault.depositMoney(vaultOpener, ammount);
        } else {
            return vaultOpener.getName() + " is not authorized for deposits.";
        }

    }

    @Override
    public double getBalance() {
        return vault.getBalance();
    }

}