// Copyright (C) 2020
// All rights reserved
package vacation_calculator;

public class Travel {
	//CHECKSTYLE:OFF 
	/**
	* main
	*/
	public static void main(String args[]) {
		
		Vacation vacation = new Vacation("New York City", 4, 4);
		
		int price = Calculator.calculateVacation(vacation);
		
		if(price == -1) {
			System.out.print(price);
		}
		
		else {
			System.out.print("\nTotal price of the trip = $" + price);
		}

	}
	//CHECKSTYLE:ON
}