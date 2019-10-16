//Header
//Program: Chapter 2 exercise 3
//Author: David Girard
//Class: cs160 Fall 2019
//Date: 10/15/2019
//Description: Show how much time has passed in seconds.
	//Show how much time remains in seconds.
	//show the percentage of time that has passed.
	//Show how much time has elapsed since starting on this project.

package time.java;

public class time {

	public static void main(String[] args) {
		
			int hour = 18;	
			int minute = 22;
			int second = 0;	//6:22 p.m.
			
		System.out.print("number of seconds since midnight: ");
		System.out.println((hour * 60 * 60) + (minute* 60) + second);
			double mytime = (hour * 60 * 60) + (minute* 60) + second;	//mytime = number of seconds since midnight
		System.out.print("number of seconds until midnight: ");
		System.out.println((24 * 60 * 60) - (hour * 60 * 60) - (minute * 60)); 
		 	double maxtime = 24 * 60 * 60; 					//maxtime = number of seconds for a day
		System.out.print("percentage of time that has passed: ");
	    System.out.println(mytime/maxtime);
	    
	  	  	int hour1 = 19;
	    		int minute1 = 4;
	    		int second1 = 30; //7:04 p.m.
	    	
	    System.out.print("Amount of elapsed time in seconds: ");
	    System.out.println((hour1 *60 * 60) + (minute1 *60) + second1 
	    		- (mytime));

	    		
		   
	}

}
/* Footer
 * number of seconds since midnight: 66120
 *number of seconds remaining till midnight: 20280
 *percentage of time that has passed: 0.7652777777777777
 *Amount of elapsed time in seconds: 2550.0
 */
