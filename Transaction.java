

class Main {
    String id, sender, receiver, status, date;
    double amount;

    Main(String id, String sender, String receiver, double amount, String status, String date) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    void display() {
        System.out.println(id + " | " + sender + " -> " + receiver + " | " + amount + " | " + status + " | " + date);
    }
}

public class Transaction {
    public static void main(String[] args) {
        System.out.println("\nTransactions:");
        Main t1 = new Main("T001", "John", "Alice", 200, "Successful", "14-05-2025");
        Main t2 = new Main("T002", "John", "Bob", 150, "Failed", "13-05-2025");

        t1.display();
        t2.display();
    }
}
