public class DisplaySlots extends AvailableSlots {
	public void Display() {

		if (getSlot() != null) {
			if (Availability()) {
				for (int i = 0; i < getSize(); i++) {
					if (getSlot().get(i).isAvailable()) {
						System.out.print("slot no " + getSlot().get(i).getId());
						System.out.print(": " + getSlot().get(i).getDepth()
								+ " " + getSlot().get(i).getWidth());
						System.out.print("\n");
					}
				}
				System.out.print("\n");
			} else
				System.out.print("There is no avaialable slots \n");
		} else
			System.out.print("The owner did not add slots for this garage \n");

	}

}
