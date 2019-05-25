package Assignment2;

public class Customer {
	private String firstName;
	private String lastName;
	private String socSecurityNo;
	private Address billingAdress;
	private Address shippingAdress;
	public Customer(String firstName, String lastName, String socSecurityNo) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.socSecurityNo=socSecurityNo;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getSocSecurityNo() {
		return this.socSecurityNo;
	}
	public void setSocSecurityNo(String socSecurityNo) {
		this.socSecurityNo=socSecurityNo;
	}
	public Address getBillingAdress() {
		return this.billingAdress;
	}
	public void setBillingAddress(Address billingAddress ) {
		this.billingAdress=billingAddress;
	}
	public Address getShippingAdress() {
		return this.shippingAdress;
	}
	
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAdress=shippingAddress;
	}
	
	public String toString() {
		return "[" + firstName + " ," + lastName + " ,"  +"ssn: "+socSecurityNo+ "]";
	}

	public static void main(String[] args) {
	
		

	}

}
