package com.Bridgelabz.Day19UserRegistrationRegix;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		UserRegistration userregistration = new UserRegistration();
		System.out.println("Enter the FirstName");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		userregistration.validateFirstName(firstName);
		
	}
}
