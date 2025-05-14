class main{
    String name;
    String accountNumber;
    int age;

    main(String name, String accountNumber, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account: " + accountNumber);
        System.out.println("Age: " + age);
    }
}



public class BankCustomer{
    public static void main(String[] args) {
        main c = new main("John", "ACC123", 25);
        c.display();

        
    }
}