import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		ArrayList<ContactInformation> contacts = new ArrayList<>();
		ContactInformation c = new ContactInformation();
		
		
		int option = 0;
		
		
		
		
		do {							
			System.out.print("Please enter your choice: \n");
			System.out.println("1. Add");
			System.out.println("2. Search");
			System.out.println("3. Delete ");		
			System.out.println("4. Exit");
			option = input.nextInt();
			
			switch(option) {
			
			case 1:
								
								
				Address a = new Address();
				//setting instances for the contact inform class
				
				System.out.println("Enter your First Name : ");				
				c.setFirstName(inputString.nextLine());
				System.out.println("Enter your Last Name : ");
				c.setLastName(inputString.nextLine());				
				System.out.println("Enter your phone number : ");
				c.setPhoneNumber(inputString.nextLine());
				// setting instances for the address class
				
				
				
				System.out.println("Enter your street : ");				
				a.setStreet(inputString.nextLine());
				System.out.println("Enter your city :");
				a.setCity(inputString.nextLine());
				System.out.println("Enter your state : ");
				a.setState(inputString.nextLine());
				System.out.println("Enter your zipcode : ");
				a.setZip(inputString.nextLine());
				
				c.setAddress(a);
				System.out.println(contacts.add(c));
				
				if(!contacts.add(new ContactInformation())) {
					System.out.println("No entry added");
				}
				else
				
				contacts.add(c);
				System.out.println(c);
				break;			
										
								
			case 2:
				System.out.println("1. Find with Firstname");
		        System.out.println("2. Find with Lastname");

		        String optionTwo;
		        do {
		            optionTwo = inputString.nextLine();
		            switch (option) {
		                case 1:
		                    findByFirstName();
		                    break;
		                case 2:
		                    findByLastname();
		                    break;
		                default:
		                    
		            }
		        } while (!optionTwo.equals(1) && !optionTwo.equals(2));
		        System.out.println();
		        menu();
		                    
		           
			case 3:
				
				System.out.println("Enter entry to delete : ");	
				String d = input.nextLine();
				
				if(contacts.size()== 0) {
					
					System.out.println("Invalid Input");
				}else
					
					contacts.remove(d);
						
				
				break;
				
			case 4:
														
				
				break;
				
			default:
				System.out.println("Invalid Entry ");
				break;
				
				
				
			
			
			
			}
		}
		while (option!=4);
			
		
		
			

	
	}

	private static void menu() {
		// TODO Auto-generated method stub
		
	}

	private static void findByLastname() {
		// TODO Auto-generated method stub
		
	}

	private static void findByFirstName() {
		// TODO Auto-generated method stub
		
	}

 }
			
