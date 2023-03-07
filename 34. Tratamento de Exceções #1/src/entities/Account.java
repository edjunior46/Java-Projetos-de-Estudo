package entities;

import exceptions.WithdrawException;

public class Account {
    
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
         this.number = number;
         this.holder = holder;
         this.balance = balance;
         this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Double getWithdrawLimit() {
        return this.withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(Double amount) {
        if (amount > getWithdrawLimit()) {
            throw new WithdrawException("Withdraw Error: The amount exceeds withdraw limit");
        }
        
        if (amount > getBalance()) {
            throw new WithdrawException("Withdraw Error: Not enough balance");
        }
    }

}
