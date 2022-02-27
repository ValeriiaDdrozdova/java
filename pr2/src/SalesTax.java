import java.util.Scanner;  // Needed for the Scanner class

/**
   This program calculates the total price which includes
   sales tax.
*/

public class SalesTax
{
   public static void main(String[] args)
   {
      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);


      // Identifier declarations
      final double TAX_RATE = 0.055;
      double price;
      double tax;
      double total;
      String item;


      // Display prompts and get input.
      System.out.print("Item description:  ");
      item = keyboard.nextLine();
      System.out.print("Item price:  $");
      price = keyboard.nextDouble();

      // Perform the calculations.
      tax = price + TAX_RATE;
      total = price * tax;

      // Display the results.
      System.out.print(item + " $");
      System.out.println(price);
      System.out.print(tax + " $");
      System.out.println(tax);
      System.out.print(total + " $");
      System.out.println(total);
   }
}
