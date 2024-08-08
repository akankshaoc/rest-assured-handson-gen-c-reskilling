package Sources;

public class VegStore {
	
	String customerEmail , customerMobile, customerName, customerPassword, customerUsername, customeraddress;
	int customerId;
	
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerPassword() {
		return customerPassword;
	}	 	  	      	  	      	  	    	    	 	
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	public String getCustomerUsername() {
		return customerUsername;
	}
	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}
	
	public String getCustomerAddress() {
		return customeraddress;
	}
	public void setCustomerAddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	
	public VegStore(int customerId, String customerName,String customerMobile, String customerEmail, String customeraddress, String customerUsername, String customerPassword) {
		super();
		this.customerEmail = customerEmail;
		this.customerId = customerId;
		this.customerMobile = customerMobile;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerUsername = customerUsername;
		this.customeraddress = customeraddress;

	}
	public VegStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {	 	  	      	  	      	  	    	    	 	
		return "VegStore [customerEmail=" + customerEmail + ", customerId=" + customerId + ", customerMobile=" + customerMobile + ", customerName="
				+ customerName + ", customerPassword=" + customerPassword + ", customerUsername=" + customerUsername + "]";
	}
}
