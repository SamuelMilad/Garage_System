import java.util.Date;

public class Vehicle {

	private String modelname;
	private int uniquenumber;
	private int modelyear;
	private int depthV;
	private int widthV;
	private int idslot;
	private static Date arrival;

	public Date getArrival() {
		return arrival;
	}

	public static void setArrival(Date arrival) {
		Vehicle.arrival = arrival;
	}

	public int getIdslot() {
		return idslot;
	}

	public void setIdslot(int idslot) {
		this.idslot = idslot;
	}

	public Vehicle() {
	}

	public Vehicle(String modelname, int modelyear, int depth, int width) {
		this.modelname = modelname;
		this.modelyear = modelyear;
		this.depthV = depth;
		this.widthV = width;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public int getUniquenumber() {
		return uniquenumber;
	}

	public void setUniquenumber(int uniquenumber) {
		this.uniquenumber = uniquenumber;
	}

	public int getModelyear() {
		return modelyear;
	}

	public void setModelyear(int modelyear) {
		this.modelyear = modelyear;
	}

	public int getDepthV() {
		return depthV;
	}

	public void setDepthV(int depth) {
		this.depthV = depth;
	}

	public int getWidthV() {
		return widthV;
	}

	public void setWidthV(int width) {
		this.widthV = width;
	}

}
