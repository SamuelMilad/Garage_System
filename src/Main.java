import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// owner info and garage info
		Garage g = Garage.getInstance();
		AvailableSlots av = new AvailableSlots();
		ArrayList<Slot> st = new ArrayList<Slot>();
		DisplaySlots d = new DisplaySlots();
		g.setConfiguration(Configuration.config1);
		g.setGarageaddress("el salam street ");
		g.setGaragename("btngana");
		g.setGaragenumberslots(4);

		// slots
		Slot s1 = new Slot(1, 8, 10, true);
		Slot s2 = new Slot(2, 5, 4, true);
		Slot s3 = new Slot(3, 9, 15, true);
		Slot s4 = new Slot(4, 7, 17, true);
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		av.setSlot(st);

		// total fees display
		CalculateFees calc = new CalculateFees();
		// customers info and vehicle
		Vehicle v = new Vehicle("Hondai", 1200, 5, 4);
		Vehicle v1 = new Vehicle("kia", 120, 1, 2);
		Vehicle v2 = new Vehicle("jep", 20, 5, 8);
		Vehicle v3 = new Vehicle("tiota", 10, 19, 20);
		Vehicle v4 = new Vehicle("bus", 55, 4, 5);
		Customer c = new Customer("ananas", 01222, "3rabet fwakh", v);
		Customer c1 = new Customer("moza", 01233, "3rabet fwakh", v1);
		Customer c2 = new Customer("manga", 01442, "3rabet fwakh", v2);
		Customer c3 = new Customer("orange", 01452, "3rabet fwakh", v3);
		Customer c4 = new Customer("frawlaa", 01742, "3rabet fwakh", v4);

		ParkingIn pin = new ParkingIn();
		ParkingOut pout = new ParkingOut();

		// display slots
		d.Display();
		pin.Park(c.getV());
		d.Display();
		pout.Park(c.getV());
		d.Display();
		pin.Park(c1.getV());
		pin.Park(c2.getV());
		pin.Park(c3.getV());
		pin.Park(c4.getV());
		d.Display();
		calc.Calculateparkingfees(c.getV());
		// System.out.print(calc.Calculatetotalincome() + "\n");
		// CalculateFees.Displaytotal();

	}
}
