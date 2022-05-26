package abstrac;

public abstract class AbsClass {

	private int height;

	public AbsClass(int height) {
		super();
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public abstract double getBaseArea();

	public double getVolume() {
		return height * getBaseArea();
	}

	public boolean hasGreaterVolume(AbsClass prism) {
		if (this.getVolume() > prism.getVolume())
			return true;
		return false;
	}

}
