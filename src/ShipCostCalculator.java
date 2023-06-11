import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declare Variables
        double cost = 0;
        double SHIPPING_RATE = 0.02;
        double Shipping = 0;
        double totalCost;
        String trash = "";

        // Input and test.
        System.out.print("\nEnter the cost of the item: ");
        if (in.hasNextDouble()) {
            cost = in.nextDouble();
            in.nextLine();  // Clears the buffer

        } else {
            trash = in.nextLine();
            System.out.println("\nYou must enter a valid number not " + trash);
            System.out.println("Rerun the program!");
            System.exit(0);
        }
        //If we make it here the price is valid
        System.out.println("\nYour Item price = " + "\t$" + String.format("%,.2f", cost));
        if (cost > +100) {
            System.out.println("Shipping Cost = " + "\t$ " + String.format("%,.2f", Shipping));
            System.out.println("Your Total Price = " + "\t$" + String.format("%,.2f", cost));
        } else {
            Shipping = cost * SHIPPING_RATE;
            totalCost = cost + Shipping;
            System.out.println("2% Shipping Cost = " + "\t$ " + String.format("%,.2f", Shipping));
            System.out.println("Your Total Price = " + "\t$" + String.format("%,.2f", totalCost));

        }
    }
}