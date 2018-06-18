package com.company;

public class CheckingAccount extends Account{

    private int minimumBalance  ;
    private double OverDraftFee = 20;
    private double withDraws;
    private double balance;
    public CheckingAccount (int accountNum, double initialDeposit)
    {
        super (accountNum, initialDeposit);
    }

    public double minimumBal()
    {
        minimumBalance = 100;

        return minimumBalance;
    }

    public double Overdraft()
    {
        if(this.actBalance() < minimumBal())
        {
            balance = this.actBalance() - OverDraftFee;
        }
        else
        {
            balance = this.actBalance();
        }
        return balance;
    }

    public double AcctBalance()
    {

        return balance;


    }

    public String toString()
    {
        String result= super.toString();
        result += "\n Minimum Balance Required : " + minimumBal() +" \n";
        return result;
    }
    public double withDraw()
    {


        return withDraws;
    }
}