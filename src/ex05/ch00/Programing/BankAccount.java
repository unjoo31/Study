package ex05.ch00.Programing;

class Bank{
    int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public void widthdraw(int amount){
        balance -= amount;
    }

    public void deposit(int amount){
        balance += amount;
    }

    @Override
    public String toString() {
        return "Bank [balance=" + balance + "]";
    }

    public int transfer(int amount, Bank otherAccount){
        System.out.println("transfer(" +amount+")");
		otherAccount.deposit(amount);
		balance-=amount;
		return (balance-amount);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank a1 = new Bank(10000);
        Bank a2 = new Bank(0);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        a1.transfer(1000, a2);
        System.out.println("a1:" + a1);
        System.out.println("a2: " + a2);
    }
}
