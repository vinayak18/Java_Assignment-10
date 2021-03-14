package assign10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		ContactService cs  = new ContactService();
		List<Contact> contact_list = new ArrayList<Contact>();
		try {
			cs.readContactFromFile(contact_list, "C:\\Users\\VINAYAK\\git\\repository2\\Assignment-10\\src\\assign10\\Contacts.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<String> temp = new ArrayList<String>();
		temp.add("9221332213");
		Contact cont1 = new Contact(10,"Ronak","ronakjain@gmail.com",temp);
		Contact cont2 = new Contact(11,"Manav","Manavb@gmail.com",null);
		// Adding contacts
		cs.addContact(cont1, contact_list);
		cs.addContact(cont2, contact_list);
		
		try {
			// Removing contacts
			cs.removeContact(cont2, contact_list);
			
			// Search by Name
			Contact c1 = cs.searchContactByName("Ronak", contact_list);
			System.out.println("Search Contact By Name --");
			System.out.println("Contact Details: ");
			System.out.println(c1);
			
			//Search by contact number			
			List<Contact> list;
			list = cs.SearchContactByNumber("234", contact_list);
			System.out.println("\nSearch Contact By Number --");
			for(Contact c: list) {
				System.out.println(c.getContactName());
			}
		} catch (ContactNotFoundException e) {
			e.printStackTrace();
		}
		
		// sorting contact list by name
		System.out.println("\nSort Contact by Name : ");
		cs.sortContactByName(contact_list);
		for(Contact c: contact_list) {
			System.out.println(c.getContactName());
		}
		
		
		
	}
}
