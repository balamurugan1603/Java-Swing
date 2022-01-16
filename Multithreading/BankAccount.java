package Multithreading;

class BankAccount {
    public static void main(String args[]) {
        Customer c = new Customer(5000);

        new Thread() {
            public void run() {
                c.withdraw(6000);
            }
        }.start();

        new Thread() {
            public void run() {
                c.deposit(2000);
            }
        }.start();
    }
}

class Customer {
    
    private int balance;

    Customer(int balance) {this.balance = balance;}

    synchronized void withdraw(int amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient balance...Waiting for deposit...");
            try {wait();} catch(Exception e){};

        } 
        this.balance -= amount;
        System.out.println("withdrawn " + amount);
        System.out.println("Balance after withdraw : " + this.balance);
    }

    synchronized void deposit(int amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount);
        System.out.println("Balance after deposit : " + this.balance);
        notify();
    }
}
