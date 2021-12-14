

          _____        _____                    _____          
         /\    \      |\    \                  /\    \         
        /::\____\     |:\____\                /::\    \        
       /:::/    /     |::|   |               /::::\    \       
      /:::/    /      |::|   |              /::::::\    \      
     /:::/    /       |::|   |             /:::/\:::\    \     
    /:::/    /        |::|   |            /:::/  \:::\    \    
   /:::/    /         |::|   |           /:::/    \:::\    \   
  /:::/    /          |::|___|______    /:::/    / \:::\    \  
 /:::/    /           /::::::::\    \  /:::/    /   \:::\    \ 
/:::/____/           /::::::::::\____\/:::/____/     \:::\____\
\:::\    \          /:::/~~~~/~~      \:::\    \      \::/    /
 \:::\    \        /:::/    /          \:::\    \      \/____/ 
  \:::\    \      /:::/    /            \:::\    \             
   \:::\    \    /:::/    /              \:::\    \            
    \:::\    \   \::/    /                \:::\    \           
     \:::\    \   \/____/                  \:::\    \          
      \:::\    \                            \:::\    \         
       \:::\____\                            \:::\____\        
        \::/    /                             \::/    /        
         \/____/                               \/____/         
                                                               



Leap Year Check



# Contact: https://www.linkedin.com/in/steadfastpine/

# Release Date: 2019-07-15
# Version: .1



Description

	Check if a given year is considered a leap year.



Prerequisites

	Java Virtual Machine



Installation

	Download and unzip the program files, then change working directory to them:
	
		# cd LeapYearCheck


	Compile the .java files into Java bytecode with javac

		# javac LeapYearCheck.java
		# javac ExampleLeapYearCheck.java


	Run the Example file to see a live demonstration of the class in use

		# java ExampleLeapYearCheck.java



Methods

	checkInteractive(int year)
	// Method to return response as interactive text

		public String


	public int check(int year) 
	// Method to return response as 1/0 for yes/no

		public int	



Example Usage
	
	LeapYearCheck lyc = new LeapYearCheck();

	System.out.println("\nChecking year 1492, returning 1 for yes, 0 for no");		
	System.out.println(lyc.check(1492));	
	System.out.println("\nChecking year 1492, returning text feedback");		
	System.out.println(lyc.checkInteractive(1492));	
	System.out.println("\nChecking year 1491, returning 1 for yes, 0 for no");		
	System.out.println(lyc.check(1491));	
	System.out.println("\nChecking year 1491, returning text feedback");		
	System.out.println(lyc.checkInteractive(1491));	



License 

	This program is licensed under the GPL License, view the LICENSE.md file for more information.














