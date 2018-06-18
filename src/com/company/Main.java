package com.company;


public class Main {



    public static void main(String[] args) {

        Menu n = new Menu();
        n.withDrawing();
         Account i = new CheckingAccount(1,15.0);

        Account s = new SavingsAccounts(1,100.0);

        System.out.print( i.toString());
         System.out.print(":::::::::::::::::::::::\n"+ s.toString());
    }


}