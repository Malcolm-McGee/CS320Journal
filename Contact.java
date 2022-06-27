import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Contact {

	private static List<String> IDS = new ArrayList<String>();;
	
	/* Fields */
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String Contact;

	public Contact(final String contactID, String firstName, String lastName, String phone, String address) {

		if(contactID == null) {//if null throw error if not proceeds 
			throw new InvalidParameterException("contactID cannot be null.");
		}
		
		if(contactID.length()>10) {//if contactid is greater than 10 characters throw error if not proceed
			throw new InvalidParameterException("contactID cannot be longer than 10 characters.");
		}
		
		if(IDS.contains(contactID)) {//if the contact id is in the contract id library throw error
			throw new InvalidParameterException("contactID must be unique.");
		}

		this.contactID = contactID;
		IDS.add(this.contactID);//sets and adds contact id to contact id library
		
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	}

	public String getContactID() {
		return contactID;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		
		if(firstName == null) {
			throw new InvalidParameterException("firstName can not be null.");
		}
		
		if(firstName.length()>10) {
			throw new InvalidParameterException("firstName can not be longer than 10 characters.");
		}
		
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	

	public void setLastName(String lastName) {
		
		if(lastName == null) {
			throw new InvalidParameterException("lastName can not be null.");
		}
		
		if(lastName.length()>10) {
			throw new InvalidParameterException("lastName can not be longer than 10 characters.");
		}
		
		this.lastName = lastName;
	}
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		
		if(phone == null) {
			throw new InvalidParameterException("phone can not be null.");
		}
		
		if(lastName.length()!=10) {
			throw new InvalidParameterException("phone # must be 10 digits.");
		}
		
		try {
			Long.parseLong(phone);
			this.phone = phone;
		}catch(NumberFormatException e) {
			throw new InvalidParameterException("phone #  must be 10 digits.");
		}
				
	}
	

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		
		if(address == null) {
			throw new InvalidParameterException("address cannot be null.");
		}
		
		if(address.length()>30) {
			throw new InvalidParameterException("address can not be longer than 30 characters.");
		}
		
		this.address = address;
	}
		
}