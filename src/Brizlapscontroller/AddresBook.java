package Brizlapscontroller;

import java.util.Scanner;

import Brizlapsinterface.IAddresbook;
import Brizlapsmodel.Contacts;
import Brizlapsservices.AddresBookImp;

public class AddresBook {
	private static final  Scanner scanner=new Scanner(System.in);
      public static void main(String args[]) {
    	  IAddresbook addresbook=new AddresBookImp();
    	  int i=0;
    	  do {
    		  System.out.println("1 create a contact");
    		  
    		  System.out.println("2 showAlldetails");
    		  System.out.println("3 Search by firstname");
               System.out.println("4 Search by lastname");
    		  System.out.println("5 Update by phone number");
    		  System.out.println("6 Delete by phoneNumber");
    		  System.out.println("Enter your choice");
    		  
    		  int ch=scanner.nextInt();
    		  switch(ch) {
    		  case 1:
    			  System.out.println("create contact");
    			  Contacts contact=getContacts();
    			  addresbook.createContact(contact);
    			  
    		  case 2:
    			  addresbook.showAlldeatils();
    			  
    		  case 3:
    			  System.out.println("Enter the FirstName By searching");
    			  
    			//  System.out.println(contact);
    			  break;
    			  
    		  default:
    			  System.out.println("invalid choice");
    			  break;
    		  }
    		  System.out.println("Do u want to countinue press 1");
    		  i=scanner.nextInt();
    	  }while(i==1);
      }
      private static Contacts getContacts() {
    	  Contacts contacts=new Contacts();
    	  System.out.println("Enter first name");
    	  String firstname=scanner.next();
    	  contacts.setFirstname(firstname);
    	  
    	  
    	  System.out.println("Enter the last Name");
    	  String lastname=scanner.next();
    	  contacts.setLastname(lastname);
    	  
    	  System.out.println("Enter the Address");
    	  String address=scanner.next();
    	  contacts.setAddress(address);
    	  
    	  System.out.println("Enter the city");
    	  String city=scanner.next();
    	  contacts.setCity(city);
    	  
    	  System.out.println("Enter the state ");
    	  String state=scanner.next();
    	  contacts.setState(state);
    	  
    	  System.out.println("Enter the Zip");
    	  int zip=scanner.nextInt();
    	  contacts.setZip(zip);
    	  
    	  System.out.println("Enter the PhoneNumber");
    	  long phonenumber=scanner.nextInt();
    	  contacts.setPhonenumber(phonenumber);
    	  
    	  
    	  System.out.println("Enter the email");
    	  String email=scanner.next();
    	  contacts.setEmail(email);
    	  
    	  return contacts;
    	  
      }
}
