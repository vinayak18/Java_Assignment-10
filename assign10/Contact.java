package assign10;

import java.util.List;

public class Contact {
	private int contactId;
	private String contactName;
	private String email;
	List<String> contactNumber;
	
	public Contact() {
		
	}

	public Contact(int contactId, String contactName, String email, List<String> contactNumber) {
		this.contactId = contactId;
		this.contactName = contactName;
		this.email = email;
		this.contactNumber = contactNumber;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(List<String> contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", email=" + email
				+ ", contactNumber=" + contactNumber + "]";
	}
	
	
}
