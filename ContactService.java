import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
public class ContactService {
	private ArrayList <Contact> contact_List;
	
	public ContactService () { 
		contact_List = new ArrayList<>();
	}
	public boolean addContact(Contact c) { //adding a contact
		boolean contactExist =false;
		for(Contact l:contact_List) {
			if(l.equals(c)) {
				contactExist = true;
			}
		}
		if(!contactExist) {
			contact_List.add(c);
			return true;
		}
		else {
			throw new InvalidParameterException("Contact already exists");
			
		}
	}
	public boolean deleteContact(String cid) { //check to see if the contact exist
		
		for(Contact l:contact_List) {
			if(l.getContactID().equals(cid)) {
				contact_List.remove(l);
				return true;
				}
		}
		System.out.print("No valid contact to remove.");
		return false;
	}	
			
	
	public boolean updateContact (String cid, String firstName, String lastName, String phone, String address) {
		for(Contact l:contact_List) {
			if(l.getContactID().equals(cid)) {
				if(!firstName.equals("") && !(firstName.length() >10)) {
					l.setFirstName(firstName);
				}
				if(!lastName.equals("") && !(lastName.length() > 10)) {
					l.setLastName(lastName);
				}
				if(!phone.equals("") && !(phone.length() > 10)) {
					l.setPhone(phone);
				}
				if(!address.equals("") && !(address.length () > 30)) {
					l.setAddress(address);
				}
				return true;
			}
		}
		return false;
	}
	

}



