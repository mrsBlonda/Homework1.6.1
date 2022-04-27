public class CheckingAccount extends Account {
    public CheckingAccount(int balance) {
        super(balance);
    }


    @Override
    public void pay(int amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средст, максимальная сумма платежа с Расчетного счета равна " + balance + " рублей");
        } else {
            System.out.println("Совершен платеж с Расчетного счета на " + amount + " рублей");
            balance -= amount;
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средст, максимальная сумма перевода с Расчетного счета равна " + balance + " рублей");
        } else {
            if (account.addMoney(amount) == false) {
                return;
            } else {
                System.out.println("Выполнен перевод с Расчетного счета на " + account + " в размере " + amount + " рублей");
                balance -= amount;
            }
        }
    }

    @Override
    public boolean addMoney(int amount) {
        System.out.println("Расчетный счет пополнен на " + amount + " рублей");
        balance += amount;
        return true;
    }
    public String toString() {
        return "Расчетный счет";
    }
}
