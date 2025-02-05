/**
file: LabProgram.java
* author: Kerry Kong
* class: CS 1400
* assignment: program 2
* date last modified: 9/13/2024
* purpose: This program calculates the cost of hosting three pizza parties on Friday, Saturday and Sunday 
by reading from input the number of people attending, the average number of slices per person and the cost
 of one pizza then outputing the dollar values of pizza costs, tax, delivery, total for each day, and 
 weekend total with two decimals.
*/

import java.util.Scanner;
public class PizzaProgram
{
	/*This method calculates the cost of hosting pizza parties on Friday, Saturday and Sunday 
by reading from input the number of people attending, the average number of slices per person and the cost
 of one pizza then outputing the dollar values of pizza costs, tax, delivery, total for each day, and 
 weekend total with two decimals. */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double weekendTotal = 0.0;

		System.out.println("Friday Night Party \n Enter the number of people attending, the average number of slices per person and the cost one pizza: ");

		int people = scanner.nextInt();
		double avgSlices = scanner.nextDouble();
		double pizzaPrice = scanner.nextDouble();

		int numberPizzas = (int)Math.ceil(people*avgSlices/8); //rounds up to a whole num of pizzas needed
		double costOfPizzas = numberPizzas * pizzaPrice;
		System.out.printf(numberPizzas + " Pizzas: $%.2f\n", costOfPizzas); 

		double tax = costOfPizzas * 0.07;
		double delivery = (costOfPizzas + tax) * 0.2;

		System.out.printf("Tax: $%.2f\n", tax);
		System.out.printf("Delivery: $%.2f\n", delivery);

		double total = costOfPizzas + tax + delivery;
		System.out.printf("Total: $%.2f\n", total / 1.0);
		weekendTotal += total; //add the day's total to the running weekend total

		System.out.println("\nSaturday Night Party \n Enter the number of people attending, the average number of slices per person and the cost one pizza: ");

		people = scanner.nextInt();
		avgSlices = scanner.nextDouble();
		pizzaPrice = scanner.nextDouble();
		
		numberPizzas = (int)Math.ceil(people*avgSlices/8);
		costOfPizzas = numberPizzas * pizzaPrice;
		System.out.printf(numberPizzas + " Pizzas: $%.2f\n", costOfPizzas);

		tax = costOfPizzas * 0.07;
		delivery = (costOfPizzas + tax) * 0.2;

		System.out.printf("Tax: $%.2f\n", tax);
		System.out.printf("Delivery: $%.2f\n", delivery);

		total = costOfPizzas + tax + delivery;
		System.out.printf("Total: $%.2f\n", total / 1.0);
		weekendTotal += total;

		System.out.println("\nSunday Night Party \n Enter the number of people attending, the average number of slices per person and the cost one pizza: ");

		people = scanner.nextInt();
		avgSlices = scanner.nextDouble();
		pizzaPrice = scanner.nextDouble();
		
		numberPizzas = (int)Math.ceil(people*avgSlices/8);
		costOfPizzas = numberPizzas * pizzaPrice;
		System.out.printf(numberPizzas + " Pizzas: $%.2f\n", costOfPizzas);

		tax = costOfPizzas * 0.07;
		delivery = (costOfPizzas + tax) * 0.2;

		System.out.printf("Tax: $%.2f\n", tax);
		System.out.printf("Delivery: $%.2f\n", delivery);

		total = costOfPizzas + tax + delivery;
		System.out.printf("Total: $%.2f\n", total / 1.0);
		weekendTotal += total;

		System.out.printf("\nWeekend Total: $%.2f\n", weekendTotal);
	}

}