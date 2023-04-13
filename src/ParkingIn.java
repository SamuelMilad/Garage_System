import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ParkingIn extends AvailableSlots implements Parking {
	static boolean parkout = false;
	static boolean parkin = false;

	public ParkingIn() {

	}

	@Override
	public void Park(Vehicle v) {
		MarkTime(v);
		parkin = true;
		parkout = false;

	}

	public Date MarkTime(Vehicle v) {
		if (Availability()) {

			reserve_slot(v);
			SimpleDateFormat dateFormat = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			// System.out.println("Current Date " + dateFormat.format(date));
			dateFormat.format(date);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			Date currentDatePlusOne = c.getTime();

			Vehicle.setArrival(currentDatePlusOne);
			return currentDatePlusOne;
		}

		return null;

	}

}
