package com.company;
import javax.swing.*;
import java.lang.reflect.Constructor;

public class BankAccount {

    //variables
    private String bankName;
    private double balance;
    private int bankPin;

    //Constructor
    public BankAccount(String bankName , double balance){
        this.bankName = bankName;
        this.balance = balance;

    }

    //get and set method
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }


    public void setBankPin(int bankPin) {
        this.bankPin = bankPin;
    }

    public int getBankPin() {
        return bankPin;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void withdrawal(double withdrawal) {
        if (withdrawal > balance) {
            System.out.println("insufficient balance");
        }
        else{
            this.balance = balance - withdrawal;
        }
    }
}