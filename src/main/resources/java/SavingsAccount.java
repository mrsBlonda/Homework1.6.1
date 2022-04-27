public class SavingsAccount extends Account {
    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Данная операция не может быть совершена");
        return;
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("Сумма перевода превышает остаток на Сберегательном счете, введите сумму меньшую " + balance + " рублей");
        } else {
            if (account.addMoney(amount) == false) {
                return;
            } else {
                System.out.println("Выполнен перевод с Сберегательного счета на " + account + " в размере " + amount + " рублей");
                balance -= amount;
            }
        }
    }

    @Override
    public boolean addMoney(int amount) {
        System.out.println("Сберегательный счет пополнен на " + amount + " рублей");
        balance += amount;
        return true;
    }

    public String toString() {
        return "Сберегательный счет";
    }
}
