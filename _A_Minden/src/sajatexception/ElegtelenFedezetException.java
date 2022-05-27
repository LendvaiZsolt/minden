package sajatexception;

public class ElegtelenFedezetException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double hianyzoossz;

	public ElegtelenFedezetException(double hianyzoossz) {
		super();
		this.hianyzoossz = hianyzoossz;
	}

	public double getHianyzoossz() {
		return hianyzoossz;
	}

}
