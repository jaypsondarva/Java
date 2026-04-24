import java.util.Scanner;

class Payment {
    void processPayment(int amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done Using Credit Card");
    }
}

class UPIPayment extends Payment {
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Name : Jay");
        System.out.println("Enrollment : 240390107051");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount:");
        int amount = sc.nextInt();
        System.out.println("Choose Payment Method: 1.Credit Card  2.UPI");
        int choice = sc.nextInt();

        Payment p;

        if (choice == 1) {
            p = new CreditCardPayment();
        } else {
            p = new UPIPayment();
        }

        p.processPayment(amount);
    }
}
