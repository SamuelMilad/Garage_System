import java.util.ArrayList;

public class AvailableSlots extends Slot {

	private static ArrayList<Slot> slot = new ArrayList<Slot>();

	private static boolean available;
	private Vehicle v = new Vehicle();

	public AvailableSlots() {
	}

	public ArrayList<Slot> getSlot() {
		return slot;
	}

	public void setSlot(ArrayList<Slot> slot) {
		AvailableSlots.slot = slot;
	}

	public int getSize() {
		return slot.size();
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public static boolean Availability() {
		available = false;
		for (int i = 0; i < slot.size(); i++) {
			if (slot.get(i).isAvailable()) {
				available = true;
			}
		}
		return available;
	}

	public void reserve_slot(Vehicle vehicle) {// Vehicle vehicle

		available = true;
		if (Configuration.config1 == getConfiguration()) {
			for (int i = 0; i < getSlot().size(); i++)
				if (getV().getDepthV() <= getSlot().get(i).getDepth()
						&& getV().getWidthV() <= getSlot().get(i).getWidth()
						&& getSlot().get(i).isAvailable() && available) {
					getSlot().get(i).setAvailable(false);
					available = false;
					System.out.print("Please take slot no: "
							+ getSlot().get(i).getId() + " (dep="
							+ getSlot().get(i).getDepth() + "  wid="
							+ getSlot().get(i).getWidth() + ")\n" + "\n");
					vehicle.setIdslot(getSlot().get(i).getId());
				}
		} else {

			int id = 0;
			for (int i = 0; i < getSlot().size(); i++)
				if (getV().getDepthV() <= getSlot().get(i).getDepth()
						&& getV().getWidthV() <= getSlot().get(i).getWidth()
						&& getSlot().get(i).isAvailable() && available) {
					id = getSlot().get(i).getId();

					available = false;
				}
			for (int i = id; i < getSlot().size(); i++) {
				int temp = getSlot().get(id).getWidth()
						* getSlot().get(id).getDepth();
				if (getV().getDepthV() * getV().getWidthV() <= getSlot().get(i)
						.getDepth() * getSlot().get(i).getWidth()

						&& getSlot().get(i).isAvailable()
						&& temp > getSlot().get(i).getWidth()
								* getSlot().get(i).getDepth()) {
					temp = getSlot().get(i).getWidth()
							* getSlot().get(i).getDepth();
					id = getSlot().get(i).getId();
				}

			}
			getSlot().get(id).setAvailable(false);
			System.out.print("Please take slot no: "
					+ getSlot().get(id).getId() + " (dep="
					+ getSlot().get(id).getDepth() + "  wid="
					+ getSlot().get(id).getWidth() + ")" + "\n");
			vehicle.setIdslot(getSlot().get(id).getId());
			available = false;
		}
	}

	public void return_slot(Vehicle vehicle) {// Vehicle vehicle

		for (int i = 0; i < getSlot().size(); i++) {
			if (vehicle.getIdslot() == getSlot().get(i).getId()) {
				getSlot().get(i).setAvailable(true);
			}
		}
	}

	public void Park(Vehicle v) {

	}

}
