import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {
    String item;
    int qty;
    int orderId;

    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        this.orderId = (int)(Math.random() * 1000);
        System.out.println("Order placed. Order ID: " + orderId);
    }
}

class FinalOrder extends PartialOrder {
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order cancelled for ID: " + orderId);
        } else {
            System.out.println("Invalid Order ID");
        }
    }

    public void generateBill() {
        double price = 100;
        double total = qty * price;
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: Rs. " + total);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Name : Jay");
        System.out.println("Enrollment : 240390107051");

        Scanner sc = new Scanner(System.in);

        FinalOrder o = new FinalOrder();

        System.out.print("Enter Item: ");
        String item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        o.placeOrder(item, qty);

        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");
        int choice = sc.nextInt();

        if (choice == 1) {
            o.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID: ");
            int id = sc.nextInt();
            o.cancelOrder(id);
        }
    }
}
