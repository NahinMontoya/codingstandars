// Copyright (C) 2020
// All rights reserved
package vacation_calculator;

import java.util.Map;
import java.util.HashMap;

public class Calculator {

	 /**
    * vacation
    */
	public static int calculateVacation(Vacation vacation) {
		
		Map<String, Integer> popularPlaces = new HashMap<String, Integer>();
		popularPlaces.put("Paris", 500);
		popularPlaces.put("New York City", 600);
		
		int baseCost = 1000;
		
		System.out.print("**** TRAVEL ****\n");
		//if the group is more than 80 people
		System.out.print("Destination: " + vacation.getDestination() + "    numberTravelers: " + vacation.getNumberTravelers()
		+ "    DaysDuration: " + vacation.getDaysDuration() + "\n\n");
		
		if( vacation.getNumberTravelers() >= 80 ) {
			
			System.out.print("The vacation package is not available for groups of 80 or more people\n");
			
			return -1;
			
		}
		
		else {
			
			if( !(vacation.getDestination() instanceof String) ) {
				System.out.print("Destination must be a string");
				return -1;
			}
			
			if( !((Object)vacation.getNumberTravelers() instanceof Integer) ) {
				System.out.print("NumberTravelers must be a int");
				return -1;
			}
			
			if( !((Object)vacation.getDaysDuration() instanceof Integer) ) {
				System.out.print("DaysDuration must be a int");
				return -1;
			}
			
			System.out.print("Base price = $1000\n\n");
			
			//If the destination is a popular tourist spot
			if( popularPlaces.containsKey(vacation.getDestination()) ) {
				baseCost = baseCost + popularPlaces.get(vacation.getDestination());
				System.out.print("Popular Tourist Spot +$" + 
						popularPlaces.get(vacation.getDestination()) + " = $ " + baseCost + "\n");
			}
			
			//if the number of travelers is more than 4, but less than 10
			if( ( vacation.getNumberTravelers() >= 4 ) && ( vacation.getNumberTravelers() < 10 )) {
				baseCost = (int)((float)baseCost*0.9);
				System.out.print("Travelers are more than or equal to 4 but less than 10 therefore 10% discount applies = $" + baseCost + "\n");
			}
			
			//If the number of travelers is more than 10
			if( vacation.getNumberTravelers() >= 10 ) {
				baseCost = (int)((float)baseCost*0.8);
				System.out.print("Travelers Travelers are more than 10 therefore 20% discount applies= $" + baseCost + "\n");
			}
			
			//If the duration of the vacation is less than 7 days
			if( vacation.getDaysDuration() < 7 ) {
				baseCost = baseCost + 200;
				System.out.print("Duration of vacation less than 7 days is increased by $ 200  = $" + baseCost + "\n");
			}
			
			//If the duration of the vacation is more than 30 days or the number of passengers is 2
			if( ( vacation.getDaysDuration() >= 30 ) || ( vacation.getNumberTravelers() == 2 ) ) {
				baseCost = baseCost - 200;
				System.out.print("2 travelers or vacations of 30 or more days  = $" + baseCost + "\n");
			}
			
			return baseCost;
			
		}
	}

}