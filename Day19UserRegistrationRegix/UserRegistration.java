package com.Bridgelabz.Day19UserRegistrationRegix;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	 public static void validateFirstName(String firstName) {
    	String nameRegix = "^[A-Z][a-z]{2,}$";
    	Pattern pattern = Pattern.compile(nameRegix);
    	if(pattern.matcher(firstName).matches()) {
    		System.out.println("Valid");
    	}else
    	{
    		System.out.println("Invalid");
    	}
       }
}
