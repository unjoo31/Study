package ex05.ch00.Programing;

import java.security.cert.TrustAnchor;
import java.util.*;

class Account{
    int balance;
	double rate;
	String pin;

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	void setBalance(int accBal) {
		balance = accBal;
	}

	void setRate(double accRate) {
		rate = accRate;
	}

	void deposit(double dep) {
		balance += dep;
	}

	void withdraw(double wit) {
		balance -= wit;
	}

	int getBalance() {
		return balance;
	}

	double getRate() {
		return rate;
	}
}

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
		a1.setBalance(0);
		a1.setRate(3.00);
		a1.setPin("1234");

		Account a2 = new Account();
		a1.setBalance(0);
		a1.setRate(3.00);
		a1.setPin("1234");

        Scanner sc = new Scanner(System.in);

        System.out.println("PIN을 입력하시오:");
        int pin = sc.nextInt();
        if(a1.getPin().equals(pin) == false){
            System.out.println("PIN을 입력하시오:");
        }

        boolean session = true;
        while(session){
            System.out.print("\n" + "1. 현금 입금 \n" + "2. 현금 인출 \n" + "3. 계좌 이체 \n" + "4. 종료 \n");
            System.out.print("번호를 선택하세요:");
            int selection = sc.nextInt();

            switch(selection){
                case 1 :
                    System.out.println("입금액: ");
                    int deposit = sc.nextInt();

                    a1.deposit(deposit);
                    System.out.println("현재 잔액은" + a1.getBalance() + "입니다.");
                    break;

                case 2:
                    System.out.println("인출금액: ");
                    int widthdraw = sc.nextInt();

                    a1.withdraw(widthdraw);
                    System.out.println("현재 잔액은" + a1.getBalance() + "입니다.");
                    break;

                case 3:
                    System.out.println("이체액: ");
                    int withdraw2 = sc.nextInt();
                    a1.withdraw(withdraw2);
                    a2.deposit(withdraw2);
                    System.out.println("이체 계좌 번호:");
                    int number = sc.nextInt();
                    System.out.println("현재 잔액은" + a1.getBalance() + "입니다.");
                    System.out.println("이체되었습니다.");
                    break;

                case 4:
                    session = false;
                    break;
            }
        }
    }
}
