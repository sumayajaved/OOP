class Account {
    int balance;

    Account() {
        balance = 1000;
    }
    Account(int initialBalance, int extra) {
        balance = initialBalance + extra;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(500);
        a.withdraw(200);
        a.showBalance();

        Account b = new Account(2000, 500);
        b.showBalance();
    }
}