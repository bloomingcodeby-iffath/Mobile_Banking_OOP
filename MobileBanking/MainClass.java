package com.bankManagement;
import java.util.Scanner;
public class MainClass{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String address,email,phone;

        System.out.println("Enter the extra details of User: ");
        System.out.println("Address: " );address=sc.nextLine();
        System.out.println("Email: ");email=sc.nextLine();
        System.out.println("Phone: ");phone=sc.nextLine();
        User u1=new User(address,email,phone);


        String name,walletid;
        double balence;
        System.out.println("Enter Bkash Details: ");
        System.out.println("NAme: ");name=sc.nextLine();
        System.out.println("Walletid: "); walletid=sc.nextLine();
        System.out.println("Blance: ");balence=sc.nextDouble();

        Bkash b=new Bkash(u1,name,walletid,balence);
        b.printdetails();

        System.out.println("add amount: ");
        double addamount;
        addamount=sc.nextDouble();
        b.addMoney(addamount);
        b.print_addamount();

        System.out.println("Withdraw amount: ");
        double wamount;
        wamount=sc.nextDouble();
        b.withdraw(wamount);
        b.print_wamount();

        System.out.println("Send amount: ");
        double Samount;
        Samount=sc.nextDouble();
        b.sendMoney(Samount,walletid);
        b.print_sendamount();

    }
}

