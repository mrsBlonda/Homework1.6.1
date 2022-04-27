public abstract class Account {
    protected int balance;


    public Account(int balance) {
        this.balance = balance;
    }

    public void getBalance (Account account) {
        System.out.println(account + ": Ваш баланс равен " + balance);
    }

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract boolean addMoney(int amount);
}
