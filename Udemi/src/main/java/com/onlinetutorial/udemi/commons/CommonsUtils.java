package com.onlinetutorial.udemi.commons;

import java.util.Date;
import java.util.Random;

public class CommonsUtils {
	
	public static  Long getRandomNumber() {
		 Random random=new Random();
		  
		  //Random method called for integer values with fixed value.
		   return (long) random.nextInt(1000000);
	}
	
	public static  long diffBetwnDateInMinute(Date oldDate , Date currentDate) {
		
		long diff = currentDate.getTime() - oldDate.getTime();
		
		return diff / (60 * 1000) % 60;
		
	}

}
