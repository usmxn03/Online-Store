// This code was created by Usman 2152992

//Start of program

import java.util.Scanner;

public class OnlineStore {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String product;
    int quantity;
    double price;
    double total = 0;

    System.out.println("Welcome to our online store!");
    System.out.println("Here are the products and prices we offer:");
    System.out.println("1 - Milk : £1.00");
    System.out.println("2 - Bread : £1.00");
    System.out.println("3 - Eggs : £2.50");
    System.out.println("4 - PS5 : £549.99");

    // Display list of products and their prices
    
    while (true) {
      System.out.print("Enter the product number you would like to purchase (or 'q' or 'exit' to quit): ");
      product = input.nextLine();
      if (product.equalsIgnoreCase("q") || product.equalsIgnoreCase("exit")) {
        break;
      }

    // Prompt the user to choose a product and quantity until they input 'q' or 'exit'
      
      if (!product.equals("1") && !product.equals("2") && !product.equals("3") && !product.equals("4")) {
        System.out.println("Invalid product number. Please try again.");
        continue;
      }
      
      // Print if user inputs invalid number from the list
      
      System.out.print("Enter the quantity you would like to purchase: ");
      quantity = input.nextInt();

     // Input the quantity of product
     
        switch (product) {
            case "1":
                price = 1.00;
                break;
            case "2":
                price = 1.00;
                break;
            case "3":
                price = 2.50;
                break;
            default:
                price = 549.99;
                break;
        }
      total += price * quantity;
      input.nextLine();
    }
    
    // Total is the price times by the quantity
    
    System.out.printf("Your total is £%.2f. Thank you for shopping with us!\n", total);
    
    // Print the total price along with a message
  }
}

// End of program