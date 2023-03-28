package org.example;

import java.time.LocalDate;

// write here for properties and methods
// class should be generic, no names, should work for any data
public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;
    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber) { //Constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public void deposit (int amount) {
        this.balance += amount;
        }
        public void withdraw (int amount){
        this.balance-= amount;
        }
// SETTING:
        public void setFirstName(String newName){
        this.firstName = newName;
        }

        public void setLastName(String newName) { this.lastName = newName;}

        public void setDateOfBirth(String birthday) {this.dateOfBirth = birthday;}

        public void setAccountNumber(int account) {this.accountNumber = account;}


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void interest(double interestRate){
        this.balance += (interestRate/100 * this.balance);
        // OR can -> this.balance *= (1 + (interestTate/100))
    }
}



