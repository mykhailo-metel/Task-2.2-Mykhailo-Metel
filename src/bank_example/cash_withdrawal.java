package bank_example;

/**
 * Created by mihail on 03.02.2017.
 */
// задание:
//    Continue with BANK example
//            2.1 Write method which withdraws money from account and takes commision 5% of the transaction.
//          Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.
//
//            Example
//
//            Input
//
//            balance = 100
//            withdrawal = 10
//
//            Output
//            OK 0.5 89.5
//
//            Input
//
//            balance = 100
//            withdrawal = 99
//
//            Output
//            NO

public class cash_withdrawal {
    public static void main(String[] args) {

        double Ballance1=200;
        double Ballance2=50;


        print(Ballance1);       // Случай когда денег достаточно
        double amount=100;
        withdraw(Ballance1, amount);

        print(Ballance2);       // Случай когда денег достаточно
        amount = 49;
        withdraw(Ballance2,amount);

    }

    private static double withdraw(double remainingFunds, double amountOfCash) {

        System.out.println("Withdrawal amount is: "+ amountOfCash);

        if(remainingFunds -1.05* amountOfCash >=0){
            System.out.println("Operation successful!");
            remainingFunds -=1.05* amountOfCash;
            System.out.println("Balance after transaction is: " + remainingFunds);


            return remainingFunds;
        }
        else System.out.println("Insufficient funds. Sorry.");

        return remainingFunds;
    }

    public static void print(double ball) {
        System.out.println("Current ballance of account is " + ball);
    }


}
