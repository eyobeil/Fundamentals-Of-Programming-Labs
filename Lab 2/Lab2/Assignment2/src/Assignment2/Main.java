package Assignment2;

public class Main {

	public static void main(String[] args) {
		Address cus1Billing = new Address("380 Euclid Ave", "Chicago", "IL", "60290");
		Address cus1Shipping = new Address("1234 Harrison Ave", "Chicago", "IL", "60602");
		Address cus2Billing = new Address("3221 Hamilton St", "Columbus", "OH", "43005");
		Address cus2Shipping = new Address("2210 East Broad Street", "Columbus", "OH", "42333");
		Customer customer1= new Customer("Abraham","Nelson","456-221-2121");
		Customer customer2= new Customer("Brunno", "Alves","123-432-3421");
		customer1.setBillingAddress(cus1Billing);
		customer1.setShippingAddress(cus1Shipping);
		customer2.setBillingAddress(cus2Billing);
		customer2.setShippingAddress(cus2Shipping);
		Customer[] customers= new Customer[2];
		customers[0]=customer1;
		customers[1]=customer2;
		for(int i = 0; i < customers.length; ++i) {
			Address cityAddress = customers[i].getBillingAdress();
			String city=cityAddress.getCity();
			if(city.equals("Chicago")) {
				System.out.println("The following Customer's Billing Adress is  in Chicago\n"+customers[i].toString());
			}
		}
		
	}

}
