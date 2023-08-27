//Question No.8

import java.util.Scanner;

class Bank_calculation{
    Scanner scanner = new Scanner(System.in);

    public void checkBalance(double b){
        System.out.println("Your Current Balance is: $"+b);
    }
    public double depositBalance(double cbalance,double depositB ){
        cbalance = cbalance+depositB;
        System.out.println("Amount Deposit Successfully\n");
        return cbalance;
    }
    public double withdrawBalance(double cBalance , double withdrawB){
        if(withdrawB <= cBalance){
            cBalance = cBalance - withdrawB;
            System.out.println("Amount Withdraw Successfully\n");
        }else {
            System.out.println("Insufficient Balance\n");
        }
        return cBalance;
    }

    public void return_menu(){
        while (true){
            System.out.print("\nPress 0 for Main Menu:");
            int return_choice = scanner.nextInt();

            if(return_choice ==0){
                break;
            }else {
                System.out.println("Invalid number!\n");
            }
        }
    }


}

public class Simple_Banking_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank_calculation bc1 = new Bank_calculation();

        double balance,deposit,withdraw;

        balance = 1000.00;   //initial balance
        int choice;

        while (true){
            System.out.println("Menu: ");
            System.out.println("Press 1 for Check Balance");
            System.out.println("Press 2 for Deposit Money");
            System.out.println("Press 3 for Withdraw Money");
            System.out.println("Press 4 for Exit");
            System.out.print("Enter your choice:");

            choice  = scanner.nextInt();

            switch (choice){
                case 1:
                    bc1.checkBalance(balance);
                    bc1.return_menu();
                    break;
                case 2:
                    System.out.print("Enter the amount to Deposit: $");
                    deposit = scanner.nextDouble();

                    balance = bc1.depositBalance(balance,deposit);
                    bc1.return_menu();
                    break;
                case 3:
                    System.out.print("Enter the amount to Withdraw: $");
                    withdraw = scanner.nextDouble();

                    balance = bc1.withdrawBalance(balance,withdraw);
                    bc1.return_menu();
                    break;
                case 4:
                    System.out.println("Exiting the Program.Thank You\n");
                    System.exit(0);
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid choice.Plz try again!\n");
                    bc1.return_menu();
                    break;
            }
        }

    }
}
