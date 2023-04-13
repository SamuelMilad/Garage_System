public class Customer {

	String name;
	int phonenumber;
	String Email;

	private Vehicle v = new Vehicle();

	public Customer() {
	}

	public Customer(String name, int phonenumber, String Email, Vehicle V) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.Email = Email;
		this.v = V;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

}
