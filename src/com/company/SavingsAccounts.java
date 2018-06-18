package com.company;

public class SavingsAccounts extends Account
{
    private double interestRate = 15 ;
    private double balance;
    private double withDraws;
    public SavingsAccounts(int accountNum, double initialDeposit)
    {
        super(accountNum, initialDeposit);
    }

    public double AddInterest()
    {
        double interestCharged = ((this.actBalance() * interestRate)/12)/100;
        return interestCharged;
    }

    public double monthlyBalance()
    {
        double currentBalance = this.actBalance()+ AddInterest() ;
        return currentBalance;
    }

    public String toString()
    {
        String result= super.toString();
        result += "\n Interest Rate : " + interestRate +"\n Interest Gained: "+ AddInterest();
        if(this.actBalance() < 100){
            result +=" \nAccount Balance is Low " +"\nFee Deducted from the account $5.";
            double bbalance = monthlyBalance() - 5;
            result += "\n Current Balance : " + bbalance;
        }
        else{
            result += "\n Current Balance : " + monthlyBalance();
        }
        return result;
    }
    public double withDraw()
    {
        return withDraws;
    }
}