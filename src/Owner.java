public class Owner extends Account {

	String name;
	int phonenumber;
	String Email;

	public Owner() {
	}

	public Owner(String name, int phonenumber, String Email) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.Email = Email;
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

}
