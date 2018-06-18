package com.company;
import java.util.Random;
abstract public class Account
{
    protected int AccountNumber;
    protected double balance;

    Random generator = new Random();
    public Account( int accountNum, double initialDeposit)
    {
        AccountNumber=  accountNum = generator.nextInt(90000)+10000;
        balance = initialDeposit;

    }
    public int ActNum( )
    {
        return AccountNumber;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public double actBalance()
    {

        return balance;
    }

    public String toString()
    {
        String result = " Account Number : " + ActNum() + "\n";
        result += " Account Balance : " + actBalance() ;
        return result;
    }
    public abstract double withDraw();

}