class Bank{

    String Menu = "Welcome to Bitbl33d's Bank\n"    +
                  "How may we help you?\n\n"        +


                  "[0] - Bank Balance\n"            +
                  "[1] - Withdraw\n"                +
                  "[2] - Make a New Account\n"      +
                  "[3] - Draft a Complaint";

    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.print(bank.Menu);

    }
}
