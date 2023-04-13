enum Configuration {
	config1, config2
};

public class Garage {

	String garagename;
	String garageaddress;
	static Configuration configuration;
	int Garagenumberslots;
	private static Garage instance = new Garage();

	public Garage() {
	}

	public static Garage getInstance() {
		return instance;
	}

	public Garage(String garagename, String garageaddress) {
		this.garagename = garagename;
		this.garageaddress = garageaddress;
	}

	public String getGaragename() {
		return garagename;
	}

	public void setGaragename(String garagename) {
		this.garagename = garagename;
	}

	public String getGarageaddress() {
		return garageaddress;
	}

	public void setGarageaddress(String garageaddress) {
		this.garageaddress = garageaddress;
	}

	public void setGaragenumberslots(int n) {
		Garagenumberslots = n;
	};

	public int getGaragenumberslots() {
		return Garagenumberslots;
	}

	public void setConfiguration(Configuration c) {
		configuration = c;
	};

	public Configuration getConfiguration() {
		return configuration;
	};

};
