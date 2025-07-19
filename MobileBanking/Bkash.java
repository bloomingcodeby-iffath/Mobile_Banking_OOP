package com.bankManagement;

public class Bkash {
    public User user;
    private String ownerName;
    private  String walletId;
    private double balence;

    public Bkash(User user,String ownerName,  String walletId,double balence) {
        this.user = user;
        this.balence = balence;
        this.ownerName = ownerName;
        this.walletId = walletId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getWalletId() {
        return walletId;
    }

    public double getBalence() {
        return balence;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }
    double addMoney(double amount){
        balence+=amount;
        return balence;
    }
    double withdraw(double amount){
        if (amount<=balence){
            balence-=amount;
            return balence;
        }
        else System.out.println("Error");
        return 0;

    }
    double sendMoney(double Samount,String wallet){
        if (Samount<=balence && this.walletId==wallet){
            balence-=Samount;
            return balence;
        }
        else System.out.println("Error");
        return 0;

    }

    void print_addamount(){
        System.out.println("Successfully addd amount to the wallet ,new balence: "+ balence);
    }
    void print_wamount(){
        System.out.println("Successfully withdraw amount to the wallet, new balence :"+ balence);
    }
    void print_sendamount(){
        System.out.println("Successfully send amount from the wallet, new balence: "+ balence);
    }
    void printdetails(){
        System.out.println("Details of Owner of Bkash: ");
        System.out.println("UserInfo: "+user);
        System.out.println("Name: "+getOwnerName());
        System.out.println("WalletId: "+getWalletId());
        System.out.println("Balance: "+getBalence());

    }

}
