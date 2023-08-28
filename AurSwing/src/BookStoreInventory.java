//Question No:3

import java.util.Scanner;
public class BookStoreInventory{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays to store book names and prices
        String[] bkNames=new String[10];
        double[] bkPrices=new double[10];

        for (int i=0;i<bkNames.length;i++){       // Allow user to input book names and prices
            System.out.print("Enter the name of book "+(i+1)+": ");
            bkNames[i]=scanner.nextLine();

            System.out.print("Enter the price of book "+(i+1)+": ");
            bkPrices[i]=scanner.nextDouble();

            scanner.nextLine();   // Consume newline character
        }
        // Display book names and prices
        System.out.println("Book Store Inventory: ");
        for (int i=0;i<10;i++){
            System.out.println("Book Name "+(i+1)+": "+bkNames[i]+" Price$- "+bkPrices[i]);
        }

        // Calculate and display total cost of all books
        double totalCost=0;
        for (int i=0;i<bkPrices.length;i++){
            totalCost += bkPrices[i];
        }
        System.out.println("Total cost of all Books: "+totalCost);
    }
}
