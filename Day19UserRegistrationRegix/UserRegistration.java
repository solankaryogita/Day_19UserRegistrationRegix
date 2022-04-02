package com.Bridgelabz.Day19UserRegistrationRegix;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	 public static void validateFirstName(String firstName) {
    	String nameRegix = "^[A-Z][a-z]{2,}$";
    	Pattern pattern = Pattern.compile(nameRegix);
    	if(pattern.matcher(firstName).matches()) {
    		System.out.println(" FirstName is Valid");
    	}else
    	{
    		System.out.println("FirstName is Invalid");
    	}
       }
	 
	 public static void validateLastName(String lastname) {
	    	String nameRegix = "^[A-Z][a-z]{2,}$";
	    	Pattern pattern = Pattern.compile(nameRegix);
	    	if(pattern.matcher(lastname).matches()) {
	    		System.out.println(" LastName is Valid");
	    	}else
	    	{
	    		System.out.println("LastName is Invalid");
	    	}
	       }
		 
}
