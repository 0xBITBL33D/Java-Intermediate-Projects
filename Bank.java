/*
    Create a BankAccount class that lets users:

    Set an initial balance via constructor

    Deposit and withdraw money

    Check the current balance

    Prevent balance from going negative (encapsulation logic)
 */

import java.util.Scanner;

public class Bank{
    
    public String menu = "Welcome to Bitbl33d's Bank!\n\n"  +
                         "[0] - Make an Account\n"          +
                         "[1] - Deposit"                    +
                         "[2] - Withdraw"                   +
                         "[3] - Delete an Account"          ;


    //DEFAULT BALANCE
    private double bankBalance = 0;

    void getBalance(){
        System.out.print(bankBalance);
    }

    //MENU LOOP
    public static void MenuLoop() {
        
    }

    public static void main(String[] args) {
        Bank Bank = new Bank();

        System.out.print(Bank.menu);

        Scanner sc = new Scanner(System.in);

        

        
    }
}
