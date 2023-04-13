public class Slot extends Garage {

	private int id;
	private int depth;
	private int width;
	private static Slot instance = null;
	private boolean available;

	public Slot() {

	};

	public static Slot getInstance() {
		if (instance == null) {
			instance = new Slot();
		}
		return instance;
	}

	public Slot(int id, int depth, int width, boolean available) {
		super();
		this.id = id;
		this.depth = depth;
		this.width = width;

		this.available = available;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
