package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account;


        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account Holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there  an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, name, initialDeposit);
        }
        else{
            account = new Account(number, name);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter deposite value: ");
        double depositValue= sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue= sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(account);


        sc.close();
    }
}