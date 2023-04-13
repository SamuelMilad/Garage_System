import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ParkingOut extends ParkingIn implements Parking {

	ParkingIn pin = new ParkingIn();

	@Override
	public Date MarkTime(Vehicle v) {

		return_slot(v);
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		// System.out.println("Current Date " + dateFormat.format(date));
		dateFormat.format(date);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		Date currentDatePlusOne = c.getTime();

		return currentDatePlusOne;
	}

	@Override
	public void Park(Vehicle v) {
		parkin = false;
		parkout = true;
		MarkTime(v);
	}

};
