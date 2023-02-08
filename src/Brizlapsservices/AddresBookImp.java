package Brizlapsservices;

import Brizlapsinterface.IAddresbook;
import Brizlapsmodel.Contacts;

public class AddresBookImp implements IAddresbook {

private static Contacts[] createArray=new Contacts[10];
	public int createContact(Contacts contact) {
		System.out.println(" AddresBookImp::IAddresbook::Contacts");
		int index=checkArrayEmpty();
		System.out.println("index"+index);
		System.out.println(contact);
		createArray[0]=contact;
		return 0;
	}
	
	private int checkArrayEmpty() {
		for(int i=0;i<createArray.length;i++) {
			if(createArray==null) {
				return i;
			}
		}
		
		return 0;
      }

	public void showAlldeatils() {
		for(int i=0;i<createArray.length;i++) {
			System.out.println(createArray[i]);
		}
		
	}

	public void searchByFirstName() {
		for(int i=0;i<createArray.length;i++) {
			if([createArray]%2==0) {
			return 0;	
			}
		}
		
	}
       
}
