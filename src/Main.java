// Kaden Jain
// Computer Programming 1 - Spring 2025
// Purpose: Given the price of a purchase the program computes and outputs a 5% sales tax

public class Main {
    public static void main(String[] args) {

        // declare variables
        double itemPrice = 35;
        double TAX_RATE = 0.05;

        // logic
        double salesTax = itemPrice * TAX_RATE;

        // print output
        System.out.println("The sales tax of your item is: $" + salesTax);

    }
}