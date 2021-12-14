/*
# Author: Scott Forsberg
# Contact: contact.scottforsberg@gmail.com
# Release Date: 2019-07-15
# Version: .1
 */

package lyc;

public class LeapYearCheck {

	private int leapStatus;

	// Constructor, set initial data values
	public LeapYearCheck() {
		leapStatus = 0;
	}

	// Method to return response as interactive text
	public String checkInteractive(int year) {
		
		if (this.checkDate(year) == 1) {
			return "Leap Year";
		}
		
		if (this.checkDate(year) == 0) {
			return "Not a Leap Year";
		}
		return null;
	}
	
	// Method to return response as 1/0 for yes/no
	public int check(int year) {
		return this.checkDate(year);
	}
	
	// Internal method to check if the entered year is a leap year
	private int checkDate(int year) {
		
		// Reset check status
		leapStatus = 0;
		
		// It is a leap year if the year is evenly divisible by 4, but not by 100
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				leapStatus = 1;
			}		
		}
		
		// A year that is divisible by both 4 and 100 is a leap year if it is also divisible by 400
		if (year % 400 == 0) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					leapStatus = 1;
				}		
			}
		}
		
		// Return the status as 1/0
		return leapStatus;
	}
	
}
