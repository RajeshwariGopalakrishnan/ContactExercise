package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.model.Contact;

public class Main {
	static ArrayList<Contact> listOfContacts = new ArrayList<Contact>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selection;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of contacts you want add");
		int nOfCon = input.nextInt();
		for(int i=0; i < nOfCon; i++) {
		addContact();
		}
		Collections.sort(listOfContacts);
		System.out.println(listOfContacts);
		
	}
	
	private static void addContact() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name of the contact");
		String strFirstName = input.nextLine();
		System.out.println("Enter last name of the contact");
		String strLastName = input.nextLine();
		System.out.println("Enter the phoneNumber of contact");
		String strPhoneNumber = input.nextLine();
		System.out.println("Enter the address of contact");
		String strAddress = input.nextLine();
		Contact newContact = new Contact();
		newContact.firstName=strFirstName;
		newContact.lastName=strLastName;
		newContact.phoneNumber=strPhoneNumber;
		newContact.address=strAddress;
		System.out.println("Your Current Entry has been made as below ");
		System.out.println(newContact.toString());
		listOfContacts.add(newContact);
	}

}
