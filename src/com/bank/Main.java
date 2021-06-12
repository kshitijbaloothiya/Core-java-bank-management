package com.bank;

import java.util.Scanner;

//operations will perform all the three required actions as per the user
class operations{
    byte cond = 0;
    byte choice = 0;
    int change = 0;
    Scanner in = new Scanner(System.in);

    public int balance(int bal1) {
        while(cond == 0){
            System.out.println("Enter the operation");
            System.out.println("1. Add balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Check");
            System.out.print("4. Exit:");
            choice = in.nextByte();
            switch (choice){
                case 1://Adding the balance
                    System.out.print("Enter:");
                    change = in.nextInt();
                    if(change<0){
                        System.out.println("Negative not allowed\n");
                        continue;
                    }
                    else
                        bal1 = bal1 + change;
                    break;
                case 2://Withdrawal
                    System.out.print("Enter:");
                    change = in.nextInt();
                    if(change<0 || change>bal1){
                        System.out.println("Something is wrong\n");
                        continue;
                    }
                    else
                        bal1 = bal1 - change;
                    break;
                case 3://Balance check
                    System.out.println(bal1);
                    break;
                case 4://Exiting the code
                    System.out.println("Bye");
                    System.exit(0);
            }

        }
        return bal1;
    }
}
class cust1 extends operations{
    public int bal2 = 0;

}
class cust2 extends operations{
    public int bal3 = 0;
}
public class Main {

    public static void main(String[] args) {
        // Creating two customers
        Scanner in = new Scanner(System.in);
        int custNum;
        int custPin;
        System.out.print("Enter customer number:");
        custNum = in.nextInt();
        //Checking if the customer exist or not
        //Calling the function depending on the customer num
        if (custNum == 12345678) {
            System.out.print("Enter pin:");
            custPin = in.nextInt();
            if (custPin == 1234) {
                cust1 obj = new cust1();
                obj.bal2 = obj.balance(obj.bal2);

            } else {
                System.out.println("wrong pin");
                System.exit(0);
            }
        } else if(custNum == 2468) {
            System.out.println("Enter pin");
            custPin = in.nextInt();
            if (custPin == 2468) {
                cust2 obj = new cust2();
                obj.bal3 = obj.balance(obj.bal3);
            } else {
                System.out.println("wrong pin");
                System.exit(0);
            }
        }
        else{
            System.out.println("No such customer\nBye");
            System.exit(0);
        }
    }
}
