/*
    Create a BankAccount class that lets users:

    Set an initial balance via constructor

    Deposit and withdraw money

    Check the current balance

    Prevent balance from going negative (encapsulation logic)
 */

import java.util.Scanner;

public class Bank{
    
    public static String menu = "Welcome to Bitbl33d's Bank!\n\n"  +
                         "[0] - Make an Account\n"          +
                         "[1] - Deposit"                    +
                         "[2] - Withdraw"                   +
                         "[3] - Delete an Account"          ;


    //DEFAULT BALANCE
    private double bankBalance = 0;

    double getBalance(){
        return bankBalance;
    }

    int setBalance(double NewBalance, int choice){

        while(true) {
            if(choice == 1 && NewBalance > getBalance()) {
                
            }
        }

    }

    //MENU LOOP
    public static void MenuLoop(Scanner sc) {
        while(true)
        {
            System.out.print(menu);

        }
    }

    public static void main(String[] args) {
        Bank Bank = new Bank();

        System.out.print(menu);

        Scanner sc = new Scanner(System.in);

        sc.close();

        
    }
}
