//Question No:5

import java.util.Scanner;

class Calculation{
    Scanner scanner =new Scanner(System.in);
    public void add(double x,double y){
        double result = x+y;
        System.out.println("Result: "+result);
    }
    public void sub(double x,double y){
        double result = x-y;
        System.out.println("Result: "+result);
    }

    public void multi(double x,double y){
        double result = x*y;
        System.out.println("Result: "+result);
    }

    public void div(double x,double y){
        if(y !=0){
            double result = x / y;
            System.out.println("Result: " + result);
        }else{
            System.out.println("Cannot Divided by Zero");
        }
    }

    public void return_menu(){
        while (true){
            System.out.print("\nPress 0 to return Main Menu:");
            int return_choice = scanner.nextInt();

            if(return_choice ==0){
                break;
            }else {
                System.out.println("Invalid number!");
            }
        }
    }
}

public class Menu_Driven_Calculator {
    public static void main(String[] args) {
        Calculation c1= new Calculation();
        Scanner scanner = new Scanner(System.in);

        int choice;
        double num1,num2;

        while (true){   //infinite loop for menu
            System.out.println("Menu: ");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for Exit");
            System.out.print("Enter your choice:");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the 1st number:");
                    num1 = scanner.nextDouble();

                    System.out.print("Enter the 2nd number:");
                    num2 = scanner.nextDouble();

                    c1.add(num1,num2);
                    c1.return_menu();
                    break;

                case 2:
                    System.out.print("Enter the 1st number:");
                    num1 = scanner.nextDouble();

                    System.out.print("Enter the 2nd number:");
                    num2 = scanner.nextDouble();

                    c1.sub(num1,num2);
                    c1.return_menu();
                    break;

                case 3:
                    System.out.print("Enter the 1st number:");
                    num1 = scanner.nextDouble();

                    System.out.print("Enter the 2nd number:");
                    num2 = scanner.nextDouble();

                    c1.multi(num1,num2);
                    c1.return_menu();
                    break;

                case 4:
                    System.out.print("Enter the 1st number:");
                    num1 = scanner.nextDouble();

                    System.out.print("Enter the 2nd number:");
                    num2 = scanner.nextDouble();

                    c1.div(num1,num2);
                    c1.return_menu();
                    break;

                case 5:
                    System.out.println("Exiting the program. Thank you!");
                    scanner.close();
                    System.exit(0); //terminate the program

                default:
                    System.out.println("You choose a invalid option\n");
                    c1.return_menu();
                    break;
            }
        }
    }
}
