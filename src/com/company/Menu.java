package com.company;
public class Menu{

    private Account[] bank;
    public Menu(){


        bank = new Account[1];

        bank [0] = new CheckingAccount (1,15000);

    }
    public void withDrawing()
    {
        double amount;
        for(int i =0;i< bank.length;i++)
        {
            System.out.println(bank[i]);
            amount = bank[i].withDraw();
            if(amount == 0.0 )
                System.out.println (" Thanks!");
            else
                System.out.println ("Paid: " + amount);



        }



    }
}