import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalculateFees extends ParkingOut implements Parking {
	static long Total_incom = 0;

	public CalculateFees() {

	}

	public long Calculateparkingfees(Vehicle v) {

		Date start_date = v.getArrival();
		Date end_date = MarkTime(v);

		Date d1 = start_date;
		Date d2 = end_date;
		long difference_In_Time = d2.getTime() - d1.getTime();

		// System.out.print(d2.getTime() + "end\n");
		// System.out.print(d1.getTime() + "start\n");

		long difference_In_Seconds = TimeUnit.MILLISECONDS
				.toSeconds(difference_In_Time) % 60;

		long difference_In_Minutes = TimeUnit.MILLISECONDS
				.toMinutes(difference_In_Time) % 60;

		long difference_In_Hours = TimeUnit.MILLISECONDS
				.toHours(difference_In_Time) % 24;

		long difference_In_Days = TimeUnit.MILLISECONDS
				.toDays(difference_In_Time) % 365;

		long difference_In_Years = TimeUnit.MILLISECONDS
				.toDays(difference_In_Time) / 365l;
		long hours = difference_In_Years * 365 * 24 + difference_In_Days * 24
				+ difference_In_Hours;

		// System.out.print("Difference " + "between two dates is: ");
		//
		// System.out.println(difference_In_Years + " years, "
		// + difference_In_Days + " days, " + difference_In_Hours
		// + " hours, " + difference_In_Minutes + " minutes, "
		// + difference_In_Seconds + " Seconds");

		if (difference_In_Minutes > 0 || difference_In_Seconds > 0) {
			hours = hours + 1;
		}
		long parking_fees = (hours * 5);
		Total_incom = Total_incom + parking_fees;

		return parking_fees;
	};

	public long Calculatetotalincome() {
		return Total_incom;
	};

	public void Displaytotal() {
		System.out.print(Calculatetotalincome());
	}

}
