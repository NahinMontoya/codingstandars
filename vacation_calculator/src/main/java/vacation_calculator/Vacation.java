// Copyright (C) 2020
// All rights reserved
package vacation_calculator;

public class Vacation {

	private String Destination;
	private int  numberTravelers;
	private int daysDuration;
	
	/**
	 * vacation
	 */
	public Vacation(String destination, int numberTravelers, int daysDuration){
		this.Destination = destination;
		this.numberTravelers = numberTravelers;
		this.daysDuration = daysDuration;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getNumberTravelers() {
		return numberTravelers;
	}

	public void setNumberTravelers(int numberTravelers) {
		this.numberTravelers = numberTravelers;
	}

	public int getDaysDuration() {
		return daysDuration;
	}

	public void setDaysDuration(int daysDuration) {
		this.daysDuration = daysDuration;
	}

	@Override
	public String toString() {
		return "Vacation [Destination=" + Destination + ", numberTravelers=" + numberTravelers + ", daysDuration="
				+ daysDuration + ", getDestination()=" + getDestination() + ", getNumberTravelers()="
				+ getNumberTravelers() + ", getDaysDuration()=" + getDaysDuration() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
