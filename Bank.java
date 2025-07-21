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
    

    //GETTERS AND SETTERS
    double getBalance(){
        return bankBalance;
    }

    double setBalance(double baladjust, int choice){

        double NewBalance = baladjust;

        while(true) {

            //1
            if(choice == 1 && NewBalance > 0){
                return bankBalance += NewBalance;
            }

            else if(choice == 2 && NewBalance <= getBalance()){
                return bankBalance -= NewBalance;
            }

            else{
                System.out.println("Invalid\nNo Changes will be made.");
                System.out.print(bankBalance);
                return bankBalance;
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
