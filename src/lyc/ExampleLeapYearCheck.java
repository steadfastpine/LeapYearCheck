/*
# Author: Scott Forsberg
# Contact: contact.scottforsberg@gmail.com
# Release Date: 2019-07-15
# Version: .1
 */

package lyc;

public class ExampleLeapYearCheck {

	public static void main(String[] args) {
		
		LeapYearCheck lyc = new LeapYearCheck();

		System.out.println("\nChecking year 1492, returning 1 for yes, 0 for no");		
		System.out.println(lyc.check(1492));	
		System.out.println("\nChecking year 1492, returning text feedback");		
		System.out.println(lyc.checkInteractive(1492));	
		System.out.println("\nChecking year 1491, returning 1 for yes, 0 for no");		
		System.out.println(lyc.check(1491));	
		System.out.println("\nChecking year 1491, returning text feedback");		
		System.out.println(lyc.checkInteractive(1491));	
	}
	
}
