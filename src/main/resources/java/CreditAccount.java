public class CreditAccount extends Account {
    public static boolean credit(Account account, int balance, int amount) {
        return (balance + amount > 0) && (account.toString().equals("Кредитный счет"));
    }

    private int limit = 50_000;

    public CreditAccount(int balance) {
        super(balance);
    }


    @Override
    public void pay(int amount) {
        if ((amount + Math.abs(balance)) > limit) {
            System.out.println("Вы превысили лимит денежных средств на Кредитном счете");
            return;
        } else {
            System.out.println("Совершен платеж с Кредитного счета на " + amount + " рублей");
            balance -= amount;
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (Math.abs(balance - amount) > limit) {
            System.out.println("Вы ввели сумму, превышаюшую лимит");
        } else {
            if (account.addMoney(amount) == false) {
                return;
            } else {
                System.out.println("Выполнен перевод с Кредитного счета на " + account + " в размере " + amount + " рублей");
                balance -= amount;
            }
        }
    }

    @Override
    public boolean addMoney(int amount) {
        if (balance + amount > 0) {
            System.out.println("Сумма пополнения Кредитного cчета не должна превышать " + Math.abs(balance) + " рублей");
            return false;
        } else {
            System.out.println("Кредитный счет пополнен на " + amount + " рублей");
            balance += amount;
            return true;
        }
    }

    public String toString() {
        return "Кредитный счет";
    }
}
