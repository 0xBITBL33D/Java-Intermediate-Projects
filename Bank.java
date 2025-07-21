/*
    Create a BankAccount class that lets users:

    Set an initial balance via constructor

    Deposit and withdraw money

    Check the current balance

    Prevent balance from going negative (encapsulation logic)
 */

import java.util.Scanner;

public class Bank{
    
    public static String menu = "Welcome to Bitbl33d's Bank!\n\n"   +
                         "[0] - Check Account\n"                   +
                         "[1] - Deposit\n"                          +
                         "[2] - Withdraw\n"                         +
                         "[3] - Delete an Account\nChoice: "        ; /*Still not needed but maybe we can pseudomake this
                                                                      by creating a string to create the illusion of a
                                                                      user. Then erasing that new string by calling [3]
                                                                      method                                            */


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
                bankBalance += NewBalance;
                System.out.printf("Your Bank Balance: %d", getBalance());
                return bankBalance;
            }

            //2
            else if(choice == 2 && NewBalance <= getBalance()){
                bankBalance -= NewBalance;
                System.out.printf("Your Bank Balance: %d", getBalance());
                return bankBalance;
                
            }

            else{
                System.out.println("Invalid\nNo Changes will be made.");
                System.out.printf("Your Bank Balance: %d", getBalance());
                return bankBalance;
            }
        }

    }

    public double checkDoubleValidity(Scanner sc){

        while(true){
            if(sc.hasNextDouble()){
                double adjustBal = sc.nextDouble();

                return adjustBal;
            }

            else{
                continue;
            }
        }
    }

    //MENU LOOP
    public void MenuLoop(Scanner sc) {
        while(true)
        {
            System.out.print(menu);

            if(sc.hasNextInt()) {
                int choice = sc.nextInt();

                switch(choice){

                    case 0:
                    System.out.println("Your Bank Balance is: " + getBalance());
                    break;

                    case 1:

                    System.out.print("Enter Your Money: ");
                    setBalance(checkDoubleValidity(sc), choice);
                    
                }
            
            }

        }
    }

    public static void main(String[] args) {
        Bank Bank = new Bank();
        Scanner sc = new Scanner(System.in);
        Bank.MenuLoop(sc);
        
    }
}
