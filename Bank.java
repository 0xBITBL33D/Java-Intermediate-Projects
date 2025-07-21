public class Bank{
    
    public String menu = "Welcome to Bitbl33d's Bank!\n\n"  +
                         "[0] - Make an Account\n"          +
                         "[1] - Deposit"                    +
                         "[2] - Withdraw"                   +
                         "[3] - Delete an Account"          ;


    public static void main(String[] args) {
        Bank Bank = new Bank();

        System.out.print(Bank.menu);

        
    }
}
