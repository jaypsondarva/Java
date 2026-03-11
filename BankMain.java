class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
        System.out.println("Account opened successfully");
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


class SavingAccount extends BankAccount {

    void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        System.out.println("Interest on Saving Account: " + interest);
    }
}


class FixedDepositAccount extends BankAccount {

    void maturityAmount(double rate, int time) {
        double maturity = balance + (balance * rate * time / 100);
        System.out.println("Maturity Amount: " + maturity);
    }
}


class BankMain {
    public static void main(String args[]) {

        SavingAccount s1 = new SavingAccount();
        s1.openAccount(101, "Jay", 10000);
        s1.deposit(2000);
        s1.withdraw(1500);
        s1.checkBalance();
        s1.calculateInterest(5);

        System.out.println();

        FixedDepositAccount f1 = new FixedDepositAccount();
        f1.openAccount(201, "Rahul", 20000);
        f1.deposit(5000);
        f1.checkBalance();
        f1.maturityAmount(7, 3);
    }
}