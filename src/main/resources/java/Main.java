public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount0 = new SavingsAccount(0);
        CreditAccount creditAccount = new CreditAccount(0);
        CheckingAccount checkingAccount = new CheckingAccount(0);

        savingsAccount0.addMoney(2_000);
        savingsAccount0.transfer(creditAccount, 1_000);

        checkingAccount.addMoney(10_000);
        checkingAccount.pay(1_000);
        checkingAccount.transfer(creditAccount, 5_000);
        checkingAccount.transfer(savingsAccount0,3_000);

        creditAccount.transfer(savingsAccount0, 1_500);
        creditAccount.addMoney(150_000);
        creditAccount.addMoney(15_000);
        creditAccount.addMoney(1_500);

        checkingAccount.getBalance(checkingAccount);
        savingsAccount0.getBalance(savingsAccount0);
        creditAccount.getBalance(creditAccount);
    }
}
