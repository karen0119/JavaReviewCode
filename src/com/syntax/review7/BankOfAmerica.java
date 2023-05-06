package com.syntax.review7;

public class BankOfAmerica {
    public static void main(String[] args) {


        BankAccount bank = new BankAccount(); // object of BankAccount class
        bank.accountHolder="John Smith";
        bank.accountNumber=564632326L;
        bank.accountBalance=20;
        bank.ssn=76896;

        // accessing static variables
        System.out.println(BankAccount.bankName);

        BankAccount bank1=new BankAccount();
        bank1.accountHolder="Jane Smith";
        bank1.accountNumber=1111115528L;
        bank1.accountBalance=2000; 
        bank1.ssn=76896655;

    }
}
